SELECT * FROM EMPLOYEES;

SELECT *
FROM EMPLOYEES;
SELECT SUBSTR(FIRST_NAME, 0, 1) || '.' || SUBSTR(LAST_NAME, 0, 1) || '.' AS INITIALS
,FIRST_NAME||' '|| LAST_NAME ||' ' AS FULL_NAME
FROM EMPLOYEES;

CREATE VIEW EMPLOYEE_INFO AS  SELECT SUBSTR(FIRST_NAME, 0, 1) || '.' || SUBSTR(LAST_NAME, 0, 1) || '.' AS INITIALS
    ,FIRST_NAME||' '|| LAST_NAME ||' ' AS FULL_NAME
    FROM EMPLOYEES;

SELECT * FROM EMPLOYEE_INFO;

SELECT INITIALS FROM EMPLOYEE_INFO;

--DROP VIEW
-- DROP VIEW EMP_DETAILS_VIEW;