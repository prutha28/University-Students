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


