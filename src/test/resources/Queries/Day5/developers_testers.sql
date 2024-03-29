SELECT * FROM EMPLOYEES;

CREATE TABLE Developers (
                           ID INTEGER PRIMARY KEY,
                           FirstName VARCHAR(255),
                           Salary INTEGER
);

CREATE TABLE Testers (
                            ID INTEGER PRIMARY KEY,
                            FirstName VARCHAR(255),
                            Salary INTEGER
);
-- Inserting random data for four developers
INSERT INTO Developers (ID, FirstName, Salary) VALUES (1, 'Mike', 155000);
INSERT INTO Developers (ID, FirstName, Salary) VALUES (2, 'John', 142000);
INSERT INTO Developers (ID, FirstName, Salary) VALUES (3, 'Steven', 850000);
INSERT INTO Developers (ID, FirstName, Salary) VALUES (4, 'Maria', 120000);

INSERT INTO Testers (ID, FirstName, Salary) VALUES (1, 'Steven', 110000);
INSERT INTO Testers (ID, FirstName, Salary) VALUES (2, 'Adam', 105000);
INSERT INTO Testers (ID, FirstName, Salary) VALUES (3, 'Lex', 100000);

COMMIT  WORK ;

SELECT * FROM DEVELOPERS;
SELECT * FROM TESTERS;
 /*
  TO MERGER MORE THEM ONE TABLE VERTICALLY
  REMOVE DUPS
  MAKE AN ORDER AS DEFAULT ASC
  */

SELECT * FROM DEVELOPERS
UNION
SELECT * FROM TESTERS;

SELECT FirstName FROM DEVELOPERS
UNION
SELECT FirstName FROM TESTERS;

/*
 UNION ALL
 DONT REMOVE DUPS
 DONT SORT THE RESULT
 */
SELECT * FROM DEVELOPERS
UNION ALL
SELECT * FROM TESTERS;

/*
 MINUS
 IT REMOVES SAME DATA FROM FIRST TABLE AND GIVES RESULT FROM FIRST TABLE
 */

SELECT FirstName FROM DEVELOPERS
MINUS
SELECT FirstName FROM TESTERS;

SELECT FirstName FROM TESTERS
MINUS
SELECT FirstName FROM DEVELOPERS;

--INTERSECT
SELECT FirstName FROM DEVELOPERS
INTERSECT
SELECT FirstName FROM TESTERS;