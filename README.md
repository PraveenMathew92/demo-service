# demo-service

Oracle
https://hub.docker.com/u/vaibhawj/content/sub-d32dbec2-8b46-46f0-9b06-e964e4a46eb0?ref=login

Starting an Oracle Database Server instance
Starting an Oracle database server instance is as simple as executing

$ docker run -d -it --name oracle-db -P store/oracle/database-enterprise:12.2.0.1

docker exec -it <container-id> bash -c "source /home/oracle/.bashrc; sqlplus /nolog"

SQL> connect sys / as sysdba

% default password : Oradoc_db1

Stored Proc

SQL> CREATE OR REPLACE PROCEDURE procSleep(param1 IN NUMBER, outParam1 OUT VARCHAR2)
IS
BEGIN
  DBMS_LOCK.SLEEP(param1);
  outParam1 := 'Hello! I am awake';

END;
/

Call the stored proc

DECLARE
msg VARCHAR2(100);
BEGIN
procSleep(5, msg);
dbms_output.put_line(msg);
END;
/