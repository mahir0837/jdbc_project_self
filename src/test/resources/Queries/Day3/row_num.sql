SELECT *
FROM EMPLOYEES;
/*
 IT LIMITS ROWS BASED ON PROVIDED NUMBER
 */
SELECT *
FROM EMPLOYEES
WHERE ROWNUM < 11;

-- DISPLAY ALL INFORMATION FROM EMPLOYEES TABLE FOR TOP 5 HIGHEST SALARY
--IT IS WRONG
SELECT *
FROM EMPLOYEES
WHERE ROWNUM <= 5
ORDER BY SALARY DESC;

SELECT *
FROM (SELECT * FROM EMPLOYEES ORDER BY SALARY DESC)
WHERE ROWNUM < 6;

--DISPLAY ALL INFORMATION WHO IS GETTING 5TH HIGHEST SALARY
SELECT MIN(SALARY)
FROM (SELECT DISTINCT SALARY FROM EMPLOYEES ORDER BY SALARY DESC)
WHERE ROWNUM < 6;

SELECT *
FROM EMPLOYEES
WHERE SALARY = (SELECT MIN(SALARY)
                FROM (SELECT DISTINCT SALARY FROM EMPLOYEES ORDER BY SALARY DESC)
                WHERE ROWNUM < 6);

--DISPLAY ALL INFORMATION WHO IS GETTING 37TH HIGHEST SALARY
SELECT *
FROM EMPLOYEES
WHERE SALARY = (SELECT MIN(SALARY)
                FROM (SELECT DISTINCT SALARY FROM EMPLOYEES ORDER BY SALARY DESC)
                WHERE ROWNUM < 38);
--FOR THE N TH HIGHEST SALARY FORMULA IS ROWNUM>N+1
SELECT SALARY
FROM EMPLOYEES
ORDER BY SALARY;
--DISPLAY ALL INFORMATION WHO IS GETTING 3 TH LOWEST SALARY
SELECT *
FROM EMPLOYEES
WHERE SALARY = (SELECT *
                FROM (SELECT MAX(SALARY)
                      FROM (SELECT DISTINCT SALARY FROM EMPLOYEES ORDER BY SALARY ASC)
                      WHERE ROWNUM < 4));