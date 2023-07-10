-- user 계정
show databases;	/* DB 보기 */

use mysql;	/* DB 사용 */
show tables;	/* 테이블 보기 */

-- DB 생성
create database mydb;

-- DB 권한주기
grant all privileges on mydb.* to root@localhost with grant option;

show databases;