create table member(
	member_id varchar(200) primary key,
    member_pw varchar(100),
    member_name varchar(200),
    member_email varchar(250),
    member_phone varchar(300),
    member_reg_date timestamp default now(),
    member_status varchar(100)
);

create table address(
	address_id int auto_increment primary key,
    addr_name varchar(200),
    address varchar(200),
    zip_code varchar(100),
    detail_address varchar(200),
    member_id varchar(200),
    address_phone varchar(300),
    basic_addr int,
    address_msg varchar(900)
);

create table cart(
	cart_id int auto_increment primary key,
    member_id varchar(200),
    product_code int,
    products_count int,
    sum_price int,
    pay_status int
);

drop table cart;
drop table address;
drop table member;
alter table address add address_phone varchar(300);
alter table address add basic_addr int;
alter table address add addr_name varchar(200);
alter table address add address_msg varchar(900);
alter table cart add delivery_fee int;

insert into member (member_id, member_pw, member_name, member_email, member_phone, member_reg_date, member_status)
values
("4hoons","1234","사주훈","4hoons@google.com","010-7865-4562","2023-01-14 18:52:40", null),
("bukdu22","1234","북두칠성","bukdu22@nate.com","010-6434-2341","2023-02-14 18:56:25", null),
("buksung4","1234","정북성","buksung4@nate.com","010-2976-6435","2023-03-14 18:55:21", null),
("fivebean","1234","파이브빈","fivebean@google.com","010-6657-6586","2021-09-14 18:47:08", null),
("fourbean","1234","포빈","fourbean@nate.com","010-4423-1242","2023-04-14 18:46:37", null),
("hoons","1234","삼주훈","hoons@naver.com","010-6546-7687","2021-05-14 18:52:03", null),
("jh1234","1234","한주훈","jh1234@google.com","010-5252-3244","2023-02-14 18:48:36", null),
("jh5","1234","오주훈","jh5@nate.com","010-6585-4353","2023-09-14 18:53:09", null),
("juhoon","1234","둘주훈","hbh1234@google.com","010-5243-3532","2019-11-14 18:51:18", null),
("jwasung","1234","정좌성","jwasung@naver.com","010-4352-2412","2023-12-14 18:54:30", null),
("male5","1234","정남성","male5@daum.net","010-5687-4356","2022-06-14 18:55:59", null),
("member1","1234","한가인","member1@naver.com","010-1234-1234","2015-06-14 18:27:08", null),
("member2","1234","둘가인","member2@naver.com","010-4321-4321","2023-09-17 18:27:52", null),
("member3","1234","삼가인","member3@naver.com","010-1235-1235","2023-09-18 18:28:20", null),
("member4","1234","사가인","member4@naver.com","010-5553-3456","2023-09-19 18:34:09", null),
("member5","1234","오가인","member5@naver.com","010-3323-1234","2023-09-12 18:35:14", null),
("onebean","1234","원빈","onebean@daum.net","010-2342-2341","2023-09-22 18:42:33", null),
("threebean","1234","삼빈","threebean@nate.com","010-6765-8678","2022-05-05 18:43:24", null),
("twobean","1234","투빈","twobean@google.com","010-8675-6473","2021-07-03 18:42:57", null),
("wusung","1234","정우성","wusung@naver.com","010-5843-4213","2023-04-06 18:54:03", null),
("admin","admin","admin","admin","admin", sysdate(), '관리자');

insert into address (address_id,addr_name,address,zip_code,detail_address,member_id,address_phone,basic_addr,address_msg)
values
(1,"한가인","경기 평택시 포승읍 원정리 1278","17950","작은집","member1","010-1234-1234",1,NULL),
(2,"둘가인","경북 구미시 1공단로 15-41","39347","큰집","member2","010-4321-4321",1,NULL),
(3,"삼가인","서울 강북구 수유동 279-3","01026","200호","member3","010-1235-1235",1,NULL),
(4,"사가인","서울 강동구 강동대로55길 10","05408","큰길","member4","010-5553-3456",1,NULL),
(5,"오가인","서울 강북구 4.19로 1","01026","작은길","member5","010-3323-1234",1,NULL),
(6,"원빈","서울 강북구 4.19로13길 22","01015","303호","onebean","010-2342-2341",1,NULL),
(7,"투빈","서울 관악구 난곡로44길 10","08849","파란대문","twobean","010-8675-6473",1,NULL),
(8,"삼빈","서울 강동구 고덕비즈밸리로6길 186","05206","산어딘가","threebean","010-6765-8678",1,NULL),
(9,"포빈","서울 강서구 방화대로6다길 9","07645","3층","fourbean","010-4423-1242",1,NULL),
(10,"파이브빈","서울 강북구 4.19로21길 28","01015","502호","fivebean","010-6657-6586",1,NULL),
(11,"한주훈","전북 군산시 산북동 786-12","54167","주택","jh1234","010-5252-3244",1,NULL),
(12,"둘주훈","경기 용인시 기흥구 덕영대로 1664","17103","골목안","juhoon","010-5243-3532",1,NULL),
(13,"삼주훈","부산 남구 감만동 504-2","48557","아파트","hoons","010-6546-7687",1,NULL),
(14,"사주훈","충북 청주시 상당구 가덕면 시동리 175-3","28204","안쪽집","4hoons","010-7865-4562",1,NULL),
(15,"오주훈","경남 거제시 거제면 거제남서로 3215-3","53286","골목집","jh5","010-6585-4353",1,NULL),
(16,"정우성","경북 울릉군 울릉읍 독도안용복길 3","40240","독도","wusung","010-5843-4213",1,NULL),
(17,"정좌성","경기 성남시 분당구 대왕판교로 477","13480","대왕","jwasung","010-4352-2412",1,NULL),
(18,"정북성","경기 성남시 분당구 서현동 300","13586","300호","buksung4","010-2976-6435",1,NULL),
(19,"정남성","충남 서천군 기산면 영모리 300","33626","안쪽","male5","010-5687-4356",1,NULL),
(20,"북두칠성","서울 동작구 상도로47가길 44","06970","602호","bukdu22","010-6434-2341",1,NULL);

insert into member(member_id, member_pw, member_name, member_email, member_phone)
values
('aw', '1', '홍', 'aaa@naver.com', '010-1234-1234');

update address set address_phone = '01085184268' where address_id = 1;
update address set basic_addr = 1 where address_id = 1;
update address set addr_name = '박성호' where address_id = 1;
update member set member_phone = '01785184268' where member_id = 'awdr1';
delete from cart where cart_id = 8;

select * from member;
select * from address;
select * from cart;
select * from cart where member_id = 'jh5' and pay_status = 1;
select bags.* from bags inner join cart on cart.product_code = bags.product_code where member_id = 'awdr1';
SHOW VARIABLES LIKE 'character_set_database';

set sql_safe_updates = 0;
delete from cart where member_id = 'awdr1';
set sql_safe_updates = 1;