-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 09, 2014 at 12:25 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `smartcity_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `email` varchar(30) NOT NULL,
  `pass` varchar(15) DEFAULT NULL,
  `type` varchar(10) DEFAULT 'User',
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`email`, `pass`, `type`) VALUES
('admin@gmail.com', '12345', 'Admin'),
('ram@gmail.com', '12345', 'User'),
('ravi@gmail.com', '12345', 'User');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE IF NOT EXISTS `register` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `pass` varchar(15) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `mobno` varchar(11) DEFAULT NULL,
  `city` varchar(10) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`rid`, `uname`, `email`, `pass`, `dob`, `gender`, `mobno`, `city`, `address`) VALUES
(2, 'ram', 'ram@gmail.com', '12345', '1993-02-01', 'male', '123456', 'indore', 'rajwada'),
(3, 'ravi', 'ravi@gmail.com', '12345', '1993-01-01', 'male', '123456', 'indore', 'indore');
