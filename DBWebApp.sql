-- MariaDB dump 10.19  Distrib 10.7.3-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: web
-- ------------------------------------------------------
-- Server version	10.7.3-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Product_keyword`
--

DROP TABLE IF EXISTS `Product_keyword`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Product_keyword` (
  `table_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Product_table_Id` int(11) NOT NULL,
  `keyword` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`table_Id`),
  KEY `FK8cdn5pp1egavjaodlhqvo4eyx` (`Product_table_Id`),
  CONSTRAINT `FK8cdn5pp1egavjaodlhqvo4eyx` FOREIGN KEY (`Product_table_Id`) REFERENCES `products` (`table_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Product_keyword`
--

LOCK TABLES `Product_keyword` WRITE;
/*!40000 ALTER TABLE `Product_keyword` DISABLE KEYS */;
INSERT INTO `Product_keyword` VALUES
(2,4,'cartable');
/*!40000 ALTER TABLE `Product_keyword` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Product_permissionDetails`
--

DROP TABLE IF EXISTS `Product_permissionDetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Product_permissionDetails` (
  `table_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Product_table_Id` int(11) NOT NULL,
  `permissionDetails` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`table_Id`),
  KEY `FKkqxk6ocvcp7312r09djccffsw` (`Product_table_Id`),
  CONSTRAINT `FKkqxk6ocvcp7312r09djccffsw` FOREIGN KEY (`Product_table_Id`) REFERENCES `products` (`table_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Product_permissionDetails`
--

LOCK TABLES `Product_permissionDetails` WRITE;
/*!40000 ALTER TABLE `Product_permissionDetails` DISABLE KEYS */;
INSERT INTO `Product_permissionDetails` VALUES
(1,4,'android.permission.VIBRATE'),
(2,4,'android.permission.ACCESS_COARSE_LOCATION'),
(3,4,'android.permission.ACCESS_FINE_LOCATION'),
(4,4,'android.permission.INTERNET'),
(5,4,'android.permission.ACCESS_NETWORK_STATE'),
(6,4,'android.permission.RECEIVE_BOOT_COMPLETED'),
(7,4,'android.permission.WRITE_SYNC_SETTINGS'),
(8,4,'android.permission.WRITE_EXTERNAL_STORAGE'),
(9,4,'android.permission.READ_EXTERNAL_STORAGE'),
(10,4,'android.permission.WAKE_LOCK'),
(11,4,'com.android.launcher.permission.INSTALL_SHORTCUT'),
(12,4,'com.android.launcher.permission.UNINSTALL_SHORTCUT'),
(13,4,'android.permission.SYSTEM_ALERT_WINDOW'),
(14,4,'android.permission.CAMERA'),
(15,4,'android.permission.FLASHLIGHT'),
(16,4,'android.permission.STORAGE'),
(17,4,'android.permission.RECORD_AUDIO'),
(18,4,'android.permission.ACCESS_WIFI_STATE'),
(19,4,'android.permission.FOREGROUND_SERVICE'),
(20,4,'android.permission.REQUEST_INSTALL_PACKAGES'),
(21,4,'android.permission.GET_ACCOUNTS'),
(22,4,'android.permission.USE_CREDENTIALS'),
(23,4,'android.permission.AUTHENTICATE_ACCOUNTS'),
(24,4,'android.permission.MANAGE_ACCOUNTS'),
(25,4,'android.permission.KEY_ACCOUNT_AUTHENTICATOR_RESPONSE'),
(26,4,'com.google.android.c2dm.permission.RECEIVE');
/*!40000 ALTER TABLE `Product_permissionDetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `creation_time`
--

DROP TABLE IF EXISTS `creation_time`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `creation_time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isNull` bit(1) NOT NULL,
  `time` bigint(20) NOT NULL,
  `dayDate_id` int(11) DEFAULT NULL,
  `dayTime_id` int(11) DEFAULT NULL,
  `product_table_Id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3pxr2ilbty5eha6d1v9oy4v6t` (`dayDate_id`),
  KEY `FK4xiv6ck2tj90jqwcu2ii620sj` (`dayTime_id`),
  KEY `FK2ytylkt2kvplccbmwcjm2ehwt` (`product_table_Id`),
  CONSTRAINT `FK2ytylkt2kvplccbmwcjm2ehwt` FOREIGN KEY (`product_table_Id`) REFERENCES `products` (`table_Id`),
  CONSTRAINT `FK3pxr2ilbty5eha6d1v9oy4v6t` FOREIGN KEY (`dayDate_id`) REFERENCES `day_date` (`id`),
  CONSTRAINT `FK4xiv6ck2tj90jqwcu2ii620sj` FOREIGN KEY (`dayTime_id`) REFERENCES `day_time` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `creation_time`
--

LOCK TABLES `creation_time` WRITE;
/*!40000 ALTER TABLE `creation_time` DISABLE KEYS */;
INSERT INTO `creation_time` VALUES
(7,'\0',1590559494000,7,7,NULL),
(8,'\0',1632312505000,8,8,NULL);
/*!40000 ALTER TABLE `creation_time` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `day_date`
--

DROP TABLE IF EXISTS `day_date`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `day_date` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` int(11) NOT NULL,
  `dateTimeLong` bigint(20) DEFAULT NULL,
  `day` int(11) NOT NULL,
  `month` int(11) NOT NULL,
  `valid` bit(1) NOT NULL,
  `year` int(11) NOT NULL,
  `creationDateTime_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKs43wecpn4e2fdoexpvu3k2ax0` (`creationDateTime_id`),
  CONSTRAINT `FKs43wecpn4e2fdoexpvu3k2ax0` FOREIGN KEY (`creationDateTime_id`) REFERENCES `creation_time` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `day_date`
--

LOCK TABLES `day_date` WRITE;
/*!40000 ALTER TABLE `day_date` DISABLE KEYS */;
INSERT INTO `day_date` VALUES
(7,20200527,20200527000000,27,5,'',2020,NULL),
(8,20210922,20210922000000,22,9,'',2021,NULL);
/*!40000 ALTER TABLE `day_date` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `day_time`
--

DROP TABLE IF EXISTS `day_time`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `day_time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dateTimeLong` bigint(20) DEFAULT NULL,
  `dayTime` int(11) NOT NULL,
  `hour` int(11) NOT NULL,
  `minute` int(11) NOT NULL,
  `second` int(11) NOT NULL,
  `creationDateTime_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKiyhri5jm9yk4xeuucfwabv59s` (`creationDateTime_id`),
  CONSTRAINT `FKiyhri5jm9yk4xeuucfwabv59s` FOREIGN KEY (`creationDateTime_id`) REFERENCES `creation_time` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `day_time`
--

LOCK TABLES `day_time` WRITE;
/*!40000 ALTER TABLE `day_time` DISABLE KEYS */;
INSERT INTO `day_time` VALUES
(7,NULL,103454,10,34,54,NULL),
(8,NULL,153825,15,38,25,NULL);
/*!40000 ALTER TABLE `day_time` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequences`
--

DROP TABLE IF EXISTS `hibernate_sequences`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequences` (
  `id` int(11) DEFAULT NULL,
  `sequence_name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequences`
--

LOCK TABLES `hibernate_sequences` WRITE;
/*!40000 ALTER TABLE `hibernate_sequences` DISABLE KEYS */;
INSERT INTO `hibernate_sequences` VALUES
(NULL,'default',2);
/*!40000 ALTER TABLE `hibernate_sequences` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lastModifyDate_id`
--

DROP TABLE IF EXISTS `lastModifyDate_id`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lastModifyDate_id` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isNull` bit(1) NOT NULL,
  `time` bigint(20) NOT NULL,
  `dayDate_id` int(11) DEFAULT NULL,
  `dayTime_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK48kq6doye0pd9lf6nuvm3f3qm` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lastModifyDate_id`
--

LOCK TABLES `lastModifyDate_id` WRITE;
/*!40000 ALTER TABLE `lastModifyDate_id` DISABLE KEYS */;
/*!40000 ALTER TABLE `lastModifyDate_id` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `table_Id` int(11) NOT NULL AUTO_INCREMENT,
  `appCategoryID` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `appCategoryName` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `averageRateIndex` int(11) NOT NULL,
  `bulk` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `deletedSecond` bit(1) NOT NULL,
  `developer` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `downLoadLink` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fileSize` bigint(20) NOT NULL,
  `icon` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `iconThumbNail` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id` int(11) NOT NULL,
  `isDeleted` bit(1) NOT NULL,
  `minSDK` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `number_installs` int(11) NOT NULL,
  `osId` int(11) NOT NULL,
  `osName` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `osTypeId` int(11) NOT NULL,
  `osTypeName` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `packageName` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `publishState` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `shortDescription` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `targetSDK` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `versionCode` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `versionName` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `creationDateTime_id` int(11) DEFAULT NULL,
  `lastModifyDate_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`table_Id`),
  KEY `FK7vk497t065awila0ipvar9pbu` (`creationDateTime_id`),
  KEY `FKsy8hmi90qlpxxkt4h2nc4ow02` (`lastModifyDate_id`),
  CONSTRAINT `FK7vk497t065awila0ipvar9pbu` FOREIGN KEY (`creationDateTime_id`) REFERENCES `creation_time` (`id`),
  CONSTRAINT `FKsy8hmi90qlpxxkt4h2nc4ow02` FOREIGN KEY (`lastModifyDate_id`) REFERENCES `creation_time` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES
(4,'1001','general',0,NULL,'\0','امیرحسین حائریان@p.hadadan','http://85.133.232.226:12547/fileServer/download?key=58D0DA021CF3FCF96C83B9BCD7B2F0401.7932860604314762E14',23871412,NULL,NULL,1002,'\0','23',0,1000,'Android',1000,'ANDROID','io.cordova.cartable','منتشر شده','cartable','27','cartable','394031600','3.9.4.3.16.0',7,8);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-08  4:21:26
