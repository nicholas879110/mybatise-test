/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.1.126
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : 192.168.1.126:3306
 Source Schema         : flume

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 19/06/2020 18:02:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `author_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `author`;
CREATE TABLE `author`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bio` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `favourite_section` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES (1, 'title-0', NULL);
INSERT INTO `blog` VALUES (2, 'title-1', NULL);
INSERT INTO `blog` VALUES (3, 'title-2', NULL);
INSERT INTO `blog` VALUES (4, 'title-3', NULL);
INSERT INTO `blog` VALUES (5, 'title-4', NULL);
INSERT INTO `blog` VALUES (6, 'title-5', NULL);
INSERT INTO `blog` VALUES (7, 'title-6', NULL);
INSERT INTO `blog` VALUES (8, 'title-7', NULL);
INSERT INTO `blog` VALUES (9, 'title-8', NULL);
INSERT INTO `blog` VALUES (10, 'title-9', NULL);
INSERT INTO `blog` VALUES (11, 'title-0', NULL);
INSERT INTO `blog` VALUES (12, 'title-1', NULL);
INSERT INTO `blog` VALUES (13, 'title-2', NULL);
INSERT INTO `blog` VALUES (14, 'title-3', NULL);
INSERT INTO `blog` VALUES (15, 'title-4', NULL);
INSERT INTO `blog` VALUES (16, 'title-5', NULL);
INSERT INTO `blog` VALUES (17, 'title-6', NULL);
INSERT INTO `blog` VALUES (18, 'title-7', NULL);
INSERT INTO `blog` VALUES (19, 'title-8', NULL);
INSERT INTO `blog` VALUES (20, 'title-9', NULL);
INSERT INTO `blog` VALUES (21, 'title-0', NULL);
INSERT INTO `blog` VALUES (22, 'title-1', NULL);
INSERT INTO `blog` VALUES (23, 'title-2', NULL);
INSERT INTO `blog` VALUES (24, 'title-3', NULL);
INSERT INTO `blog` VALUES (25, 'title-4', NULL);
INSERT INTO `blog` VALUES (26, 'title-5', NULL);
INSERT INTO `blog` VALUES (27, 'title-6', NULL);
INSERT INTO `blog` VALUES (28, 'title-7', NULL);
INSERT INTO `blog` VALUES (29, 'title-8', NULL);
INSERT INTO `blog` VALUES (30, 'title-9', NULL);
INSERT INTO `blog` VALUES (31, 'title-0', NULL);
INSERT INTO `blog` VALUES (32, 'title-1', NULL);
INSERT INTO `blog` VALUES (33, 'title-2', NULL);
INSERT INTO `blog` VALUES (34, 'title-3', NULL);
INSERT INTO `blog` VALUES (35, 'title-4', NULL);
INSERT INTO `blog` VALUES (36, 'title-5', NULL);
INSERT INTO `blog` VALUES (37, 'title-6', NULL);
INSERT INTO `blog` VALUES (38, 'title-7', NULL);
INSERT INTO `blog` VALUES (39, 'title-8', NULL);
INSERT INTO `blog` VALUES (40, 'title-9', NULL);
INSERT INTO `blog` VALUES (41, 'title-0', NULL);
INSERT INTO `blog` VALUES (42, 'title-1', NULL);
INSERT INTO `blog` VALUES (43, 'title-2', NULL);
INSERT INTO `blog` VALUES (44, 'title-3', NULL);
INSERT INTO `blog` VALUES (45, 'title-4', NULL);
INSERT INTO `blog` VALUES (46, 'title-5', NULL);
INSERT INTO `blog` VALUES (47, 'title-6', NULL);
INSERT INTO `blog` VALUES (48, 'title-7', NULL);
INSERT INTO `blog` VALUES (49, 'title-8', NULL);
INSERT INTO `blog` VALUES (50, 'title-9', NULL);

SET FOREIGN_KEY_CHECKS = 1;
