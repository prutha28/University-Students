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
