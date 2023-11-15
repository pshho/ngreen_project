create table quit_member(
   member_id varchar(200),
   member_quit_date timestamp default now(),
   order_exist varchar(100)
);

create table black_list(
   member_id varchar(200),
   black_list_reg_date timestamp default now()
);