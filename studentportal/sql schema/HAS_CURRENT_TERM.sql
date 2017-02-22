------------------------------------------------------------------
--  TABLE HAS_CURRENT_TERM
------------------------------------------------------------------

CREATE TABLE HAS_CURRENT_TERM
(
   S_UNITY_ID   VARCHAR (10),
   TERM_ID      VARCHAR (10),
   TERM_GPA     NUMERIC
)
NOCACHE
LOGGING;


ALTER TABLE `universitydb`.`HAS_CURRENT_TERM` 
CHANGE COLUMN `S_UNITY_ID` `S_UNITY_ID` VARCHAR(10) NOT NULL ,
CHANGE COLUMN `TERM_ID` `TERM_ID` VARCHAR(10) NOT NULL ,
ADD PRIMARY KEY (`S_UNITY_ID`, `TERM_ID`);


ALTER TABLE `universitydb`.`HAS_CURRENT_TERM` 
ADD INDEX `HAS_CURRENT_TERM_2_idx` (`TERM_ID` ASC);
ALTER TABLE `universitydb`.`HAS_CURRENT_TERM` 
ADD CONSTRAINT `HAS_CURRENT_TERM_1`
  FOREIGN KEY (`S_UNITY_ID`)
  REFERENCES `universitydb`.`Student` (`S_UNITY_ID`)
  ON DELETE CASCADE
  ON UPDATE CASCADE,
ADD CONSTRAINT `HAS_CURRENT_TERM_2`
  FOREIGN KEY (`TERM_ID`)
  REFERENCES `universitydb`.`TERM` (`TERM_ID`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
