/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1td;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TPC
 */
public class Acces {
    private int id,code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
       public void authentifier() throws SQLException
    {
      Connexion c = new Connexion(); //appel de connexion à la BD
        PreparedStatement pst; 
        pst = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM acces WHERE code='"+this.getCode()+"'"); // lister les admins
        pst.executeQuery(); // lister les admins
        ResultSet rs = (ResultSet) pst.executeQuery(); // stocker le résultat dans un resultset
        if(rs.next()) {
            System.out.println("votre code"+this.getCode()+" est correcte"); //teste d’affichage
           
        }
        else
    System.out.println("votre code"+this.getCode()+" est incorrecte");    
    
    }
    
    
}
