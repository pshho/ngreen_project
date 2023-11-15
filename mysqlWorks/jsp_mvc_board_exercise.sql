create table ex_board(
	id int auto_increment primary key,
    title varchar(200) not null,
    content text not null,
    wname varchar(100) not null,
    reg_date timestamp,
    pw varchar(50),
    upfile varchar(200),
    cnt int,
    seq int,
    lev int,
    gid int
);

insert into ex_board (id, title, content, wname, reg_date, pw, cnt, seq, lev, gid)
values
(1, '첫번째', '안녕하세요\n 나는 일번입니다.', '난일', now(), '1234', 0, 0, 0, 1),
(2, '두번째', '안녕하세요\n 나는 이번입니다.\n abcdefg', '난이', now(), '1234', 0, 0, 0, 2),
(3, '세번째', '안녕하세요\n 나는 삼번입니다. \n abcdefg', '난삼', now(), '5678', 0, 0, 0, 3),
(4, '네번째', '안녕하세요\n 나는 사번입니다. \n abcdefg \n 야야야야야야', '난사', now(), '9012', 0, 0, 0, 4),
(5, '다섯번째', '안녕하세요\n 나는 오번입니다. \n abcdefg \n 야야야야야야', '난오', now(), '3456', 0, 0, 0, 5),
(6, '여섯번째', '안녕하세요\n 나는 육번입니다. \n abcdefg \n 야야야야야야 \n 1234567890', '난육', now(), '7890', 0, 0, 0, 6),
(7, '일곱번째', '안녕하세요\n 나는 칠번입니다. \n abcdefg \n 야야야야야야 \n 1234567890', '난칠', now(), '1234', 0, 0, 0, 7);

select * from ex_board;