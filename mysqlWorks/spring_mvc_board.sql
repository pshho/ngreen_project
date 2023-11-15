create table board(
    pid int auto_increment primary key,
    title varchar(100),
    writer varchar(100),
    pw varchar(100),
    upfile varchar(100),
    content text,
    reg_date timestamp default now(),
    cnt int,
    seq int,
    lev int,
    rid int
);

create table reply(
	repid int auto_increment primary key,
    content varchar(3000),
    re_writer varchar(100),
    re_reg_date timestamp default now(),
    seq int,
    lev int,
    gid int,
    gpid int
);

drop table board;
drop table reply;

select max(seq) from board;
select count(*) from board;
select count(*) from board where pid > (select pid from board where seq = (select max(seq) from board));
select * from board order by rid desc, seq;
select * from board;
select * from reply;
select * from reply order by gid desc, seq;
select * from board where pid = 9 and pw = 'awe';

insert into board(title, writer, pw, content, cnt, seq, lev, rid)
values
('ㄱ', 'ㄱ', 1, 'ㄱ', 0, 0, 0, 1),
('ㄴ', 'ㄴ', 1, 'ㄴ', 0, 0, 0, 2),
('ㄷ', 'ㄷ', 1, 'ㄷ', 0, 0, 0, 3),
('ㄹ', 'ㄹ', 1, 'ㄹ', 0, 0, 0, 4),
('ㅁ', 'ㅁ', 1, 'ㅁ', 0, 0, 0, 5),
('ㄱ', 'ㄱ', 1, 'ㄱ', 0, 0, 0, 6),
('ㄴ', 'ㄴ', 1, 'ㄴ', 0, 0, 0, 7),
('ㄷ', 'ㄷ', 1, 'ㄷ', 0, 0, 0, 8),
('ㄹ', 'ㄹ', 1, 'ㄹ', 0, 0, 0, 9),
('ㅁ', 'ㅁ', 1, 'ㅁ', 0, 0, 0, 10),
('ㄱ', 'ㄱ', 1, 'ㄱ', 0, 0, 0, 11),
('ㄴ', 'ㄴ', 1, 'ㄴ', 0, 0, 0, 12),
('ㄷ', 'ㄷ', 1, 'ㄷ', 0, 0, 0, 13),
('ㄹ', 'ㄹ', 1, 'ㄹ', 0, 0, 0, 14),
('ㅁ', 'ㅁ', 1, 'ㅁ', 0, 0, 0, 15),
('ㄱ', 'ㄱ', 1, 'ㄱ', 0, 0, 0, 16),
('ㄴ', 'ㄴ', 1, 'ㄴ', 0, 0, 0, 17),
('ㄷ', 'ㄷ', 1, 'ㄷ', 0, 0, 0, 18),
('ㄹ', 'ㄹ', 1, 'ㄹ', 0, 0, 0, 19),
('ㅁ', 'ㅁ', 1, 'ㅁ', 0, 0, 0, 20),
('ㄱ', 'ㄱ', 1, 'ㄱ', 0, 0, 0, 21),
('ㄴ', 'ㄴ', 1, 'ㄴ', 0, 0, 0, 22),
('ㄷ', 'ㄷ', 1, 'ㄷ', 0, 0, 0, 23),
('ㄹ', 'ㄹ', 1, 'ㄹ', 0, 0, 0, 24),
('ㅁ', 'ㅁ', 1, 'ㅁ', 0, 0, 0, 25),
('ㄱ', 'ㄱ', 1, 'ㄱ', 0, 0, 0, 26),
('ㄴ', 'ㄴ', 1, 'ㄴ', 0, 0, 0, 27),
('ㄷ', 'ㄷ', 1, 'ㄷ', 0, 0, 0, 28),
('ㄹ', 'ㄹ', 1, 'ㄹ', 0, 0, 0, 29),
('ㅁ', 'ㅁ', 1, 'ㅁ', 0, 0, 0, 30),
('ㄱ', 'ㄱ', 1, 'ㄱ', 0, 0, 0, 31),
('ㄴ', 'ㄴ', 1, 'ㄴ', 0, 0, 0, 32),
('ㄷ', 'ㄷ', 1, 'ㄷ', 0, 0, 0, 33),
('ㄹ', 'ㄹ', 1, 'ㄹ', 0, 0, 0, 34),
('ㅁ', 'ㅁ', 1, 'ㅁ', 0, 0, 0, 35),
('ㄱ', 'ㄱ', 1, 'ㄱ', 0, 0, 0, 36),
('ㄴ', 'ㄴ', 1, 'ㄴ', 0, 0, 0, 37),
('ㄷ', 'ㄷ', 1, 'ㄷ', 0, 0, 0, 38),
('ㄹ', 'ㄹ', 1, 'ㄹ', 0, 0, 0, 39),
('ㅁ', 'ㅁ', 1, 'ㅁ', 0, 0, 0, 40);

insert into reply(content, re_writer, seq, lev, gid, gpid)
values
('댓글댓글댓글', 'awge', 0, 0, 1, 80),
('댓글댓글댓글', 'awge', 0, 0, 2, 80),
('댓글댓글댓글', 'awge', 0, 0, 3, 80),
('댓글댓글댓글', 'awge', 0, 0, 4, 80),
('댓글댓글댓글', 'awge', 0, 0, 5, 80);

delete from board where pid = 10;
update board set upfile = "" where pid = 4;
select * from board order by rid desc, seq;
select max(pid) from board;

delete from reply where repid = 62;