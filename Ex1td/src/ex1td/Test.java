/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1td;

import java.sql.SQLException;

/**
 *
 * @author TPC
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        //Connexion c=new Connexion();
        Acces ac=new Acces();
        ac.setCode(123);
        Acces ac2=new Acces();
        ac2.setCode(456);
        ac.authentifier();
        ac2.authentifier();
    }
    
}
