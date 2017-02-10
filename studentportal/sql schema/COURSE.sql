------------------------------------------------------------------
--  TABLE COURSE
------------------------------------------------------------------

CREATE TABLE COURSE
(
   COURSE_ID     VARCHAR (10),
   COURSE_NAME   VARCHAR (10),
   CREDITS       NUMERIC,
   SECTION       NUMERIC
)
NOCACHE
LOGGING;


ALTER TABLE `COURSE` CHANGE `COURSE_NAME` `COURSE_NAME` VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL;
