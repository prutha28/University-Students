------------------------------------------------------------------
--  TABLE LECTURE_SLOTS
------------------------------------------------------------------

CREATE TABLE LECTURE_SLOTS
(
   SLOT_ID     VARCHAR (10),
   DAY_NAME    VARCHAR (10),
   FROM_TIME   TIMESTAMP (6),
   TO_TIME     TIMESTAMP (6)
)
NOCACHE
LOGGING;


