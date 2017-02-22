------------------------------------------------------------------
--  TABLE COURSE
------------------------------------------------------------------

CREATE TABLE COURSE
(
   COURSE_ID     VARCHAR (10),
   COURSE_NAME   VARCHAR (50),
   CREDITS       NUMERIC,
   SECTION       VARCHAR(2)
)
NOCACHE
LOGGING;
