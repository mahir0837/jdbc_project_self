SELECT * FROM EMPLOYEES;

/*
 ORDERBY
    -IT ALLOWS US TO SORT DATA BASED ON THE PROVIDED COLUMN
    -AS DEFAULT IT WILL ORDER RESULT ASCENDING ORDER (A-Z,0-9)
    -IF YOU WANT TO SORT IT DESCENDING ORDER WE NEED TO SPECIFY RIGHT AFTER COLUMN NAME
 */

 --DISPLAY OL EMPLOYEES BASED ON THE SALARY ASC ORDER
SELECT * FROM EMPLOYEES
ORDER BY SALARY ;

--SAME QUERY
SELECT * FROM EMPLOYEES
ORDER BY SALARY ASC;

--DISPLAY OL EMPLOYEES BASED ON THE SALARY DESC ORDER
SELECT * FROM EMPLOYEES
ORDER BY SALARY DESC ;

--DISPLAY ALL EMPLOYEES BASED ON THEIR FIRST NAME DESC
SELECT * FROM EMPLOYEES ORDER BY FIRST_NAME DESC ;

--DISPLAY ALL INFO WHERE EMP ID IS LESS THAN 120 AND ORDER THEN BASED ON SALARY DESC
SELECT * FROM EMPLOYEES
WHERE EMPLOYEE_ID<120
ORDER BY SALARY DESC ;

--DISPLAY ALL INFORMATION FROM EMPLOYEES FIRSTNAME ASC AND LASTNAME IS DESC
SELECT  * FROM EMPLOYEES ORDER BY FIRST_NAME, LAST_NAME DESC ;