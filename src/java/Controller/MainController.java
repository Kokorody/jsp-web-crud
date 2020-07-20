/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MainModel;
import Query.MainQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kiddy
 */
public class MainController extends BaseController {
    MainQuery query = new MainQuery();
    ArrayList arrayList = new ArrayList();
    
    public ArrayList get() throws SQLException {
        String query = this.query.get;
        ResultSet rs = this.get(query);
        
        while (rs.next()) {
            MainModel model = new MainModel();
            model.setId(rs.getString("id"));
            model.setName(rs.getString("name"));
            model.setCategory(rs.getString("category"));
            model.setExpired_at(rs.getString("expired_at"));
            model.setQty(rs.getInt("qty"));
            
            arrayList.add(model);
        }
        
        return arrayList;
    }
    
    public MainModel show(String id) throws SQLException {
        MainModel model = new MainModel();
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
           
        String sql = this.query.show;
        ResultSet rs = this.getWithParameter(map, sql);
        
        if(rs.next()){
            model.setId(rs.getString("id"));
            model.setName(rs.getString("name"));
            model.setCategory(rs.getString("category"));
            model.setExpired_at(rs.getString("expired_at"));
            model.setQty(rs.getInt("qty"));
        }
        
        return model;
    }
    
    public boolean create(MainModel model) throws SQLException{
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getCategory());
        map.put(3, model.getQty());
        map.put(4, model.getExpired_at());
           
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
    
    public boolean update(MainModel model) throws SQLException{
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getCategory());
        map.put(3, model.getQty());
        map.put(4, model.getExpired_at());
        map.put(5, model.getId());
           
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    
    public boolean delete(MainModel model){
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getId());
           
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }
}
