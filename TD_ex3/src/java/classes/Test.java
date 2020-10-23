/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TPC
 */
public class Test {
    public static void main(String args[]) throws SQLException
    {
   /* Employee emp=new Employee(1,"teste", "admin", "admin", "admin");
    if(emp.authentifier())
        System.out.println("compte identifié");
    else 
                System.out.println("inconnu!");
    
ResultSet r=emp.affichage();
while(r.next())
{
System.out.println(r.getString("grade"));
}
    
    */
        
        Employee emp=new Employee("admin", "admin");
            ResultSet rs=emp.authentifier();
            if(rs.first())
            {
                System.out.println(rs.getString("grade"));
            //    session.setAttribute("grade", rs.getString("grade"));
            //response.sendRedirect("liste.jsp");
            }
            else
                System.out.println("vide");
    }
}
