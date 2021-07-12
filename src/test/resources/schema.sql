DROP TABLE IF EXISTS `user`;

CREATE TABLE `test`.`user` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NULL,
    `province` VARCHAR(45) NULL,
    `gungu` VARCHAR(45) NULL,
    `detail_address` VARCHAR(45) NULL,
    PRIMARY KEY (`id`));

CREATE TABLE `test`.`post` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(45) NULL,
    `user_id` INT(11),
    PRIMARY KEY (`id`));