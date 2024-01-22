package com.cydeo.jdbctests.day1;

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PR03_MetaData {


    //Connection String
    String dbUrl = "jdbc:oracle:thin:@54.208.32.156:1521:XE";
    String dbUsername = "hr";
    String dbPassword = "hr";

    @Test
    public void task1() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT FIRST_NAME,LAST_NAME,SALARY FROM EMPLOYEES WHERE ROWNUM<6");

        //Database MetaData
        DatabaseMetaData dbMetadata = conn.getMetaData();
        System.out.println(dbMetadata.getUserName());
        System.out.println(dbMetadata.getDatabaseProductName());
        System.out.println(dbMetadata.getDatabaseProductVersion());
        System.out.println(dbMetadata.getDriverName());

        //ResultSetMEtaData
        ResultSetMetaData rsmd = rs.getMetaData();
        //how may columns we have
        int columnCount = rsmd.getColumnCount();
        System.out.println(columnCount);

        //Get me column name for index 1
        System.out.println(rsmd.getColumnName(1));
        System.out.println("-------------COLUMN NAMES ------------------");
        //print all column name dynamically
        for (int i = 1; i <= columnCount; i++) {
            System.out.println(rsmd.getColumnName(i));
        }

        /*
        ResultSet --> it holds table data
            rs.next --> it iterate each row dynamically (with while loop)
            rs.getString(columnIndex)--> to retrieve data itself
            rs.getString(columnName)--> to retrieve data itself

         ResultSetMetaData --> it holds table information (ColumnNames - Column count)
            rsmd.getColumnCount() --> how many columns we have
            rsmd.getColumnName(Index)--> it will give specific column name
         */

        //write a code, that print whole table information for every query.
        //Column name - Column value
        //Employee_ID - 100
        //Employee_Name - Steven
        System.out.println("-----------PRINT ALL DATA DYNAMICALLY------------");
        while (rs.next()) {

            //whatever we do, we will do for each row.
            //Region_ID - 1 Region_Name - Europe
            //Region_ID - 2 Region_Name - Americas
            //iterate each column

            for (int i = 1; i <= columnCount; i++) {

                System.out.print(rsmd.getColumnName(i) + "-" + rs.getString(i) + " ");
            }
            System.out.println();
        }


        rs.close();
        statement.close();
        conn.close();
    }



}

