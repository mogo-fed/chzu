/*
Navicat MySQL Data Transfer

Source Server         : xyz
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : takeout

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-03-22 21:45:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for assess
-- ----------------------------
DROP TABLE IF EXISTS `assess`;
CREATE TABLE `assess` (
  `as_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `as_time` datetime DEFAULT NULL,
  `as_content` varchar(255) DEFAULT NULL COMMENT '用户评价表',
  PRIMARY KEY (`as_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of assess
-- ----------------------------

-- ----------------------------
-- Table structure for menu_detail
-- ----------------------------
DROP TABLE IF EXISTS `menu_detail`;
CREATE TABLE `menu_detail` (
  `md_id` int(100) NOT NULL AUTO_INCREMENT,
  `menu_sort_id` int(100) DEFAULT NULL,
  `md_name` varchar(255) DEFAULT NULL,
  `md_img` varchar(255) DEFAULT NULL,
  `md_price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`md_id`),
  KEY `b_id` (`menu_sort_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu_detail
-- ----------------------------

-- ----------------------------
-- Table structure for menu_sort
-- ----------------------------
DROP TABLE IF EXISTS `menu_sort`;
CREATE TABLE `menu_sort` (
  `ms_id` int(100) NOT NULL AUTO_INCREMENT,
  `user_id` int(100) DEFAULT NULL,
  `ms_name` varchar(255) DEFAULT NULL,
  `ms_sort` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ms_id`),
  KEY `b_id` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu_sort
-- ----------------------------

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `or_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `or_time` datetime DEFAULT NULL,
  `or_name` varchar(255) DEFAULT NULL,
  `or_price` decimal(10,2) DEFAULT NULL,
  `or_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`or_id`),
  KEY `u_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `user_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '用户表',
  `user_name` varchar(255) DEFAULT NULL,
  `user_pwd` varchar(255) DEFAULT NULL,
  `user_tel` varchar(255) DEFAULT NULL,
  `user_adr` varchar(255) DEFAULT NULL COMMENT '用户地址',
  `user_type` varchar(11) DEFAULT NULL COMMENT '标志用户类型 普通用户/商家',
  `user_sellername` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('5', 'xyz', '123', '111111111', '11111', '1', null);
INSERT INTO `users` VALUES ('41', 'shangjia', '000', '15212036751', 'chuzhou', '1', 'malatang');
