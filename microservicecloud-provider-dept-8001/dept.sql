DROP DATABASE IF EXISTS cloud_db01;
CREATE DATABASE cloud_db01 CHARACTER SET UTF8;
USE cloud_db01;

CREATE TABLE dept
(
  deptno BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  dname VARCHAR(60),
  db_source VARCHAR(60)
);

INSERT INTO `dept` VALUES (1, '开发部', DATABASE());