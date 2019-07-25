# demo-service

Oracle
https://hub.docker.com/u/vaibhawj/content/sub-d32dbec2-8b46-46f0-9b06-e964e4a46eb0?ref=login

Starting an Oracle Database Server instance
Starting an Oracle database server instance is as simple as executing

$ docker run -d -it --name <oracle-db> store/oracle/database-enterprise:12.2.0.1

Stored Proc

CREATE OR REPLACE PROCEDURE procSleep(param1 IN NUMBER, outParam1 OUT VARCHAR2)
IS
BEGIN
  DBMS_LOCK.SLEEP(param1);
  outParam1 := 'Hello! I am awake';

END;
/