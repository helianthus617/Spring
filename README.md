# Experiment of spring framework (declarative transaction, IOC, AOP)
*Spring的核心知识点:ioc/aop/声明式事务 ,该实验出自尚硅谷雷丰阳老师SSM视频课程,可结合老师视频使用,也可单独使用* . <br/>
部分实验如下(项目中有项目实验题目/代码)：<br/>
实验1：通过IOC容器创建对象，并为属性赋值★<br/>
实验2：根据bean的类型从IOC容器中获取bean的实例★<br/>
实验3：<br/>
    通过构造器为bean的属性赋值（index,type属性介绍）<br/>
    通过p名称空间为bean赋值<br/>
实验4：正确的为各种属性赋值<br/>
    测试使用null值 、<br/>
    引用类型赋值（引用其他bean、引用内部bean）....<br/>
====================工厂方式创建bean==========<br/>
实验5：配置通过静态工厂方法创建的bean、实例工厂方法创建的bean、FactoryBean★<br/>
实验6：通过继承实现bean配置信息的重用<br/>
实验7：通过abstract属性创建一个模板bean<br/>
实验8：bean之间的依赖<br/>
实验9：测试bean的作用域，分别创建单实例和多实例的bean★ <br/>
.... <br/>
**实验环境**(spring-tool-suite-3.7.3.RELEASE-e4.5.2-win32   eclipse-jee-kepler-SR2-win32),

**实验所需要的sql**
declaration_transaction.sql
```sql
/*
SQLyog Ultimate v9.20 
MySQL - 5.1.37-community : Database - tx
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;
/*!40101 SET SQL_MODE=''*/;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tx` /*!40100 DEFAULT CHARACTER SET gb2312 */;
USE `tx`;
/*Table structure for table `account` */
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `username` varchar(50) NOT NULL,
  `balance` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
/*Data for the table `account` */
insert  into `account`(`username`,`balance`) values ('Jerry',800),('Tom',100000);
/*Table structure for table `book` */
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `isbn` varchar(50) NOT NULL,
  `book_name` varchar(100) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
/*Data for the table `book` */
insert  into `book`(`isbn`,`book_name`,`price`) values ('ISBN-001','book01',100),('ISBN-002','book02',200),('ISBN-003','book03',300),('ISBN-004','book04',400),('ISBN-005','book05',500);
/*Table structure for table `book_stock` */
DROP TABLE IF EXISTS `book_stock`;
CREATE TABLE `book_stock` (
  `isbn` varchar(50) NOT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
/*Data for the table `book_stock` */
insert  into `book_stock`(`isbn`,`stock`) values ('ISBN-001',1000),('ISBN-002',2000),('ISBN-003',3000),('ISBN-004',4000),('ISBN-005',5000);
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
```
jdbc_template.sql
```sql
/*
SQLyog Ultimate v9.20 
MySQL - 5.1.37-community : Database - jdbc_tmeplate
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;
/*!40101 SET SQL_MODE=''*/;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jdbc_template` /*!40100 DEFAULT CHARACTER SET gb2312 */;
USE `jdbc_template`;
/*Table structure for table `employee` */
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` char(100) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=gb2312;
/*Data for the table `employee` */
insert  into `employee`(`emp_id`,`emp_name`,`salary`) values (1,'Susan',5000.23),(2,'Julian',4234.77),(3,'Papu',9034.51),(4,'Babala',8054.33),(5,'Kasier',6039.11),(6,'Owen',7714.11);
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
```
*欢迎探讨交流*
