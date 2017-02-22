------------------------------------------------------------------
--  TABLE ADDRESS
------------------------------------------------------------------

CREATE TABLE ADDRESS
(
   UNITY_ID      VARCHAR (10),
   ADDRESS_ID    VARCHAR (10),
   APT_NO        NUMERIC,
   STREET_NAME   VARCHAR (10),
   CITY          VARCHAR (10),
   STATE         VARCHAR (10),
   COUNTRY       VARCHAR (10),
   ZIPCODE       NUMERIC
)
NOCACHE
LOGGING;


ALTER TABLE `universitydb`.`ADDRESS` 
CHANGE COLUMN `CITY` `CITY` VARCHAR(10) NOT NULL ,
CHANGE COLUMN `STATE` `STATE` VARCHAR(10) NOT NULL ,
CHANGE COLUMN `COUNTRY` `COUNTRY` VARCHAR(10) NOT NULL ,
ADD PRIMARY KEY (`UNITY_ID`, `ADDRESS_ID`);

ALTER TABLE `universitydb`.`ADDRESS` 
ADD CONSTRAINT `ADDRESS_FK`
  FOREIGN KEY (`UNITY_ID`)
  REFERENCES `universitydb`.`PERSON` (`unity_id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
