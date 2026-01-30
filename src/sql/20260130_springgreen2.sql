-- MySQL dump 10.13  Distrib 8.0.44, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: springgreen2
-- ------------------------------------------------------
-- Server version	8.0.44

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `jptmember`
--

DROP TABLE IF EXISTS `jptmember`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jptmember` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `mem_id` varchar(20) NOT NULL,
  `mem_pw` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `gender` char(2) DEFAULT '남자',
  `phone` varchar(15) NOT NULL,
  `pt_count` int DEFAULT '0',
  `content` text,
  `joindate` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idx`),
  UNIQUE KEY `mem_id` (`mem_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jptmember`
--

LOCK TABLES `jptmember` WRITE;
/*!40000 ALTER TABLE `jptmember` DISABLE KEYS */;
INSERT INTO `jptmember` VALUES (1,'pt_user1','1234','김헬스','M','010-1234-5678',20,'허리 디스크 주의','2026-01-29 12:09:55');
/*!40000 ALTER TABLE `jptmember` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jpttrainer`
--

DROP TABLE IF EXISTS `jpttrainer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jpttrainer` (
  `t_idx` int NOT NULL AUTO_INCREMENT,
  `t_name` varchar(20) NOT NULL,
  `t_phone` varchar(15) NOT NULL,
  `specialty` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`t_idx`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jpttrainer`
--

LOCK TABLES `jpttrainer` WRITE;
/*!40000 ALTER TABLE `jpttrainer` DISABLE KEYS */;
INSERT INTO `jpttrainer` VALUES (1,'김선생','010-8765-4321','재활');
/*!40000 ALTER TABLE `jpttrainer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-01-30 16:40:37
