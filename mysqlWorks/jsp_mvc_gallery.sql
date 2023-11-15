create table gallery(
	id int auto_increment primary key,
    title varchar(100),
    pname varchar(100),
    pw varchar(100),
    upfile varchar(100),
    descriptions varchar(9999),
    reg_date timestamp,
    cnt int
);

insert into gallery(title, pname, pw, upfile, descriptions, reg_date, cnt)
values
('포켓몬','일','1','a1.png','포켓몬1',sysdate(),0),
('포켓몬','이','2','a2.png','포켓몬2',sysdate(),0),
('포켓몬','삼','3','a3.png','포켓몬3',sysdate(),0),
('포켓몬','사','4','a4.png','포켓몬4',sysdate(),0),
('포켓몬','오','5','a5.png','포켓몬5',sysdate(),0),
('포켓몬','육','6','a6.png','포켓몬6',sysdate(),0),
('포켓몬','칠','7','a7.png','포켓몬7',sysdate(),0),
('포켓몬','팔','8','a8.png','포켓몬8',sysdate(),0),
('포켓몬','구','9','a9.png','포켓몬9',sysdate(),0),
('포켓몬','십','10','a10.png','포켓몬10',sysdate(),0);

select * from gallery;

drop table gallery;

delete from gallery where id = 11;