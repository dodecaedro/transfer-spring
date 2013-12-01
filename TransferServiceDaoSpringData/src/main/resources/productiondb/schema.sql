CREATE TABLE CUSTOMER (
ID bigint(20) NOT NULL auto_increment,
FIRSTNAME varchar(200) NOT NULL,
LASTNAME varchar(200) NOT NULL,
PHONENUMBER varchar(20) NOT NULL,
ADDRESS varchar(200) NOT NULL,
PRIMARY KEY (ID)
);

CREATE TABLE ACCOUNT (
ID bigint(20) NOT NULL auto_increment,
BALANCE bigint(10) NOT NULL,
LASTNAME varchar(200) NOT NULL,
CUSTOMER_ID bigint(20) NOT NULL,
PRIMARY KEY (ID)
);

CREATE TABLE CREDITCARD (
ID bigint(20) NOT NULL auto_increment,
ISSUE_DATE date default NULL,
EXPIRATION_DATE date default NULL,
CUSTOMER_ID bigint(20) NOT NULL,
PRIMARY KEY (ID)
);
