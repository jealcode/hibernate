CREATE DATABASE `hibernate`;
USE `hibernate`;
CREATE TABLE `autos` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `marca` varchar(255) NOT NULL default '',
  `modelo` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`id`)
);