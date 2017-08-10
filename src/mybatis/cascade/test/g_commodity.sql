/*
Navicat MariaDB Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 100120
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MariaDB
Target Server Version : 100120
File Encoding         : 65001

Date: 2017-08-11 00:00:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for g_commodity
-- ----------------------------
DROP TABLE IF EXISTS `g_commodity`;
CREATE TABLE `g_commodity` (
  `fd_id` varchar(255) NOT NULL,
  `fd_name` varchar(255) DEFAULT NULL,
  `fd_price` double(10,2) DEFAULT NULL,
  `fd_describe` varchar(500) DEFAULT NULL,
  `fd_reserve` int(11) DEFAULT NULL,
  PRIMARY KEY (`fd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of g_commodity
-- ----------------------------
INSERT INTO `g_commodity` VALUES ('s01', '智能手机', '998.00', '安卓系统的哦', '1000');
INSERT INTO `g_commodity` VALUES ('s02', '平板电脑', '1000.00', '超炫酷的外形', '100');
INSERT INTO `g_commodity` VALUES ('s03', '笔记本电脑', '5000.00', '土星人', '500');
INSERT INTO `g_commodity` VALUES ('s04', '高级风扇', '110.00', '某佳', '2000');

-- ----------------------------
-- Table structure for g_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `g_order_detail`;
CREATE TABLE `g_order_detail` (
  `fd_id` varchar(50) NOT NULL,
  `fd_order_id` varchar(50) DEFAULT NULL,
  `fd_commodity_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`fd_id`),
  KEY `fd_order_id` (`fd_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of g_order_detail
-- ----------------------------
INSERT INTO `g_order_detail` VALUES ('mx01', 'd01', 's01');
INSERT INTO `g_order_detail` VALUES ('mx02', 'd02', 's01');
INSERT INTO `g_order_detail` VALUES ('mx03', 'd01', 's03');
INSERT INTO `g_order_detail` VALUES ('mx04', 'd01', 's03');
INSERT INTO `g_order_detail` VALUES ('mx05', 'd01', 's04');
INSERT INTO `g_order_detail` VALUES ('mx06', 'd01', 's03');
INSERT INTO `g_order_detail` VALUES ('mx07', 'd02', 's02');
INSERT INTO `g_order_detail` VALUES ('mx08', 'd03', 's01');
INSERT INTO `g_order_detail` VALUES ('mx09', 'd03', 's04');
INSERT INTO `g_order_detail` VALUES ('mx10', 'd03', 's02');

-- ----------------------------
-- Table structure for g_order_item
-- ----------------------------
DROP TABLE IF EXISTS `g_order_item`;
CREATE TABLE `g_order_item` (
  `fd_id` varchar(50) NOT NULL,
  `fd_order_id` varchar(50) DEFAULT NULL,
  `fd_order_detail_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`fd_id`),
  KEY `FK_order_id` (`fd_order_id`),
  KEY `FK_order_detail_id` (`fd_order_detail_id`),
  CONSTRAINT `FK_order_detail_id` FOREIGN KEY (`fd_order_detail_id`) REFERENCES `g_order_detail` (`fd_id`),
  CONSTRAINT `FK_order_id` FOREIGN KEY (`fd_order_id`) REFERENCES `g_order_detail` (`fd_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of g_order_item
-- ----------------------------
INSERT INTO `g_order_item` VALUES ('odm01', 'd01', 'mx01');
INSERT INTO `g_order_item` VALUES ('odm03', 'd01', 'mx04');
INSERT INTO `g_order_item` VALUES ('odm04', 'd01', 'mx05');
INSERT INTO `g_order_item` VALUES ('odm05', 'd01', 'mx06');
INSERT INTO `g_order_item` VALUES ('odm06', 'd02', 'mx02');
INSERT INTO `g_order_item` VALUES ('odm07', 'd02', 'mx07');
INSERT INTO `g_order_item` VALUES ('odm08', 'd03', 'mx08');
INSERT INTO `g_order_item` VALUES ('odm09', 'd03', 'mx09');
INSERT INTO `g_order_item` VALUES ('odm10', 'd03', 'mx10');

-- ----------------------------
-- Table structure for g_orders
-- ----------------------------
DROP TABLE IF EXISTS `g_orders`;
CREATE TABLE `g_orders` (
  `fd_id` varchar(50) NOT NULL,
  `fd_name` varchar(255) DEFAULT NULL,
  `fd_total_prices` double DEFAULT NULL,
  `fd_order_datetime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `fd_user_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`fd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of g_orders
-- ----------------------------
INSERT INTO `g_orders` VALUES ('d01', '小明的订单01', null, '2017-08-10 19:41:40', 'u01');
INSERT INTO `g_orders` VALUES ('d02', '小明的订单02', null, '2017-08-10 19:41:41', 'u01');
INSERT INTO `g_orders` VALUES ('d03', '小宝的订单01', null, '2017-08-10 19:41:44', 'u02');

-- ----------------------------
-- Table structure for g_user
-- ----------------------------
DROP TABLE IF EXISTS `g_user`;
CREATE TABLE `g_user` (
  `fd_id` varchar(50) NOT NULL,
  `fd_name` varchar(255) DEFAULT NULL,
  `fd_phone` varchar(20) DEFAULT NULL,
  `fd_address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of g_user
-- ----------------------------
INSERT INTO `g_user` VALUES ('u01', '小明', '13125383665', '江西赣州');
INSERT INTO `g_user` VALUES ('u02', '小宝', '13125358666', '江西会昌');
