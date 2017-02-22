------------------------------------------------------------------
--  TABLE EMAIL
------------------------------------------------------------------

CREATE TABLE EMAIL
(
   UNITY_ID     VARCHAR (10),
   EMAIL_ID     VARCHAR (10),
   EMAIL_TYPE   VARCHAR (10)
)
NOCACHE
LOGGING;


ALTER TABLE `EMAIL` CHANGE `EMAIL_ID` `EMAIL_ID` VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL;


ALTER TABLE `universitydb`.`EMAIL` 
CHANGE COLUMN `EMAIL_TYPE` `EMAIL_TYPE` VARCHAR(10) NOT NULL ,
ADD PRIMARY KEY (`UNITY_ID`, `EMAIL_ID`);


ALTER TABLE `universitydb`.`EMAIL` 
ADD CONSTRAINT `EMAIL_FK`
  FOREIGN KEY (`UNITY_ID`)
  REFERENCES `universitydb`.`PERSON` (`unity_id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
