------------------------------------------------------------------
--  TABLE WORKS_IN
------------------------------------------------------------------

CREATE TABLE WORKS_IN
(
   P_UNITY_ID   VARCHAR (10),
   D_ID         VARCHAR (10),
   SINCE        DATE
)
NOCACHE
LOGGING;


ALTER TABLE `universitydb`.`WORKS_IN` 
CHANGE COLUMN `P_UNITY_ID` `P_UNITY_ID` VARCHAR(10) NOT NULL ,
CHANGE COLUMN `D_ID` `D_ID` VARCHAR(10) NOT NULL ,
ADD PRIMARY KEY (`P_UNITY_ID`, `D_ID`);

ALTER TABLE `universitydb`.`WORKS_IN` 
ADD INDEX `WORKS_IN_FK_2_idx` (`D_ID` ASC);
ALTER TABLE `universitydb`.`WORKS_IN` 
ADD CONSTRAINT `WORKS_IN_FK_1`
  FOREIGN KEY (`P_UNITY_ID`)
  REFERENCES `universitydb`.`FACULTY` (`P_UNITY_ID`)
  ON DELETE NO ACTION
  ON UPDATE CASCADE,
ADD CONSTRAINT `WORKS_IN_FK_2`
  FOREIGN KEY (`D_ID`)
  REFERENCES `universitydb`.`DEPARTMENT` (`D_ID`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
