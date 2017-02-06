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


