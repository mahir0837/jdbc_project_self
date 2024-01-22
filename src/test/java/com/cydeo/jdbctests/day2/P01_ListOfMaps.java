package com.cydeo.jdbctests.day2;

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.*;

public class P01_ListOfMaps {

    String dbUserName = "hr";
    String dbPassword = "hr";
    String uri = "jdbc:oracle:thin:@54.208.32.156:1521:XE";

    @Test
    public void task1() {
        Map<String, Object> rowMap1 = new HashMap<>();
        Map<String, Object> rowMap2 = new HashMap<>();
        System.out.println("--------ROW MAP 1---------------");

        rowMap1.put("FIRST_NAME", "Steven");
        rowMap1.put("LAST_NAME", "King");
        rowMap1.put("SALARY", 24000);
        System.out.println(rowMap1);

        rowMap2.put("FIRST_NAME", "Neena");
        rowMap2.put("LAST_NAME", "Kochar");
        rowMap2.put("SALARY", 17000);
        List<Map<String, Object>> dataList = new ArrayList<>(Arrays.asList(rowMap1, rowMap2));
        System.out.println(dataList.get(0).get("FIRST_NAME"));
        System.out.println(dataList);
    }

    @Test
    public void task2() throws SQLException {

        Connection conn = DriverManager.getConnection(uri, dbUserName, dbPassword);
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEES");

        ResultSetMetaData rsmd = rs.getMetaData();

        List<Map<String,Object>>dataTable=new ArrayList<>();
        System.out.println("----------ROW MAP 1------------");
        rs.next();
        Map<String, Object> rowMap1 = new HashMap<>();
        rowMap1.put(rsmd.getColumnName(1), rs.getString(1));
        rowMap1.put(rsmd.getColumnName(2), rs.getString(2));
        rowMap1.put(rsmd.getColumnName(3), rs.getString(3));
        System.out.println(rowMap1);

        System.out.println("----------ROW MAP 2------------");
        rs.next();
        Map<String, Object> rowMap2 = new HashMap<>();
        rowMap2.put(rsmd.getColumnName(1), rs.getString(1));
        rowMap2.put(rsmd.getColumnName(2), rs.getString(2));
        rowMap2.put(rsmd.getColumnName(3), rs.getString(3));
        System.out.println(rowMap2);

        System.out.println("----------ROW MAP 3------------");
        rs.next();
        Map<String, Object> rowMap3 = new HashMap<>();
        rowMap3.put(rsmd.getColumnName(1), rs.getString(1));
        rowMap3.put(rsmd.getColumnName(2), rs.getString(2));
        rowMap3.put(rsmd.getColumnName(3), rs.getString(3));
        System.out.println(rowMap3);

        dataTable.addAll(Arrays.asList(rowMap1,rowMap2,rowMap3));
        System.out.println(dataTable);

        rs.close();
        statement.close();
        conn.close();
    }

    @Test
    void task3() throws SQLException {

        Connection conn = DriverManager.getConnection(uri, dbUserName, dbPassword);
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT FIRST_NAME,LAST_NAME,SALARY FROM EMPLOYEES WHERE ROWNUM<6");

        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount=rsmd.getColumnCount();
        //create your list of maps to keep information
        List<Map<String,Object>>dataList=new ArrayList<>();

        //iterate through each row

        while (rs.next()){

            Map<String,Object>rowMap=new LinkedHashMap<>();

            for (int i = 1; i <= columnCount; i++) {
            rowMap.put(rsmd.getColumnName(i),rs.getString(i));

            }
            dataList.add(rowMap);
        }
        for (Map<String, Object> eachRow : dataList) {
            System.out.println(eachRow);
        }




        rs.close();
        statement.close();
        conn.close();
    }
}
