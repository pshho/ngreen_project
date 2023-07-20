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

insert into product(pid, pname, punitPrice, pdescription, pcategory, pmanufacturer, punitsInstock, pcondition, pproductImage)
values('SM-1', '갤럭시', '200000', '삼성 갤럭시', '삼성', '삼성', '20', '신상품', 'Galax1');

update product set pcondition = '중고품' where pid = 'SM-01';

select * from product;