package com.cydeo.jdbctests.day1;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class P02_FelxibleNavigation {


    //Connection String
    String dbUrl = "jdbc:oracle:thin:@54.208.32.156:1521:XE";
    String dbUsername = "hr";
    String dbPassword = "hr";

    @Test
    public void task1() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = statement.executeQuery("select first_name,last_name from Employees");

        //first row
        rs.next();
        System.out.println((rs.getString(1) + "-" + rs.getString(2)));

        //second row
        rs.next();
        System.out.println((rs.getString(1) + "-" + rs.getString(2)));

        //what if I want to get last row data
        //last method
        /*
        ResultSet.TYPE_SCROLL_INSENSITIVE --> to do flexible navigation between rows
        ResultSet.CONCUR_READ_ONLY--> do not update anything from database, only read
         */
        rs.last();
        System.out.println((rs.getString(1) + "-" + rs.getString(2)));
        //how many rows we have (last+getRow)
        System.out.println("row number : "+rs.getRow());

        System.out.println("-------Absolute row-----------");
        rs.absolute(46);
        System.out.println((rs.getString(1) + " " + rs.getString(2))); //Alexander Hunold

        System.out.println("-----------Previous-----------------");
        rs.previous();
        System.out.println((rs.getString(1) + " " + rs.getString(2)));//Guy Himuro

        //print the whole table
        System.out.println("------------------------------------");
        rs.first(); //jum to firs row
        rs.beforeFirst();//jump into before first;
        int count=0;
        while (rs.next()){
            System.out.println((rs.getString(1) + " " + rs.getString(2)));
            count++;
        }
        System.out.println(count);

        rs.close();
        statement.close();
        conn.close();
    }
}
