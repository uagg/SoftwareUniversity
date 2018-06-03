CREATE TABLE people (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
name VARCHAR(200) NOT NULL,
picture BLOB,
height DOUBLE(3,2),
weight DOUBLE(5,2),
gender ENUM('m','f') NOT NULL,
birthdate DATE NOT NULL,
biography LONGTEXT
);

INSERT INTO `minions`.`people`
(`name`,`picture`,`height`,`weight`,`gender`,`birthdate`,`biography`)
VALUES 
('BaiGosho','asd',1.74, 60,'m','1995-11-17','My Bio'),
('BaiGosho','asd',1.74, 60,'m','1995-11-17','My Bio'),
('BaiGosho','asd',1.74, 60,'m','1995-11-17','My Bio'),
('BaiGosho','asd',1.74, 60,'m','1995-11-17','My Bio');

CREATE TABLE minions.users (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
username VARCHAR(30),
password VARCHAR(26),
profile_picture BLOB,
last_login_time DATETIME,
is_deleted BOOLEAN
);

INSERT INTO minions.users
(`username`,`password`,`profile_picture`,`last_login_time`,`is_deleted`)
VALUES
('myName','213e432er#@','asd','1992-01-12 12:38:56', true),
('myName','213e432er#@','asd','1992-01-12 12:38:56', true),
('myName','213e432er#@','asd','1992-01-12 12:38:56', true),
('myName','213e432er#@','asd','1992-01-12 12:38:56', true),
('myName','213e432er#@','asd','1992-01-12 12:38:56', true);