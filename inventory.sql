-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 03, 2019 at 04:28 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `motor`
--

CREATE TABLE `motor` (
  `id_motor` int(11) NOT NULL,
  `mesin` varchar(100) NOT NULL,
  `brand` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `types` varchar(100) NOT NULL,
  `manufacture` date NOT NULL,
  `color` varchar(100) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `motor`
--

INSERT INTO `motor` (`id_motor`, `mesin`, `brand`, `name`, `types`, `manufacture`, `color`, `jumlah`) VALUES
(1, 'CM001', 'Yamaha', 'RZX-Yamaha', 'Manual', '2019-10-01', 'Yellow', 40),
(4, 'GONE2', 'Honda ', 'Dauta', 'Matic', '2019-05-01', 'Biru', 79),
(5, 'RC302', 'Suzuki', 'BladeXray', 'Manual', '2019-10-15', 'Biru', 100),
(7, 'CM002', 'Yamaha ', 'XZero', 'Manual', '2019-10-01', 'Putih', 1000),
(10, 'CM002', 'Honda ', 'Xandra', 'Manual', '2019-02-01', 'Jingga', 190),
(12, 'CM034', 'Honda ', 'Vario', 'Matic', '2019-10-01', 'Putih', 10),
(13, 'RC302', 'Honda ', 'Ganrra', 'Matic', '2019-07-01', 'Hijau', 200),
(15, 'CM034', 'Suzuki', 'Dera', 'Matic', '2018-12-01', 'Biru', -100);

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `id` int(11) NOT NULL,
  `id_motor` int(11) NOT NULL,
  `date` date NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`id`, `id_motor`, `date`, `jumlah`) VALUES
(4, 4, '2019-10-31', 1),
(5, 4, '2019-10-28', 20),
(7, 10, '2019-10-01', 20),
(10, 9, '2019-11-08', 200),
(11, 9, '2019-11-01', 30),
(12, 100, '2019-11-03', 10),
(13, 10, '2019-03-04', 10),
(14, 12, '2019-11-03', -10),
(15, 15, '2019-11-03', 300);

--
-- Triggers `pembelian`
--
DELIMITER $$
CREATE TRIGGER `pembelian_motor` AFTER INSERT ON `pembelian` FOR EACH ROW BEGIN
    UPDATE motor SET jumlah=jumlah-NEW.jumlah
    WHERE id_motor = NEW.id_motor;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `motor`
--
ALTER TABLE `motor`
  ADD PRIMARY KEY (`id_motor`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `motor`
--
ALTER TABLE `motor`
  MODIFY `id_motor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `pembelian`
--
ALTER TABLE `pembelian`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
