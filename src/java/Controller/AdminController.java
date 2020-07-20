/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AdminModel;
import Model.MainModel;
import Query.AdminQuery;
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
public class AdminController extends BaseController {
    AdminQuery query = new AdminQuery();
    ArrayList arrayList = new ArrayList();
    
    public ArrayList login(AdminModel model) throws SQLException{
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getUsername());
           
        String sql = this.query.login;
        
        ResultSet rs = this.getWithParameter(map, sql);
        while(rs.next()){
            String pass = rs.getString("password");
            boolean check = model.getPassword().equals(pass);
            if(check){
                this.arrayList.add(rs.getString("id"));
                this.arrayList.add(rs.getString("name"));
                this.arrayList.add(rs.getString("username"));
            }
        } 
        
        return this.arrayList;
    }
}
