package org.example.dbconnect;

import java.sql.*;

public class DbConnection {

    public static Connection takeConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","xxxxxx");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
