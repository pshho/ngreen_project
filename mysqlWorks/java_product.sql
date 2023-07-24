use javaweb;

create table product(
	pid	varchar(10) primary key,
    pname varchar(30),
    punitPrice integer,
    pdescription text,
    pcategory varchar(20),
    pmanufacturer varchar(20),
    punitsInstock long,
    pcondition varchar(20),
    pproductImage varchar(20)
);

create table members(
	mid varchar(30) primary key,
    passwd varchar(50) not null,
    mname varchar(20) not null,
    gender varchar(10) not null,
    birth varchar(20),
    email varchar(50),
    phone varchar(30),
    address varchar(100),
    regDate timestamp default now()
);

insert into product(pid, pname, punitPrice, pdescription, pcategory, pmanufacturer, punitsInstock, pcondition, pproductImage)
values('SM-1', '갤럭시', '200000', '삼성 갤럭시', '삼성', '삼성', '20', '신상품', 'Galax1');

insert into members(mid, passwd, mname, gender, birth, email, phone, address) 
values('awdr498', 'qwer1234', '강남', '남', '18880120', 'awdr498@gmail.com', '01012345678', '서울시강남구테헤란로');

update product set pcondition = '중고품' where pid = 'SM-01';

select * from product;
select * from members;

SELECT COUNT(*) as result FROM members WHERE mid = 'awdr498';