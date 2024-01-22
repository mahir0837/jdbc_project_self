
CREATE TABLE address(

        address_id INTEGER PRIMARY KEY,
        address VARCHAR(50) NOT NULL,
        phone INTEGER NOT NULL
);
INSERT INTO address (address_id, address, phone) VALUES (5,'1913 Hanoi Way',28303384);
INSERT INTO address (address_id, address, phone) VALUES (7,'692 Joliet Street',448477419);
INSERT INTO address (address_id, address, phone) VALUES (8,'1566 Ineql Manor',70581400);
INSERT INTO address (address_id, address, phone) VALUES (10,'1795 Santiago',86045262);
INSERT INTO address (address_id, address, phone) VALUES (11,'900 Santiago',1651220);

CREATE TABLE customer(

                        customer_id INTEGER PRIMARY KEY,
                        first_name VARCHAR(40) NOT NULL,
                        last_name VARCHAR(30) NOT NULL,
                        address_id Integer references address(address_id)
);
INSERT INTO customer(customer_id, first_name, last_name, address_id) VALUES (1,'Mary','Smith',5);
INSERT INTO customer(customer_id, first_name, last_name, address_id) VALUES (2,'Patricia','Johnson',NULL);
INSERT INTO customer(customer_id, first_name, last_name, address_id) VALUES (3,'Linda','Williams',7);
INSERT INTO customer(customer_id, first_name, last_name, address_id) VALUES (4,'Barbara','Jones',8);
INSERT INTO customer(customer_id, first_name, last_name, address_id) VALUES (5,'Elizabeth','Brown',NULL);

select * from customer;

DROP TABLE CUSTOMER;

commit work;