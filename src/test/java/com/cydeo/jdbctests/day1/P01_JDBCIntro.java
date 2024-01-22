package com.cydeo.jdbctests.day1;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class P01_JDBCIntro {

    //Connection String
    String dbUrl = "jdbc:oracle:thin:@54.208.32.156:1521:XE";
    String dbUsername = "hr";
    String dbPassword = "hr";

    @Test
    public void task1() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

        //It will help us to execute queries
        Statement statement = conn.createStatement();

        //Result state will store data after execution. It stores anly data (There is no table info)
        ResultSet rs = statement.executeQuery("select * from DEPARTMENTS WHERE MANAGER_ID IS NOT NULL ");

        // PRINT ALL OF THEM ONE BY ONE

        while (rs.next()){
            System.out.println(rs.getString(1)+" - "+
                    rs.getString(2)+" - "+
                    rs.getString(3)+" - "+
                    rs.getString(4));
        }
        //can we run another query in the same connection
        System.out.println("--------------------------------------");
        rs= statement.executeQuery("select *from LOCATIONS");
        while (rs.next()){
            System.out.println(rs.getString(2)+" - "+
                    rs.getString(3)+" - "+
                    rs.getString(4));
        }
        rs.close();
        statement.close();
        conn.close();
    }
}
