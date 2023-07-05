CREATE TABLE `book`(
    `id`   int(20) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

insert into book(name) value ('Book 1');

insert into book(name) value ('Book 2');

insert into book(name) value ('Book 3');

CREATE TABLE `author`(
                       `id`   int(20) NOT NULL AUTO_INCREMENT,
                       `author_name` varchar(255) DEFAULT NULL,
                       PRIMARY KEY (`id`)
);

ALTER TABLE book add AUTHOR_ID int(11) DEFAULT NULL;

ALTER TABLE book ADD CONSTRAINT `FK_BOOK_AUTHOR_ID` FOREIGN KEY (`AUTHOR_ID`) REFERENCES `author` (`id`);