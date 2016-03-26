CREATE DATABASE  IF NOT EXISTS `swiggy_menu` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `swiggy_menu`;
-- MySQL dump 10.13  Distrib 5.6.27, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: swiggy_menu
-- ------------------------------------------------------
-- Server version	5.6.27-0ubuntu0.14.04.1

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
-- Table structure for table `siwggy_add_on`
--

DROP TABLE IF EXISTS `siwggy_add_on`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `siwggy_add_on` (
  `id_add_on` int(11) NOT NULL,
  `item_id` int(11) DEFAULT NULL,
  `desc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_add_on`),
  KEY `fk_siwggy_add_on_1_idx` (`item_id`),
  CONSTRAINT `fk_siwggy_add_on_1` FOREIGN KEY (`item_id`) REFERENCES `swiggy_item_details` (`idswiggy_item_details`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `siwggy_add_on`
--

LOCK TABLES `siwggy_add_on` WRITE;
/*!40000 ALTER TABLE `siwggy_add_on` DISABLE KEYS */;
/*!40000 ALTER TABLE `siwggy_add_on` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swiggy_add_on_details`
--

DROP TABLE IF EXISTS `swiggy_add_on_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `swiggy_add_on_details` (
  `id_add_on_details` int(11) NOT NULL,
  `add_on_id` int(11) DEFAULT NULL,
  `add_on_name` varchar(45) DEFAULT NULL,
  `add_on_desc` varchar(45) DEFAULT NULL,
  `is_add_on_active` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_add_on_details`),
  KEY `fk_swiggy_add_on_details_1_idx` (`add_on_id`),
  CONSTRAINT `fk_swiggy_add_on_details_1` FOREIGN KEY (`add_on_id`) REFERENCES `siwggy_add_on` (`id_add_on`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swiggy_add_on_details`
--

LOCK TABLES `swiggy_add_on_details` WRITE;
/*!40000 ALTER TABLE `swiggy_add_on_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `swiggy_add_on_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swiggy_item_details`
--

DROP TABLE IF EXISTS `swiggy_item_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `swiggy_item_details` (
  `idswiggy_item_details` int(11) NOT NULL,
  `sub_category_id` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `itemDesc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idswiggy_item_details`),
  KEY `fk_swiggy_item_details_1_idx` (`sub_category_id`),
  CONSTRAINT `fk_swiggy_item_details_1` FOREIGN KEY (`sub_category_id`) REFERENCES `swiggy_menu_subcategory` (`id_menu_subcategory`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swiggy_item_details`
--

LOCK TABLES `swiggy_item_details` WRITE;
/*!40000 ALTER TABLE `swiggy_item_details` DISABLE KEYS */;
INSERT INTO `swiggy_item_details` VALUES (11,1,'Pizza Special','Pizza special');
/*!40000 ALTER TABLE `swiggy_item_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swiggy_main_category`
--

DROP TABLE IF EXISTS `swiggy_main_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `swiggy_main_category` (
  `id_main_category` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `desc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_main_category`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swiggy_main_category`
--

LOCK TABLES `swiggy_main_category` WRITE;
/*!40000 ALTER TABLE `swiggy_main_category` DISABLE KEYS */;
INSERT INTO `swiggy_main_category` VALUES (1,'Pizza',NULL);
/*!40000 ALTER TABLE `swiggy_main_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swiggy_menu_subcategory`
--

DROP TABLE IF EXISTS `swiggy_menu_subcategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `swiggy_menu_subcategory` (
  `id_menu_subcategory` int(11) NOT NULL,
  `main_category_id` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `desc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_menu_subcategory`),
  KEY `fk_swiggy_menu_subcategory_1_idx` (`main_category_id`),
  CONSTRAINT `fk_swiggy_menu_subcategory_1` FOREIGN KEY (`main_category_id`) REFERENCES `swiggy_main_category` (`id_main_category`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swiggy_menu_subcategory`
--

LOCK TABLES `swiggy_menu_subcategory` WRITE;
/*!40000 ALTER TABLE `swiggy_menu_subcategory` DISABLE KEYS */;
INSERT INTO `swiggy_menu_subcategory` VALUES (1,1,'pizza_sub','pizza_sub'),(2,1,'pizza_sub1','pizza_sub1');
/*!40000 ALTER TABLE `swiggy_menu_subcategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swiggy_variant_details`
--

DROP TABLE IF EXISTS `swiggy_variant_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `swiggy_variant_details` (
  `id_variant_details` int(11) NOT NULL,
  `id_variant` int(11) DEFAULT NULL,
  `variant_type` varchar(45) DEFAULT NULL,
  `variant_priority` int(11) DEFAULT NULL,
  `is_variant_available` tinyint(4) DEFAULT NULL,
  `variant_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_variant_details`),
  KEY `fk_swiggy_variant_details_1_idx` (`id_variant`),
  CONSTRAINT `fk_swiggy_variant_details_1` FOREIGN KEY (`id_variant`) REFERENCES `swiggy_variants` (`id_variants`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swiggy_variant_details`
--

LOCK TABLES `swiggy_variant_details` WRITE;
/*!40000 ALTER TABLE `swiggy_variant_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `swiggy_variant_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swiggy_variants`
--

DROP TABLE IF EXISTS `swiggy_variants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `swiggy_variants` (
  `id_variants` int(11) NOT NULL,
  `id_item_details` int(11) DEFAULT NULL,
  `variant_desc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_variants`),
  KEY `fk_swiggy_variants_1_idx` (`id_item_details`),
  CONSTRAINT `fk_swiggy_variants_1` FOREIGN KEY (`id_item_details`) REFERENCES `swiggy_item_details` (`idswiggy_item_details`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swiggy_variants`
--

LOCK TABLES `swiggy_variants` WRITE;
/*!40000 ALTER TABLE `swiggy_variants` DISABLE KEYS */;
/*!40000 ALTER TABLE `swiggy_variants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `variant_exclusion`
--

DROP TABLE IF EXISTS `variant_exclusion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `variant_exclusion` (
  `swiggy_variant_exclusion` int(11) NOT NULL,
  `id_item_details` int(11) DEFAULT NULL,
  `variant_exclusion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`swiggy_variant_exclusion`),
  KEY `fk_new_table_1_idx` (`id_item_details`),
  CONSTRAINT `fk_new_table_1` FOREIGN KEY (`id_item_details`) REFERENCES `swiggy_item_details` (`idswiggy_item_details`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `variant_exclusion`
--

LOCK TABLES `variant_exclusion` WRITE;
/*!40000 ALTER TABLE `variant_exclusion` DISABLE KEYS */;
/*!40000 ALTER TABLE `variant_exclusion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-27  5:12:30
