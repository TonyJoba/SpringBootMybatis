/*
SQLyog Trial v12.5.1 (64 bit)
MySQL - 5.7.21-log : Database - shoppingdemo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shoppingdemo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `shoppingdemo`;

/*Table structure for table `t_orders` */

DROP TABLE IF EXISTS `t_orders`;

CREATE TABLE `t_orders` (
  `orderId` int(25) NOT NULL AUTO_INCREMENT,
  `orderNum` varchar(255) NOT NULL,
  `orderDetails` int(11) NOT NULL,
  PRIMARY KEY (`orderId`),
  KEY `orderDetails` (`orderDetails`),
  CONSTRAINT `t_orders_ibfk_1` FOREIGN KEY (`orderDetails`) REFERENCES `t_products` (`productId`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `t_orders` */

insert  into `t_orders`(`orderId`,`orderNum`,`orderDetails`) values 
(1,'1000000051988144',1),
(2,'1000001692488357',2),
(3,'1000002052900670',1),
(4,'20180731235419972',1),
(5,'20180731235429817',2),
(6,'20180801001540478',3),
(7,'20180801001638915',3),
(8,'20180801001653535',4),
(9,'20180801001809272',5),
(10,'20180801001844078',6),
(11,'20180801004014063',1),
(12,'20180801004047198',1),
(13,'20180801004208867',2),
(14,'20180801005751772',1),
(15,'20180801010632300',1),
(16,'20180801010636917',1),
(17,'20180801010658144',1),
(18,'20180801010700969',1);

/*Table structure for table `t_products` */

DROP TABLE IF EXISTS `t_products`;

CREATE TABLE `t_products` (
  `productId` int(25) NOT NULL AUTO_INCREMENT,
  `productName` varchar(255) NOT NULL,
  `productDesc` varchar(255) NOT NULL,
  `productPrice` int(11) NOT NULL,
  `productResult` int(11) DEFAULT NULL,
  `productImgUrl` varchar(255) NOT NULL,
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `t_products` */

insert  into `t_products`(`productId`,`productName`,`productDesc`,`productPrice`,`productResult`,`productImgUrl`) values 
(1,'脉动','脉动回来',5,0,'/maidong.jpg'),
(2,'农夫山泉','有点甜',3,1000,'/nongfushanquan.jpg'),
(3,'百事可乐','百事可乐',4,600,'/baishikele.jpg'),
(4,'红牛','有能量无限量',6,400,'/hongniu.jpg'),
(5,'哇哈哈矿泉水','至纯致净',2,600,'/wahaha.jpg'),
(6,'芬达','开心爽到爆',4,500,'/fenda.jpg');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
