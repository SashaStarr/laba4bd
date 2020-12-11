CREATE DATABASE IF NOT EXISTS laba3bd DEFAULT CHARACTER SET utf8;
USE laba3bd;
SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS actors_cast;
DROP TABLE IF EXISTS autor;
DROP TABLE IF EXISTS description;
DROP TABLE IF EXISTS film;
DROP TABLE IF EXISTS interesting_facts_film;
DROP TABLE IF EXISTS priority;
DROP TABLE IF EXISTS rating;
DROP TABLE IF EXISTS review;
DROP TABLE IF EXISTS reviews_film;
DROP TABLE IF EXISTS story_about_main_actor;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE film (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
duration_in_minutes INT NOT NULL,
director VARCHAR(50) NOT NULL,
premiere_date DATE NOT NULL,
budget_in_dollars INT NOT NULL,
profit_in_dollars INT NULL
) ENGINE = INNODB;

CREATE INDEX duration_in_minutes ON film(duration_in_minutes);

CREATE TABLE interesting_facts_film (
autor_id BIGINT PRIMARY KEY,
interest VARCHAR(50) NOT NULL,
fact VARCHAR(50) NOT NULL,
film_id INT NOT NULL
) ENGINE = INNODB;

CREATE TABLE autor (
id BIGINT AUTO_INCREMENT PRIMARY KEY ,
autor VARCHAR(50) NOT NULL
) ENGINE = INNODB;

ALTER TABLE interesting_facts_film
ADD CONSTRAINT FK_interesting_facts_film_autor
FOREIGN KEY (autor_id)
REFERENCES autor (id);

CREATE TABLE actors_cast (
id BIGINT AUTO_INCREMENT NOT NULL,
film_id BIGINT NOT NULL,
PRIMARY KEY (id,film_id),
numbers_actors INT NOT NULL,
name_and_surname_main_actor VARCHAR(100) NOT NULL
) ENGINE = INNODB;

CREATE INDEX name_and_surname_main_actor ON actors_cast(name_and_surname_main_actor);

ALTER TABLE actors_cast
ADD CONSTRAINT FK_actors_cast_film
FOREIGN KEY (film_id)
REFERENCES film (id);

CREATE TABLE story_about_main_actor (
actors_cast_id BIGINT PRIMARY KEY,
story VARCHAR(100) NOT NULL
) ENGINE = INNODB;

ALTER TABLE story_about_main_actor
ADD CONSTRAINT FK_story_about_main_actor_actors_cast
FOREIGN KEY (actors_cast_id)
REFERENCES actors_cast (id);

CREATE TABLE description (
film_id BIGINT PRIMARY KEY,
description VARCHAR(200) NOT NULL
) ENGINE = INNODB;

ALTER TABLE description
ADD CONSTRAINT FK_description_film
FOREIGN KEY (film_id)
REFERENCES film (id);

CREATE TABLE rating (
film_id BIGINT NOT NULL,
priority_id BIGINT NOT NULL,
PRIMARY KEY (film_id,priority_id),
rating FLOAT NOT NULL
) ENGINE = INNODB;


CREATE TABLE priority (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
priority INT NOT NULL
) ENGINE = INNODB;

ALTER TABLE rating
ADD CONSTRAINT FK_rating_film
FOREIGN KEY (film_id)
REFERENCES film (id),
ADD CONSTRAINT FK_rating_priority
FOREIGN KEY (priority_id)
REFERENCES priority (id);

CREATE TABLE reviews_film (
film_id BIGINT NOT NULL,
review_id BIGINT NOT NULL,
PRIMARY KEY (film_id,review_id)
) ENGINE = INNODB;

CREATE TABLE review (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
autor VARCHAR(200) NOT NULL,
text VARCHAR(200) NOT NULL,
time_writing VARCHAR(200) NOT NULL
) ENGINE = INNODB;

ALTER TABLE reviews_film
ADD CONSTRAINT FK_reviews_film_film
FOREIGN KEY (film_id)
REFERENCES film (id),
ADD CONSTRAINT FK_reviews_film_review
FOREIGN KEY (review_id)
REFERENCES review (id);

INSERT INTO film (id, name,duration_in_minutes,director,premiere_date,budget_in_dollars,profit_in_dollars) VALUES
(1, 'SmartManDevs',111,'Tom','2012-10-10',1414214,141214),
(2, 'SmartManCustomer',123,'Jarry','2013-03-23',213123,131231),
(3, 'SmartManTesters',124,'Merry','2014-03-24',3121,312131),
(4, 'Back',145,'Pevdvrry','2015-03-22',1233213,1341123),
(5, 'Lost',143,'Perdvrvy','2015-03-22',1232313,13113123),
(6, 'Error',111,'Pvderrvy','2015-03-22',1322313,131131223),
(7, 'Max',131,'Perdrvy','2015-03-22',12321313,131321123),
(8, 'Well done',132,'Pvvderry','2015-03-22',12132313,1331123),
(9, 'Smart',131,'Pervvdry','2015-03-22',1232313,13112233),
(10, 'Man',142,'Perrvdvvy','2015-03-22',1232313,131123123),
(11, 'Women',123,'Pedvvrry','2015-03-22',12332113,131131223),
(12, 'Hi,Tony',142,'Pevdrry','2015-03-22',12123313,131123323),
(13, 'Hello',233,'Perrddy','2015-03-22',1232313,13113223),
(14, 'Mister Jack',123,'Pevvrry','2015-03-22',1322313,13132123),
(15, 'Tom and Jerry',145,'Perrsvdsy','2015-03-22',1112313,13113223);

