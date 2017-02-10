------------------------------------------------------------------
--  TABLE DEPARTMENT
------------------------------------------------------------------

CREATE TABLE DEPARTMENT
(
   D_ID            VARCHAR (10),
   D_NAME          VARCHAR (10),
   FACULTY_COUNT   NUMERIC,
   HOD             VARCHAR (10)
)
NOCACHE
LOGGING;



ALTER TABLE `DEPARTMENT` CHANGE `D_NAME` `D_NAME` VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL;