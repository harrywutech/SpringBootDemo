use test;

create table user (
	user_id			varchar(36) 		not null,
    password 		varchar(36) 		not null,
    primary key(user_id)
) engine= InnoDB charset =utf8mb4; 

ALTER TABLE user ADD photo VARCHAR(100);

alter table user modify column photo varchar(110) not null;

alter table user change column photo avator varchar(100) not null;

insert into user (password, user_id, avator) values ('123', '1', 'http://dfadsf');

select avator, password  from user where user_id = '1';

select *  from user where user_id = '1';

update user set password="456" where user_id = "1";
