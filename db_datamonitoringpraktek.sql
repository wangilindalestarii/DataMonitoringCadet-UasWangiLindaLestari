-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Jan 2022 pada 08.41
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_datamonitoringpraktek`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cadet`
--

CREATE TABLE `cadet` (
  `id` int(11) NOT NULL,
  `nit` varchar(12) NOT NULL,
  `nama_lengkap` varchar(15) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `prodi` varchar(30) NOT NULL,
  `goldar` enum('a','b','ab','o') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `cadet`
--

INSERT INTO `cadet` (`id`, `nit`, `nama_lengkap`, `alamat`, `prodi`, `goldar`) VALUES
(1, '561911227296', 'Reza Arieswara', 'JL.GOLP', 'Teknika', 'a'),
(2, '561911337443', 'Arudea Hatman', 'Banjarmasin', 'Kalk', 'ab'),
(3, '561911127108', 'Adinda Dira', 'Solo', 'Nautika', 'b'),
(4, '561911337446', 'Rama Irawan', 'Banjarmasin', 'Kalk', 'a');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemilihan_detail`
--

CREATE TABLE `pemilihan_detail` (
  `id_detail` int(11) NOT NULL,
  `id_pemilihan` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pemilihan_detail`
--

INSERT INTO `pemilihan_detail` (`id_detail`, `id_pemilihan`, `id`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemilihan_tempat`
--

CREATE TABLE `pemilihan_tempat` (
  `id_pemilihan` int(11) NOT NULL,
  `tanggal_mulai` date NOT NULL,
  `tanggal_selesai` date NOT NULL,
  `id_tempat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pemilihan_tempat`
--

INSERT INTO `pemilihan_tempat` (`id_pemilihan`, `tanggal_mulai`, `tanggal_selesai`, `id_tempat`) VALUES
(1, '2022-01-04', '2022-01-31', 1),
(2, '2022-01-02', '2022-01-29', 4),
(3, '2021-12-05', '2021-12-22', 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tempat_praktek`
--

CREATE TABLE `tempat_praktek` (
  `id_tempat` int(11) NOT NULL,
  `nama_tempat` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `nama_pimpinan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tempat_praktek`
--

INSERT INTO `tempat_praktek` (`id_tempat`, `nama_tempat`, `alamat`, `no_telp`, `nama_pimpinan`) VALUES
(1, 'PT.SOECHI LINES', 'Jakarta Pusat', '+622180861000', 'Pieters A.Utomo'),
(2, 'Maersk Line', 'Jakarta Pusat', '02130065555', 'A.P. Moller Maersk Group'),
(3, 'PT PELNI', 'Jakarta Pusat', '+622163854130', 'Insan Purwarisya'),
(4, 'PT Kartika Samudra Adijaya', 'Jakarta Selatan', '+62215276015', 'Kartika Hadi');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `cadet`
--
ALTER TABLE `cadet`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pemilihan_detail`
--
ALTER TABLE `pemilihan_detail`
  ADD PRIMARY KEY (`id_detail`);

--
-- Indeks untuk tabel `pemilihan_tempat`
--
ALTER TABLE `pemilihan_tempat`
  ADD PRIMARY KEY (`id_pemilihan`);

--
-- Indeks untuk tabel `tempat_praktek`
--
ALTER TABLE `tempat_praktek`
  ADD PRIMARY KEY (`id_tempat`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `cadet`
--
ALTER TABLE `cadet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `pemilihan_detail`
--
ALTER TABLE `pemilihan_detail`
  MODIFY `id_detail` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `pemilihan_tempat`
--
ALTER TABLE `pemilihan_tempat`
  MODIFY `id_pemilihan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `tempat_praktek`
--
ALTER TABLE `tempat_praktek`
  MODIFY `id_tempat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
