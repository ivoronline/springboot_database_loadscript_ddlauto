CREATE TABLE PERSON (
  ID   INTEGER AUTO_INCREMENT,
  NAME NVARCHAR2(100),
  AGE  NUMERIC
);

INSERT INTO PERSON (NAME, AGE) VALUES ('Load Script 1' , 10);
INSERT INTO PERSON (NAME, AGE) VALUES ('Load Script 2' , 20);
