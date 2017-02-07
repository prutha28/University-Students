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


