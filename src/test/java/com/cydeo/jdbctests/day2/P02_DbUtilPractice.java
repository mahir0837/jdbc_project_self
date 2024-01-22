package com.cydeo.jdbctests.day2;

import com.cydeo.jdbctests.utility.DB_Util;
import org.junit.jupiter.api.Test;

public class P02_DbUtilPractice {

    @Test
    void task1() {
        //create a connection
        DB_Util.createConnection();

        DB_Util.runQuery("SELECT FIRST_NAME,LAST_NAME,SALARY FROM EMPLOYEES WHERE ROWNUM<6");

        //get result
        System.out.println("-------------GET ME FIRST ROW FIRST COLUMN-------------");
        System.out.println(DB_Util.getFirstRowFirstColumn());

        System.out.println("-------------GET ME ALL COLUMN NAMES-------------");
        System.out.println(DB_Util.getAllColumnNamesAsList());

        System.out.println("-------------GET ME ALL FIRST NAMES-------------");
        System.out.println(DB_Util.getColumnDataAsList("FIRST_NAME"));

        System.out.println("-------------GET ME ROW COUNT-------------");
        System.out.println(DB_Util.getRowCount());

        System.out.println("-------------GET ME CERTAIN ROWS INFO-------------");
        System.out.println(DB_Util.getRowMap(2));

        //close the connection
        DB_Util.destroy();
    }
}
