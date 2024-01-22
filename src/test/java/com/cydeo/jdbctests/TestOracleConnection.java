package com.cydeo.jdbctests;

import java.sql.*;

public class TestOracleConnection {

    public static void main(String[] args) throws SQLException {

        //Connection String

        String dbUrl = "jdbc:oracle:thin:@54.208.32.156:1521:XE";
        String dbUsername = "hr";
        String dbPassword = "hr";

        //Create the connection
        //DriverManager class getConnection Method will help connect database
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

        //It will help us to execute queries
        Statement statement = conn.createStatement();

        //Result state will store data after execution. It stores anly data (There is no table info)
        ResultSet rs = statement.executeQuery("select * from EMPLOYEES");

        //Getting data
//        rs.next();
//        System.out.println("-----------First Row-------------------");
        //right now pointer is in the first row
        //how to get data from first row
        //rs,getInt(index)--> this method return integer. Index starts from 1 in sql. it refers column position
//        System.out.println(rs.getInt(1));
        //get the europe region name
//        System.out.println(rs.getString(2));

        //same information we can get with columnLabel not column index
//        System.out.println(rs.getInt("REGION_ID"));
//        System.out.println(rs.getString("REGION_NAME"));
//
//        //Get me second row result in following format : 2 - Americas
//        System.out.println("------------Second Row-----------------");
//        rs.next();
//        System.out.println((rs.getInt(1) + " - " + rs.getString("REGION_NAME")));
//
//        System.out.println("------------Third Row-----------------");
//        rs.next();
//        System.out.println((rs.getInt("REGION_ID") + " - " + rs.getString(2)));
//
//
//        System.out.println("------------Fourth Row-----------------");
//        rs.next();
//        System.out.println((rs.getInt("REGION_ID") + " - " + rs.getString("REGION_NAME")));

        //WHAT IF WE HAVE 100 ROWS, WE WANT TO PRINT FIRST AND SECOND
        while(rs.next()){

            System.out.println((rs.getString(1) + " - " + rs.getString(2)+" - "+rs.getString(3)));
        }

        rs.close();
        statement.close();
        conn.close();


    }
}
