/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TPC
 */
public class Employee {
    private int id;
    private String nom,grade,login,mdp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Employee(int id, String nom, String grade, String login, String mdp) {
        this.id = id;
        this.nom = nom;
        this.grade = grade;
        this.login = login;
        this.mdp = mdp;
    }

    public Employee(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }

    public Employee() {
    }
    
    
    
    
     public ResultSet authentifier() throws SQLException
    {
      Connexion c = new Connexion(); //appel de connexion à la BD
        PreparedStatement pst; 
        pst = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM employee WHERE login='"+this.getLogin()+"' AND mdp='"+this.getMdp()+"' "); // lister les admins
        pst.executeQuery(); // lister les admins
        ResultSet rs = (ResultSet) pst.executeQuery(); // stocker le résultat dans un resultset
        if(rs.next()) {
           return rs;
        }
        else
        {
        return null;
        }
    
    }
     
       public ResultSet affichage() throws SQLException
    {
      Connexion c = new Connexion(); //appel de connexion à la BD
        PreparedStatement pst; 
        pst = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM employee"); // lister les admins
        pst.executeQuery(); // lister les admins
        ResultSet rs = (ResultSet) pst.executeQuery(); // stocker le résultat dans un resultset
        if(rs.next()) {
            return rs;
        }
        else
        {
        return null;
        }
    
    }
     
}
