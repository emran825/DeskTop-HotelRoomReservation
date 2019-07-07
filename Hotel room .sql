-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema test
--

CREATE DATABASE IF NOT EXISTS test;
USE test;

--
-- Definition of table `adm`
--

DROP TABLE IF EXISTS `adm`;
CREATE TABLE `adm` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `l_name` varchar(45) NOT NULL,
  `s_name` varchar(45) NOT NULL,
  `s_type` varchar(45) NOT NULL,
  `t_price` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adm`
--

/*!40000 ALTER TABLE `adm` DISABLE KEYS */;
INSERT INTO `adm` (`id`,`l_name`,`s_name`,`s_type`,`t_price`,`date`) VALUES 
 (1,'','','','','2019-01-03');
/*!40000 ALTER TABLE `adm` ENABLE KEYS */;


--
-- Definition of table `admininput`
--

DROP TABLE IF EXISTS `admininput`;
CREATE TABLE `admininput` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `l_name` varchar(45) NOT NULL,
  `s_name` varchar(45) NOT NULL,
  `s_type` varchar(45) NOT NULL,
  `t_price` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admininput`
--

/*!40000 ALTER TABLE `admininput` DISABLE KEYS */;
INSERT INTO `admininput` (`id`,`l_name`,`s_name`,`s_type`,`t_price`) VALUES 
 (1,'Dhaka','AC Delux','A.C','2000'),
 (3,'Comilla','Dream Line','A.C','1600'),
 (4,'Comilla','Dhaka Express','Non A.C','600'),
 (5,'Chandpur','Asia Line','A.C','1200'),
 (6,'Chandpur','Druti Paribahan','Non A.C','600'),
 (7,'Chandpur','Ekono Paribahan','Non A.C','580'),
 (8,'Khulna','Dreamland','A.C','1800'),
 (9,'Khulna','Banoful Transport','Non A.C','800'),
 (10,'Barishal','Banoful Transport','Non A.C','900'),
 (11,'Barishal','AR Transport','Non A.C','720'),
 (12,'Barguna','AR Transport','Non A.C','620'),
 (13,'Barguna','AR Transport','A.C','1000'),
 (14,'Jhalokati','Keya Transport','A.C','1000'),
 (15,'Jhalokati','GreenLine Transport','A.C','2000'),
 (16,'Bandarbon','GreenLine ','A.C','2200'),
 (17,'Pirojpur','Hanif Paribahan','A.C','2200'),
 (18,'Brahmonbaria','Hanif Paribahan','A.C','1600'),
 (19,'Brahmonbaria','Prince Exclusive','Non A.C','560'),
 (20,'Brahmonbaria','Prince Exclusive','A.C','1280'),
 (21,'Brahmonbaria','S Alam Service','A.C','1200'),
 (22,'Chittagong','S Alam Service','A.C','2400');
/*!40000 ALTER TABLE `admininput` ENABLE KEYS */;


--
-- Definition of table `checkk`
--

DROP TABLE IF EXISTS `checkk`;
CREATE TABLE `checkk` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `degree` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `checkk`
--

/*!40000 ALTER TABLE `checkk` DISABLE KEYS */;
/*!40000 ALTER TABLE `checkk` ENABLE KEYS */;


--
-- Definition of table `city`
--

DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `city` varchar(45) NOT NULL,
  PRIMARY KEY  (`city`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `city`
--

/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` (`city`) VALUES 
 ('Bandarbon'),
 ('Barguna'),
 ('Barishal'),
 ('Brahmonbaria'),
 ('Chandpur'),
 ('Chittagong'),
 ('Comilla'),
 ('Dhaka'),
 ('Jhalokati'),
 ('Khulna'),
 ('Pirojpur');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;


--
-- Definition of table `cl`
--

DROP TABLE IF EXISTS `cl`;
CREATE TABLE `cl` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `clas` varchar(45) NOT NULL,
  `section` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cl`
--

/*!40000 ALTER TABLE `cl` DISABLE KEYS */;
/*!40000 ALTER TABLE `cl` ENABLE KEYS */;


--
-- Definition of table `date`
--

DROP TABLE IF EXISTS `date`;
CREATE TABLE `date` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `datein` varchar(45) NOT NULL,
  `dateout` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `date`
--

/*!40000 ALTER TABLE `date` DISABLE KEYS */;
INSERT INTO `date` (`id`,`datein`,`dateout`) VALUES 
 (1,'2019-01-09','2019-01-01'),
 (2,'2019-01-02','2019-01-01'),
 (3,'2019-01-02','2019-01-11'),
 (4,'2019-01-03','2019-01-10'),
 (5,'2019-01-24','2019-01-10'),
 (6,'2019-01-24','2019-01-10'),
 (7,'2019-01-03','2019-01-10'),
 (8,'2019-01-02','2019-01-10'),
 (9,'2019-01-24','2019-01-10'),
 (10,'2019-01-02','2019-01-16'),
 (11,'2019-01-10','2019-01-02'),
 (12,'2019-01-02','2019-01-17'),
 (13,'2019-01-09','2019-01-02'),
 (14,'2019-01-01','2019-01-02');
/*!40000 ALTER TABLE `date` ENABLE KEYS */;


--
-- Definition of table `ddd`
--

DROP TABLE IF EXISTS `ddd`;
CREATE TABLE `ddd` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `date` date NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ddd`
--

/*!40000 ALTER TABLE `ddd` DISABLE KEYS */;
/*!40000 ALTER TABLE `ddd` ENABLE KEYS */;


--
-- Definition of table `def`
--

DROP TABLE IF EXISTS `def`;
CREATE TABLE `def` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `date` date NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `def`
--

/*!40000 ALTER TABLE `def` DISABLE KEYS */;
/*!40000 ALTER TABLE `def` ENABLE KEYS */;


--
-- Definition of table `defaul`
--

DROP TABLE IF EXISTS `defaul`;
CREATE TABLE `defaul` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `date` date NOT NULL,
  `set_id` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `defaul`
--

/*!40000 ALTER TABLE `defaul` DISABLE KEYS */;
/*!40000 ALTER TABLE `defaul` ENABLE KEYS */;


--
-- Definition of table `default`
--

DROP TABLE IF EXISTS `default`;
CREATE TABLE `default` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `date` date NOT NULL,
  `set_id` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `default`
--

/*!40000 ALTER TABLE `default` DISABLE KEYS */;
/*!40000 ALTER TABLE `default` ENABLE KEYS */;


--
-- Definition of table `emp`
--

DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `salary` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp`
--

/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` (`id`,`name`,`city`,`salary`) VALUES 
 (1,'','','h'),
 (5,'a','g','m'),
 (8,'g','',''),
 (9,'','',''),
 (10,'Emran','Dhaka','3000'),
 (11,'','','');
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;


--
-- Definition of table `emran`
--

DROP TABLE IF EXISTS `emran`;
CREATE TABLE `emran` (
  `id` int(11) NOT NULL auto_increment,
  `pname` varchar(30) default NULL,
  `pprice` double default NULL,
  `sprice` double default NULL,
  `qty` int(11) default NULL,
  `pdate` date default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emran`
--

/*!40000 ALTER TABLE `emran` DISABLE KEYS */;
INSERT INTO `emran` (`id`,`pname`,`pprice`,`sprice`,`qty`,`pdate`) VALUES 
 (1,'PenDrive',100,120,-7,'2019-02-06');
/*!40000 ALTER TABLE `emran` ENABLE KEYS */;


--
-- Definition of table `hotel`
--

DROP TABLE IF EXISTS `hotel`;
CREATE TABLE `hotel` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `inDate` varchar(45) NOT NULL,
  `outDate` varchar(45) NOT NULL,
  `roomNum` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotel`
--

/*!40000 ALTER TABLE `hotel` DISABLE KEYS */;
INSERT INTO `hotel` (`id`,`inDate`,`outDate`,`roomNum`) VALUES 
 (1,'12/02/18','13/02/18','03'),
 (2,'2019-01-04','2019-01-11','01'),
 (3,'2019-01-11','2019-01-31','01');
/*!40000 ALTER TABLE `hotel` ENABLE KEYS */;


--
-- Definition of table `hotelm`
--

DROP TABLE IF EXISTS `hotelm`;
CREATE TABLE `hotelm` (
  `c_id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `c_m` varchar(45) NOT NULL,
  `nation` varchar(45) NOT NULL,
  `id_t` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `c_i_d` varchar(45) NOT NULL,
  `c_o_d` varchar(45) NOT NULL,
  `meal` varchar(45) NOT NULL,
  `room_T` varchar(45) NOT NULL,
  `room_n` varchar(45) NOT NULL,
  PRIMARY KEY  (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotelm`
--

/*!40000 ALTER TABLE `hotelm` DISABLE KEYS */;
INSERT INTO `hotelm` (`c_id`,`name`,`address`,`c_m`,`nation`,`id_t`,`gender`,`c_i_d`,`c_o_d`,`meal`,`room_T`,`room_n`) VALUES 
 (1,'Emran','Dhaka','0168422152554','Arabic (United Arab Emirates)','Driving Lic','Male','2019-02-07','2019-02-08','1','Single','9'),
 (2,'Emran','Dhaka','0168422152554','Arabic (United Arab Emirates)','Driving Lic','Male','2019-02-08','2019-02-22','1','Single','7'),
 (5,'Emran','Dhaka','0168422152554','Arabic (United Arab Emirates)','Driving Lic','Male','2019-02-07','2019-02-08','1','Single','8');
/*!40000 ALTER TABLE `hotelm` ENABLE KEYS */;


--
-- Definition of table `hoteltotal`
--

DROP TABLE IF EXISTS `hoteltotal`;
CREATE TABLE `hoteltotal` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `tax` int(10) unsigned NOT NULL,
  `subTotal` int(10) unsigned NOT NULL,
  `total` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hoteltotal`
--

/*!40000 ALTER TABLE `hoteltotal` DISABLE KEYS */;
INSERT INTO `hoteltotal` (`id`,`tax`,`subTotal`,`total`) VALUES 
 (1,16,6300,6316),
 (2,16,6300,6316),
 (3,16,6300,6316),
 (4,34,13500,13534),
 (5,32,12600,12632),
 (6,32,12600,12632),
 (7,32,12600,12632),
 (8,2,900,902),
 (9,32,12600,12632);
/*!40000 ALTER TABLE `hoteltotal` ENABLE KEYS */;


--
-- Definition of table `inf`
--

DROP TABLE IF EXISTS `inf`;
CREATE TABLE `inf` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `degree` varchar(45) NOT NULL,
  `family_number` varchar(45) NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inf`
--

/*!40000 ALTER TABLE `inf` DISABLE KEYS */;
INSERT INTO `inf` (`id`,`name`,`address`,`country`,`gender`,`degree`,`family_number`,`phone_number`) VALUES 
 (1,'','','-Select Country-','Female',',','',''),
 (2,'Emran Hossan','Dhaka','Bangladesh','Male',',S.S.C','25',''),
 (3,'','','-Select Country-','Female',',S.S.CH.S.CB.S.CM.S.C','',''),
 (4,'','','-Select Country-','Female','S.S.C,H.S.C,B.S.C,M.S.C,','',''),
 (5,'','','-Select Country-','Female','','frf',''),
 (6,'','','-Select Country-','Female','','',''),
 (7,'','','-Select Country-','Female','','','');
/*!40000 ALTER TABLE `inf` ENABLE KEYS */;


--
-- Definition of table `inv`
--

DROP TABLE IF EXISTS `inv`;
CREATE TABLE `inv` (
  `id` int(11) NOT NULL auto_increment,
  `pname` varchar(30) default NULL,
  `pprice` double default NULL,
  `sprice` double default NULL,
  `qty` int(11) default NULL,
  `pdate` date default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inv`
--

/*!40000 ALTER TABLE `inv` DISABLE KEYS */;
INSERT INTO `inv` (`id`,`pname`,`pprice`,`sprice`,`qty`,`pdate`) VALUES 
 (1,'Book',150,200,20,'2019-02-05'),
 (2,'Frize',40000,450000,-10,'2019-02-05'),
 (3,'Pen',12,15,-93,'2019-02-06'),
 (4,'Laptop',50000,60000,22,'2019-02-06');
/*!40000 ALTER TABLE `inv` ENABLE KEYS */;


--
-- Definition of table `inven`
--

DROP TABLE IF EXISTS `inven`;
CREATE TABLE `inven` (
  `id` int(11) NOT NULL auto_increment,
  `pname` varchar(45) default NULL,
  `pprice` double default NULL,
  `sprice` double default NULL,
  `qty` int(11) default NULL,
  `pdate` date default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inven`
--

/*!40000 ALTER TABLE `inven` DISABLE KEYS */;
INSERT INTO `inven` (`id`,`pname`,`pprice`,`sprice`,`qty`,`pdate`) VALUES 
 (1,'Select Onedncd',154,12554,158,'2019-02-05'),
 (2,'Book',154,12554,100,'2019-02-05'),
 (3,'Mobile',15000,17000,100,'2019-02-05');
/*!40000 ALTER TABLE `inven` ENABLE KEYS */;


--
-- Definition of table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`id`,`username`,`password`) VALUES 
 (1,'Emran','eee'),
 (2,'abc','aaa'),
 (3,'r','2'),
 (4,'abcd','rt'),
 (5,'a','a'),
 (6,'a','a'),
 (7,'a','a'),
 (8,'a','a'),
 (9,'a','a'),
 (10,'aa','a'),
 (11,'a','a'),
 (12,'a','a'),
 (13,'a','a'),
 (14,'a','a'),
 (15,'a','a'),
 (16,'ss','ss'),
 (17,'a','a'),
 (18,'b','b'),
 (19,'a','a'),
 (20,'',''),
 (21,'em','em'),
 (22,'abc','123'),
 (23,'hhh','123'),
 (24,'Emran','222'),
 (25,'aaa','aaa');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;


--
-- Definition of table `login12`
--

DROP TABLE IF EXISTS `login12`;
CREATE TABLE `login12` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(20) default NULL,
  `password` varchar(35) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login12`
--

/*!40000 ALTER TABLE `login12` DISABLE KEYS */;
INSERT INTO `login12` (`id`,`username`,`password`) VALUES 
 (1,'emran','123'),
 (2,'emran','123');
/*!40000 ALTER TABLE `login12` ENABLE KEYS */;


--
-- Definition of table `regester`
--

DROP TABLE IF EXISTS `regester`;
CREATE TABLE `regester` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `pass` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `regester`
--

/*!40000 ALTER TABLE `regester` DISABLE KEYS */;
INSERT INTO `regester` (`id`,`pass`) VALUES 
 (1,'mm'),
 (2,'0245Al@8l');
/*!40000 ALTER TABLE `regester` ENABLE KEYS */;


--
-- Definition of table `register`
--

DROP TABLE IF EXISTS `register`;
CREATE TABLE `register` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `uname` varchar(45) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `dob` date NOT NULL,
  `email` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `conpass` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

/*!40000 ALTER TABLE `register` DISABLE KEYS */;
INSERT INTO `register` (`id`,`uname`,`fname`,`lname`,`dob`,`email`,`pass`,`conpass`,`gender`,`address`) VALUES 
 (38,'Emran','','','2019-02-01','','123','','null',''),
 (39,'Emran','','','2019-02-01','','12','','null',''),
 (40,'ee','','','2019-02-01','','12','','null',''),
 (41,'ggg','','','2019-02-01','','1232','','null',''),
 (42,'dcd','','','2019-02-01','','12','','null',''),
 (43,'ffv','','','2019-02-01','','22','','null',''),
 (44,'cvf','','','2019-02-15','','45','','null',''),
 (45,'abc','','','2019-02-08','','25','','Male',''),
 (46,'Emran','Emran','Hossan','2019-02-08','vfvd','453','453','Male','Dhaka'),
 (47,'Hasan','Hasan','Khan','1991-02-09','fcdfvsd','222','222','Male','Dhaka'),
 (48,'Emran','Emran','Hossan','1993-02-18','ehossan3@gmail.com','234','234','Male','Dhaka');
/*!40000 ALTER TABLE `register` ENABLE KEYS */;


--
-- Definition of table `registerd`
--

DROP TABLE IF EXISTS `registerd`;
CREATE TABLE `registerd` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `pass` varchar(45) NOT NULL,
  `cpass` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registerd`
--

/*!40000 ALTER TABLE `registerd` DISABLE KEYS */;
INSERT INTO `registerd` (`id`,`pass`,`cpass`) VALUES 
 (1,'12','12'),
 (2,'','');
/*!40000 ALTER TABLE `registerd` ENABLE KEYS */;


--
-- Definition of table `roomnumber`
--

DROP TABLE IF EXISTS `roomnumber`;
CREATE TABLE `roomnumber` (
  `roomNum` int(10) unsigned NOT NULL auto_increment,
  `available` varchar(45) NOT NULL default '1',
  PRIMARY KEY  (`roomNum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roomnumber`
--

/*!40000 ALTER TABLE `roomnumber` DISABLE KEYS */;
INSERT INTO `roomnumber` (`roomNum`,`available`) VALUES 
 (1,'0'),
 (2,'1'),
 (3,'1'),
 (4,'1'),
 (5,'1'),
 (6,'1'),
 (7,'1'),
 (8,'0'),
 (9,'1'),
 (10,'1');
/*!40000 ALTER TABLE `roomnumber` ENABLE KEYS */;


--
-- Definition of table `sco`
--

DROP TABLE IF EXISTS `sco`;
CREATE TABLE `sco` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `salary` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sco`
--

/*!40000 ALTER TABLE `sco` DISABLE KEYS */;
INSERT INTO `sco` (`id`,`name`,`city`,`salary`) VALUES 
 (1,'kfkf','fdsf','sdfsdf'),
 (2,'Motin','Gaibandha','12000');
/*!40000 ALTER TABLE `sco` ENABLE KEYS */;


--
-- Definition of table `semp`
--

DROP TABLE IF EXISTS `semp`;
CREATE TABLE `semp` (
  `set_id` int(10) unsigned NOT NULL auto_increment,
  PRIMARY KEY  (`set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `semp`
--

/*!40000 ALTER TABLE `semp` DISABLE KEYS */;
INSERT INTO `semp` (`set_id`) VALUES 
 (1),
 (2),
 (3),
 (500);
/*!40000 ALTER TABLE `semp` ENABLE KEYS */;


--
-- Definition of table `semp2`
--

DROP TABLE IF EXISTS `semp2`;
CREATE TABLE `semp2` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `set_id` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_semp2_1set` (`set_id`),
  CONSTRAINT `FK_semp2_1set` FOREIGN KEY (`set_id`) REFERENCES `semp` (`set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `semp2`
--

/*!40000 ALTER TABLE `semp2` DISABLE KEYS */;
INSERT INTO `semp2` (`id`,`set_id`) VALUES 
 (1,1),
 (3,1),
 (2,2);
/*!40000 ALTER TABLE `semp2` ENABLE KEYS */;


--
-- Definition of table `semple`
--

DROP TABLE IF EXISTS `semple`;
CREATE TABLE `semple` (
  `set_id` int(10) unsigned NOT NULL auto_increment,
  PRIMARY KEY  (`set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `semple`
--

/*!40000 ALTER TABLE `semple` DISABLE KEYS */;
INSERT INTO `semple` (`set_id`) VALUES 
 (1),
 (2),
 (3),
 (4),
 (5),
 (6),
 (7),
 (8),
 (14),
 (45),
 (51),
 (100),
 (200),
 (452),
 (500),
 (600),
 (678);
/*!40000 ALTER TABLE `semple` ENABLE KEYS */;


--
-- Definition of table `set4`
--

DROP TABLE IF EXISTS `set4`;
CREATE TABLE `set4` (
  `set_id` int(10) unsigned NOT NULL auto_increment,
  PRIMARY KEY  (`set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `set4`
--

/*!40000 ALTER TABLE `set4` DISABLE KEYS */;
INSERT INTO `set4` (`set_id`) VALUES 
 (1),
 (2),
 (4);
/*!40000 ALTER TABLE `set4` ENABLE KEYS */;


--
-- Definition of table `set5`
--

DROP TABLE IF EXISTS `set5`;
CREATE TABLE `set5` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `set_id` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_set5_1` (`set_id`),
  CONSTRAINT `FK_set5_1` FOREIGN KEY (`set_id`) REFERENCES `set4` (`set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `set5`
--

/*!40000 ALTER TABLE `set5` DISABLE KEYS */;
/*!40000 ALTER TABLE `set5` ENABLE KEYS */;


--
-- Definition of table `set6`
--

DROP TABLE IF EXISTS `set6`;
CREATE TABLE `set6` (
  `save_id` int(10) unsigned NOT NULL auto_increment,
  PRIMARY KEY  (`save_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `set6`
--

/*!40000 ALTER TABLE `set6` DISABLE KEYS */;
/*!40000 ALTER TABLE `set6` ENABLE KEYS */;


--
-- Definition of table `sid`
--

DROP TABLE IF EXISTS `sid`;
CREATE TABLE `sid` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `set_id` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_sid_1as` (`set_id`),
  CONSTRAINT `FK_sid_1as` FOREIGN KEY (`set_id`) REFERENCES `semple` (`set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sid`
--

/*!40000 ALTER TABLE `sid` DISABLE KEYS */;
INSERT INTO `sid` (`id`,`set_id`) VALUES 
 (10,1),
 (11,1),
 (9,2),
 (1,3),
 (2,3),
 (12,3),
 (13,4),
 (14,5),
 (15,6),
 (5,7),
 (7,7),
 (8,7),
 (16,7),
 (3,8),
 (4,8),
 (6,8),
 (17,8),
 (18,14),
 (19,14);
/*!40000 ALTER TABLE `sid` ENABLE KEYS */;


--
-- Definition of table `stb`
--

DROP TABLE IF EXISTS `stb`;
CREATE TABLE `stb` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `degree` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stb`
--

/*!40000 ALTER TABLE `stb` DISABLE KEYS */;
INSERT INTO `stb` (`id`,`name`,`address`,`country`,`gender`,`degree`) VALUES 
 (1,'gg','ff','-Select Country-','Female',' '),
 (2,'dd','s','Pakistan','Male',' S.S.C '),
 (3,'h','j','Afganistan','Male',''),
 (4,'Emran','dhaka','Bangladesh','Male','S.S.C,H.S.C,B.S.C,'),
 (5,'k','y','Pakistan','Male','S.S.C,'),
 (6,'fgvrf','fg','Bangladesh','Male','S.S.C,'),
 (7,'sd','aa','Bangladesh','Male','S.S.C,'),
 (8,'Emran','Ddaka','Bangladesh','Male','H.S.C,'),
 (9,'bbbbb','cdd','Bangladesh','Female',''),
 (10,'bbbbb','cdd','Bangladesh','Female',''),
 (11,'avc','a','Bangladesh','Male','S.S.C,'),
 (12,'ban','x','Pakistan','Male','S.S.C,'),
 (13,'as','d','Afganistan','Male','S.S.C,'),
 (14,'mm','','-Select Country-','Female',''),
 (15,'hyyy','','-Select Country-','Female',''),
 (16,'e','g','Bangladesh','Female',''),
 (17,'dc','','Bangladesh','Female',''),
 (18,'s','t','Iraq','Male','S.S.C,H.S.C,B.S.C,'),
 (19,'h','','-Select Country-','Female',''),
 (20,'h','','-Select Country-','Female',''),
 (21,'h','hhj','-Select Country-','Female',''),
 (22,'hcdhc','','-Select Country-','Female',''),
 (23,'cvf','','Bangladesh','Male','S.S.C,'),
 (24,'sds','','Bangladesh','Female',''),
 (25,'hjng','hbjn','Bangladesh','Male','S.S.C,H.S.C,'),
 (26,'g','fg','Pakistan','Male','S.S.C,H.S.C,B.S.C,'),
 (27,'thr','thr','Bangladesh','Male','S.S.C,'),
 (28,'Imran','NG','Afganistan','Male','M.S.C,');
/*!40000 ALTER TABLE `stb` ENABLE KEYS */;


--
-- Definition of table `sttable`
--

DROP TABLE IF EXISTS `sttable`;
CREATE TABLE `sttable` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `class` varchar(45) NOT NULL,
  `roll` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `fee` varchar(45) NOT NULL,
  `group` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sttable`
--

/*!40000 ALTER TABLE `sttable` DISABLE KEYS */;
/*!40000 ALTER TABLE `sttable` ENABLE KEYS */;


--
-- Definition of table `stype`
--

DROP TABLE IF EXISTS `stype`;
CREATE TABLE `stype` (
  `styp` varchar(45) NOT NULL,
  PRIMARY KEY  (`styp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stype`
--

/*!40000 ALTER TABLE `stype` DISABLE KEYS */;
INSERT INTO `stype` (`styp`) VALUES 
 ('A.C'),
 ('Non A.C');
/*!40000 ALTER TABLE `stype` ENABLE KEYS */;


--
-- Definition of table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
CREATE TABLE `ticket` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `p_name` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `destination` varchar(45) NOT NULL,
  `s_type` varchar(45) NOT NULL,
  `s_name` varchar(45) NOT NULL,
  `t_prise` varchar(45) NOT NULL,
  `s_num` varchar(45) NOT NULL,
  `p_num` varchar(45) NOT NULL,
  `j_date` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ticket`
--

/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` (`id`,`p_name`,`location`,`destination`,`s_type`,`s_name`,`t_prise`,`s_num`,`p_num`,`j_date`) VALUES 
 (1,'','','Dhaka','A.C','AC Delux','2000','','','2019-01-03'),
 (2,'','','Dhaka','A.C','AC Delux','2000','','','2019-01-08'),
 (3,'','Chandpur','Dhaka','A.C','AC Delux','2000','','','2019-01-10'),
 (4,'','Chandpur','Dhaka','A.C','AC Delux','2000','','','2019-01-10'),
 (5,'','Chandpur','Dhaka','A.C','AC Delux','2000','','','2019-01-10'),
 (6,'','Dhaka','Dhaka','A.C','AC Delux','2000','','','2019-01-05'),
 (7,'','Chandpur','Dhaka','A.C','AC Delux','2000','','','2019-01-02');
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `user` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`,`user`,`password`) VALUES 
 (1,'a','2'),
 (2,'44','44'),
 (3,'aa','11'),
 (4,'aa',''),
 (5,'aa','dd'),
 (6,'GHF','GF'),
 (7,'aa','zz');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `uname` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;


--
-- Definition of table `zz`
--

DROP TABLE IF EXISTS `zz`;
CREATE TABLE `zz` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `zz`
--

/*!40000 ALTER TABLE `zz` DISABLE KEYS */;
INSERT INTO `zz` (`id`,`name`,`address`,`country`,`gender`) VALUES 
 (1,'as','d','Afganistan','Male'),
 (2,'cvf','','Bangladesh','Male'),
 (3,'sds','','Bangladesh','Female');
/*!40000 ALTER TABLE `zz` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
