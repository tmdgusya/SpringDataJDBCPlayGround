DROP TABLE IF EXISTS `user`;

CREATE TABLE `test`.`user` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NULL,
    `province` VARCHAR(45) NULL,
    `gungu` VARCHAR(45) NULL,
    `detail_address` VARCHAR(45) NULL,
    PRIMARY KEY (`id`));