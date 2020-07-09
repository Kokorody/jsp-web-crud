/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;

/**
 *
 * @author kiddy
 */
public class MainQuery {
    public String get = "SELECT * FROM products";
    public String create = "INSERT INTO products (name, "
            + "category, qty, expired_at) VALUES (?,?,?,?)";
}
