CREATE TABLE IF NOT EXISTS `t_goods`(
   `id` INT AUTO_INCREMENT,
   `name` VARCHAR(100) NOT NULL,
   `qrcode` VARCHAR(100) NULL UNIQUE,
   `category` INT DEFAULT 0 COMMENT '货物类别，1. 饮料',
   `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `modify_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
   PRIMARY KEY (`id` )
);