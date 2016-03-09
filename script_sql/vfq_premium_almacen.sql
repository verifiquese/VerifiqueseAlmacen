-- MySQL dump 10.13  Distrib 5.5.46, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: vfq_premium_almacen
-- ------------------------------------------------------
-- Server version	5.5.46-0ubuntu0.14.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `vfq_premium_almacen`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `vfq_premium_almacen` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `vfq_premium_almacen`;

--
-- Table structure for table `document`
--

DROP TABLE IF EXISTS `document`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `document` (
  `id_document` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `second_name` varchar(300) COLLATE utf8_bin DEFAULT NULL,
  `first_surname` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `second_surname` varchar(300) COLLATE utf8_bin DEFAULT NULL,
  `citizen_id` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `birthdate` varchar(100) DEFAULT NULL,
  `blood_type` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `blood_rh` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `creation_date` datetime DEFAULT NULL,
  `country` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `document_type` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `user_name` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `reading_date` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `latitud` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `longitud` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id_document`),
  KEY `FK_document` (`user_name`),
  CONSTRAINT `FK_document` FOREIGN KEY (`user_name`) REFERENCES `users` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document`
--

LOCK TABLES `document` WRITE;
/*!40000 ALTER TABLE `document` DISABLE KEYS */;


/*!40000 ALTER TABLE `document` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groups`
--

DROP TABLE IF EXISTS `groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups` (
  `id_group` int(11) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `group_name` varchar(100) NOT NULL,
  PRIMARY KEY (`id_group`),
  KEY `user_name` (`user_name`),
  CONSTRAINT `groups_ibfk_1` FOREIGN KEY (`user_name`) REFERENCES `users` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups`
--

LOCK TABLES `groups` WRITE;
/*!40000 ALTER TABLE `groups` DISABLE KEYS */;
INSERT INTO `groups` VALUES (1,'test','Cliente');
/*!40000 ALTER TABLE `groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user_name` varchar(100) NOT NULL,
  `passwd` varchar(200) NOT NULL,
  PRIMARY KEY (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('test','1f5680fe6d39fdffdc68fae731be329e018f665fdf83cd4f196e3b3b59aa8e9108e399b053cfc654c21d9f2c795742e55fae93493bf8bebe4bd261ba4c4aff52');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-02-01 16:17:42
