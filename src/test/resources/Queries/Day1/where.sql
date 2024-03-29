SELECT * FROM EMPLOYEES;

--display all information of where first name is david
SELECT * FROM EMPLOYEES
         WHERE FIRST_NAME ='David';

-- Whatever inside this is case sensitive
SELECT * FROM EMPLOYEES
WHERE FIRST_NAME='David' AND LAST_NAME='Lee';

--DISPLAY FIRST NAME LASTNAME SALARY WHERE FIRST NAME IS PETER
SELECT  FIRST_NAME,LAST_NAME,SALARY FROM EMPLOYEES
WHERE FIRST_NAME='Peter';

--DISPLAY ALL INFORMATION FROM EMPLOYEES WHERE SALARY IS BIGGER THAN 6000
SELECT * FROM EMPLOYEES WHERE SALARY>6000;

--DISPLAY EMAIL OF WHO IS MAKING LESS THAN 5000
SELECT EMAIL FROM EMPLOYEES WHERE SALARY<5000;

--DISPLAY ALL INFORMATION OF EMPLOYEES WHO IS MAKING MORE THAN 7000 AND DEPARTMENT ID IS 60
SELECT * FROM EMPLOYEES WHERE SALARY>7000 AND DEPARTMENT_ID=60;

--DISPLAY ALL INFORMATION FROM EMPLOYEES WHERE SALARY EQUALS OR MORE THAN 3000 AND SALARY EQUALS OR LESS THAN 7000
SELECT  * FROM EMPLOYEES WHERE SALARY>=3000
AND SALARY<=7000;

SELECT  * FROM EMPLOYEES
          WHERE SALARY BETWEEN 3000 AND 7000;

--DISPLAY ALL INFORMATION FROM EMPLOYEES WHO IS WORKING AS IT_PROG OR MK_MAN
SELECT  * FROM EMPLOYEES WHERE JOB_ID='IT_PROG' OR JOB_ID='MK_MAN';

--DISPLAY ALL INFO WHERE EMPLOYEE ID IS 121,142,154,165,187
SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID IN (121,142,154,165,187);

--DISPLAY ALL INFORMATION WHERE COUNTRY ID IS US AND IT
SELECT * FROM COUNTRIES WHERE COUNTRY_ID IN ('US','IT');

--DISPLAY ALL INFO EXCEPT WHERE COUNTRY ID IS US AND IT
SELECT * FROM COUNTRIES WHERE COUNTRY_ID NOT IN ('US','IT');

--IS NULL
SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID IS NULL ;

SELECT * FROM EMPLOYEES WHERE MANAGER_ID IS NULL ;

--IS NOT NULL
SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID IS NOT NULL ;