INSERT INTO autor (id,autor) VALUES
(1,'frfrfsr'),
(2,'frsfrfr'),
(3,'frsfrrr'),
(4,'frfrfrsr'),
(5,'frsfrfr'),
(6,'frfrfsr'),
(7,'frsfrrr'),
(8,'frsfrfrr'),
(9,'frsfrfr'),
(10,'frfrfsr'),
(11,'frsfrfrr'),
(12,'frsrrfrf'),
(13,'frfrfsr'),
(14,'ffrrrsr'),
(15,'frfrsr');

INSERT INTO interesting_facts_film(autor_id,interest,fact,film_id) VALUES
(1,'ewf','ffwe',5),
(2,'efwf','fwf',4),
(3,'fw','few',3),
(4,'fwew','fww',2),
(7,'ewf','fwe',1),
(5,'wef','fwe',6),
(6,'ewf','fwe',7),
(8,'wefe','efwe',9),
(9,'fewf','fwe',10),
(10,'fwew','fwew',8),
(11,'wfeef','fwe',12),
(13,'wfe','fwewe',11),
(12,'fewff','wew',13),
(14,'efwf','fwe',14),
(15,'efwf','fwef',15);

INSERT INTO actors_cast (id,film_id,numbers_actors,name_and_surname_main_actor) VALUES
(1,15,12,'rfs'),
(2,14,32,'esf'),
(3,13,11,'efs'),
(4,12,12,'sefe'),
(5,11,8,'fse'),
(6,10,6,'fese'),
(7,9,6,'fsef'),
(8,8,5,'fsefef'),
(9,7,6,'fesfef'),
(10,6,7,'sefef'),
(11,5,8,'fese'),
(12,4,2,'sfefs'),
(13,3,5,'fese'),
(14,2,6,'fesfe'),
(15,1,6,'efsf');

INSERT INTO story_about_main_actor(actors_cast_id,story) VALUES
(1,'rer'),
(2,'rvdfv'),
(3,'rfsf'),
(4,'frdfr'),
(5,'frsrf'),
(7,'ffe'),
(6,'efesf'),
(8,'fesee'),
(9,'fesrfs'),
(10,'efsfe'),
(11,'fesf'),
(12,'efs'),
(13,'wef3'),
(14,'fsrfsrf'),
(15,'efsef');

INSERT INTO description(film_id,description) VALUES
(1,'rer'),
(2,'rvdfv'),
(3,'rfsf'),
(4,'frdfr'),
(5,'frsrf'),
(7,'ffe'),
(6,'efesf'),
(8,'fesee'),
(9,'fesrfs'),
(10,'efsfe'),
(11,'fesf'),
(12,'efs'),
(13,'wef3'),
(14,'fsrfsrf'),
(15,'efsef');

INSERT INTO priority (id,priority) VALUES
(1,2),
(2,13),
(3,21),
(4,233),
(5,244),
(6,21),
(7,1),
(8,131),
(9,223),
(10,233),
(11,21),
(12,22),
(13,23),
(14,24),
(15,25);

INSERT INTO rating (film_id,priority_id,rating) VALUES
(1,2,9.8),(2,1,2.2),(3,4,2.3),(4,3,5.5),(5,5,7.7),(6,6,6.6),(7,7,3.3),(8,8,4.5),(9,9,7.7),(10,10,9.5),(11,11,3.5),(12,12,6.7),(13,13,7.8),(15,14,8.9),(14,15,9.8);

INSERT INTO review(id,autor,text,time_writing) VALUES
(1,'frsf','fe','fesf'),
(2,'frsf','fe','fesf'),
(3,'frsf','fe','fesf'),
(4,'frsf','fe','fesf'),
(5,'frsf','fe','fesf'),
(6,'frsf','fe','fesf'),
(7,'frsf','fe','fesf'),
(8,'frsf','fe','fesf'),
(9,'frsf','fe','fesf'),
(10,'frsf','fe','fesf'),
(11,'frsf','fe','fesf'),
(12,'frsf','fe','fesf'),
(13,'frsf','fe','fesf'),
(14,'frsf','fe','fesf'),
(15,'frsf','fe','fesf');

INSERT INTO reviews_film (film_id,review_id) VALUES
(1,2),(2,1),(3,4),(4,3),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10),(11,11),(12,12),(13,13),(15,14),(14,15);
