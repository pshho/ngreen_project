create table replys(
	rno int primary key auto_increment,
    bid int not null,
    rcontent text not null,
    replyer varchar(20) not null,
    rdate timestamp default now(),
    rupdate timestamp,
    constraint fk_boards_replys foreign key(bid)
    references boards(bid) on delete cascade
);