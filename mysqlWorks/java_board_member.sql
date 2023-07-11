-- Members 프로젝트
-- 회원 테이블
use mydb;

create table members(
	memberid	varchar(20),
    passwd		varchar(20) not null,
    name		varchar(30) not null,
    gender		varchar(10),
    joindate	timestamp default now(),
    primary key(memberid)
);

-- 게시판 테이블
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

select * from members;
select * from boards;

INSERT INTO boards(title, contents, memberid) VALUES('안녕', '가입인사', 'test1');