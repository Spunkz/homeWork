
DROP TABLE IF EXISTS `Info`;
CREATE TABLE `Info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `bloodGroup` varchar(10) NOT NULL,
  `telephone` varchar(10) NOT NULL,
  `address` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
