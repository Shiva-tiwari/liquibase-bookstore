CREATE TABLE `book`(
    `id`   bigint(20) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

insert into book(name) value ('Book 1');

insert into book(name) value ('Book 2');

insert into book(name) value ('Book 3');