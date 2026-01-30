show tables;

-- varchar / char / text

create table jPtMember (
	idx int not null auto_increment primary key,	-- 고유 번호
	mem_id    varchar(20) not null unique,        -- 로그인 아이디
  mem_pw    varchar(20) not null,               -- 비밀번호
  name      varchar(20) not null,               -- 이름
  gender    char(2) DEFAULT '남자',								-- 성별 (남자/여자)
  phone     varchar(15) not null,               -- 연락처
  pt_count  int default 0,                      -- 남은 PT 횟수
  content   TEXT,                               -- 특이사항 (지병, 운동 목적 등)
  joindate  DATETIME default NOW()              -- 가입일
);

desc jPtMember;
-- desc jproduct;

-- drop table jPtMember;
-- drop table jproduct;

select * from jPtMember;

insert into jPtMember (mem_id, mem_pw, name, gender, phone, pt_count, content)
value ('pt_user1', '1234', '김헬스', 'M', '010-1234-5678', 20, '허리 디스크 주의');


create table jPtTrainer (
	t_idx int not null auto_increment primary key,	-- 트레이너 고유 번호
	t_name      varchar(20) not null,          			-- 트레이너 이름
	t_phone     varchar(15) not null,            	  -- 트레이너 연락처
	specialty		varchar(30)													-- 전문분야 (다이어트, 재활...)
);

select * from jPtTrainer;

insert into jPtTrainer (t_name, t_phone, specialty)
value ('김선생', '010-8765-4321','재활');



