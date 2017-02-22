------------------------------------------------------------------
--  TABLE EMERGENCY_CONTACT
------------------------------------------------------------------

CREATE TABLE EMERGENCY_CONTACT
(
   UNITY_ID       VARCHAR (10),
   PHONE_NUM      CHAR (9),
   PHONE_TYPE     VARCHAR (10),
   RELATIONSHIP   VARCHAR (10),
   COUNTRY_CODE   CHAR (3),
   FNAME          VARCHAR (20),
   LNAME          VARCHAR (20)
)
NOCACHE
LOGGING;


ALTER TABLE `universitydb`.`EMERGENCY_CONTACT` 
CHANGE COLUMN `UNITY_ID` `UNITY_ID` VARCHAR(10) NOT NULL ,
CHANGE COLUMN `PHONE_NUM` `PHONE_NUM` CHAR(9) NOT NULL ,
CHANGE COLUMN `COUNTRY_CODE` `COUNTRY_CODE` CHAR(3) NOT NULL ,
CHANGE COLUMN `FNAME` `FNAME` VARCHAR(20) NOT NULL ,
CHANGE COLUMN `LNAME` `LNAME` VARCHAR(20) NOT NULL ,
ADD PRIMARY KEY (`UNITY_ID`, `PHONE_NUM`);


ALTER TABLE `universitydb`.`EMERGENCY_CONTACT` 
ADD CONSTRAINT `EMERGENCY_CONTACT_FK`
  FOREIGN KEY (`UNITY_ID`)
  REFERENCES `universitydb`.`PERSON` (`unity_id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
