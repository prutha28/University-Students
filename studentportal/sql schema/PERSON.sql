------------------------------------------------------------------
--  TABLE PERSON
------------------------------------------------------------------

CREATE TABLE PERSON
(
   UNITY_ID         VARCHAR (10),
   FNAME            VARCHAR (20),
   LNAME            VARCHAR (20),
   PREFERRED_NAME   VARCHAR (20),
   GENDER           CHAR (1),
   DOB              DATE,
   PWD              VARCHAR (20)
)
NOCACHE
LOGGING;


ALTER TABLE `universitydb`.`PERSON` 
CHANGE COLUMN `fname` `fname` VARCHAR(20) NOT NULL ,
CHANGE COLUMN `lname` `lname` VARCHAR(20) NOT NULL ,
CHANGE COLUMN `pwd` `pwd` VARCHAR(20) NOT NULL ;


ALTER TABLE `universitydb`.`PERSON` 
CHANGE COLUMN `lname` `lname` VARCHAR(20) NULL ;
