SELECT  * FROM EMPLOYEES;

/*
    -Percent %--> for matching any sequence of characters. (0 or more)
    - underscore _--> for matching any single characters

    -contains
    -startswith
    -endswith
 */
 --display all imployees where first name startswith  B

SELECT * FROM EMPLOYEES WHERE FIRST_NAME LIKE 'B%';

--display all employees where first name starts with b and length of it letter 5
SELECT * FROM EMPLOYEES WHERE FIRST_NAME LIKE 'B____';

--display 5 letter first name from employees where middle char is z
SELECT  * FROM EMPLOYEES WHERE FIRST_NAME LIKE '__z__';

--display first name ands with 'e'
SELECT  * FROM EMPLOYEES WHERE  FIRST_NAME LIKE '%e';

--displayy all employees where job id contains  IT
SELECT  * FROM EMPLOYEES WHERE JOB_ID LIKE '%IT%';

--display all information where first name starts with 'H' and ending with 'l'
SELECT  * FROM EMPLOYEES WHERE FIRST_NAME LIKE 'H%l';