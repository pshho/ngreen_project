create table boards(
	bid			int primary key auto_increment,
    title		varchar(100) not null,
    contents	text,
    regdate		timestamp default now(),
    modifydate	timestamp,
    hit			int default 0,
    memberid	varchar(20),
    fileuploads	varchar(50),
    constraint fk_member_board foreign key(memberid)
    references members(memberid) on delete cascade
);