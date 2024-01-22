SELECT *
FROM EMPLOYEES;

--DISPLAY ALL INFORMATION WHO IS GETTING 3RD LOWEST SALARY

SELECT *
FROM EMPLOYEES
WHERE SALARY = (SELECT MAX(SALARY)
                FROM (SELECT DISTINCT SALARY
                      FROM EMPLOYEES
                      ORDER BY SALARY )
                WHERE ROWNUM < 4);