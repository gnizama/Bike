/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.6.30 : Database - bike
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bike` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bike`;

/*Table structure for table `t_bike` */

DROP TABLE IF EXISTS `t_bike`;

CREATE TABLE `t_bike` (
  `bikeid` int(20) NOT NULL,
  `bikebrand` varchar(20) DEFAULT NULL,
  `speed` int(2) DEFAULT NULL,
  `biketype` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`bikeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_bike` */

insert  into `t_bike`(`bikeid`,`bikebrand`,`speed`,`biketype`) values (1,'Merida',30,'Duke600'),(2,'Merida',25,'Warrior500D'),(3,'Giant',24,'ATX660'),(4,'Merida',27,'Voctoria');

/*Table structure for table `t_line` */

DROP TABLE IF EXISTS `t_line`;

CREATE TABLE `t_line` (
  `lineid` int(10) NOT NULL,
  `length` int(10) DEFAULT NULL,
  `difficulty` varchar(10) DEFAULT NULL,
  `bikesuited` int(20) DEFAULT NULL,
  PRIMARY KEY (`lineid`),
  KEY `FKCB5F90DFD4798F3` (`bikesuited`),
  CONSTRAINT `FKCB5F90DFD4798F3` FOREIGN KEY (`bikesuited`) REFERENCES `t_bike` (`bikeid`),
  CONSTRAINT `t_line_ibfk_1` FOREIGN KEY (`bikesuited`) REFERENCES `t_bike` (`bikeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_line` */

/*Table structure for table `t_motto` */

DROP TABLE IF EXISTS `t_motto`;

CREATE TABLE `t_motto` (
  `mottoid` int(5) NOT NULL,
  `motto` varchar(100) NOT NULL,
  PRIMARY KEY (`mottoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_motto` */

/*Table structure for table `t_person` */

DROP TABLE IF EXISTS `t_person`;

CREATE TABLE `t_person` (
  `personid` int(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `bike` int(20) DEFAULT NULL,
  `motto` int(10) DEFAULT NULL,
  `line` int(10) DEFAULT NULL,
  PRIMARY KEY (`personid`),
  KEY `FK785BED80A4743D47` (`bike`),
  KEY `FK785BED80A47D556D` (`line`),
  KEY `FK785BED80EB4F2D35` (`motto`),
  CONSTRAINT `FK785BED80A4743D47` FOREIGN KEY (`bike`) REFERENCES `t_bike` (`bikeid`),
  CONSTRAINT `FK785BED80A47D556D` FOREIGN KEY (`line`) REFERENCES `t_line` (`lineid`),
  CONSTRAINT `FK785BED80EB4F2D35` FOREIGN KEY (`motto`) REFERENCES `t_motto` (`mottoid`),
  CONSTRAINT `t_person_ibfk_1` FOREIGN KEY (`line`) REFERENCES `t_line` (`lineid`),
  CONSTRAINT `t_person_ibfk_2` FOREIGN KEY (`bike`) REFERENCES `t_bike` (`bikeid`),
  CONSTRAINT `t_person_ibfk_3` FOREIGN KEY (`motto`) REFERENCES `t_motto` (`mottoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_person` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
