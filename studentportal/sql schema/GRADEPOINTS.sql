------------------------------------------------------------------
--  TABLE GRADEPOINTS
------------------------------------------------------------------

CREATE TABLE GRADEPOINTS
(
   GRADE          CHAR (1),
   CREDITPOINTS   NUMERIC
)
NOCACHE
LOGGING;


ALTER TABLE `GRADEPOINTS` CHANGE `GRADE` `GRADE` CHAR(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL;
ALTER TABLE `GRADEPOINTS` CHANGE `CREDITPOINTS` `CREDITPOINTS` FLOAT(10) NULL DEFAULT NULL;