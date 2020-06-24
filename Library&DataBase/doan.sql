-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 24, 2020 lúc 07:25 PM
-- Phiên bản máy phục vụ: 8.0.19
-- Phiên bản PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `doan`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tablediemthi`
--

CREATE TABLE `tablediemthi` (
  `idtablebangdiem` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `idtablehocsinh` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `idtablemonhoc` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `idtablekhoahoc` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `diemtrungbinh` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tablediemthi`
--

INSERT INTO `tablediemthi` (`idtablebangdiem`, `idtablehocsinh`, `idtablemonhoc`, `idtablekhoahoc`, `diemtrungbinh`) VALUES
('1', 'HS001', 'TOAN', '012020', 10),
('10', 'HS002', 'VAN', '012020', 7),
('11', 'HS002', 'TOAN', '012020', 7),
('12', 'HS002', 'TIENGANH', '012020', 7),
('13', 'HS003', 'SINH', '012020', 5),
('14', 'HS003', 'THEDUC', '012020', 5),
('15', 'HS003', 'GDCD', '012020', 5),
('16', 'HS003', 'VAN', '012020', 5),
('17', 'HS003', 'TOAN', '012020', 5),
('18', 'HS003', 'TIENGANH', '012020', 5),
('19', 'HS004', 'SINH', '012020', 2),
('2', 'HS001', 'VAN', '012020', 10),
('20', 'HS004', 'THEDUC', '012020', 2),
('21', 'HS004', 'GDCD', '012020', 2),
('22', 'HS004', 'VAN', '012020', 2),
('23', 'HS004', 'TOAN', '012020', 2),
('24', 'HS004', 'TIENGANH', '012020', 2),
('3', 'HS001', 'SINH', '012020', 10),
('4', 'HS001', 'THEDUC', '012020', 10),
('5', 'HS001', 'TIENGANH', '012020', 10),
('6', 'HS001', 'GDCD', '012020', 10),
('7', 'HS002', 'SINH', '012020', 7),
('8', 'HS002', 'THEDUC', '012020', 7),
('9', 'HS002', 'GDCD', '012020', 7);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tablegiaovien`
--

CREATE TABLE `tablegiaovien` (
  `idtablegiaovien` varchar(45) NOT NULL,
  `tengiaovien` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ngaysinh` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `gioitinh` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tablegiaovien`
--

INSERT INTO `tablegiaovien` (`idtablegiaovien`, `tengiaovien`, `ngaysinh`, `gioitinh`) VALUES
('GV001', 'Trần Thị Mơ', '2000-02-13', 'nữ'),
('GV002', 'Nguyễn Mạnh Quân', '1999-07-09', 'nam'),
('GV003', 'Trần Thị Tuyết', '2020-06-16', 'nữ'),
('GV004', 'Trần Thị Mơ', '2000-02-13', 'nữ'),
('GV005', 'Trần Thị Mơ', '2000-02-13', 'nữ'),
('GV006', 'Nguyễn Mạnh Quân', '1999-07-09', 'nam'),
('GV007', 'Trần Thị Tuyết', '2020-06-16', 'nữ'),
('GV008', 'Trần Thị Mơ', '2000-02-13', 'nữ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tablehocsinh`
--

CREATE TABLE `tablehocsinh` (
  `idtablehocsinh` varchar(45) NOT NULL,
  `tenhocsinh` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `gioitinh` char(5) DEFAULT NULL,
  `ngaysinh` varchar(45) DEFAULT NULL,
  `quequan` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `diachi` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `idtablelop` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tablehocsinh`
--

INSERT INTO `tablehocsinh` (`idtablehocsinh`, `tenhocsinh`, `gioitinh`, `ngaysinh`, `quequan`, `diachi`, `idtablelop`) VALUES
('HS001', 'Lý Xuân San', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS002', 'Lý Xuân Sag', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS003', 'Lý Xuân Sng', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS004', 'Lý Xuân Sg', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS005', 'Lý Xuân Ssg', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS006', 'Lý Xuân Sgg', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS007', 'Lý Xuân Sgag', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS008', 'Lý Xuân Sang', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS009', 'Lý Xuân Sangs', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS011', 'Lý Xuân San', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS012', 'Lý Xuân Sag', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS013', 'Lý Xuân Sng', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS014', 'Lý Xuân Sg', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS015', 'Lý Xuân Ssg', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS016', 'Lý Xuân Sgg', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS017', 'Lý Xuân Sgag', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS018', 'Lý Xuân Sang', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS019', 'Lý Xuân Sangs', 'nam', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1'),
('HS020', 'Lý Gia Hân', 'nữ', '2020-06-21', 'Đồng Nai', 'Đồng Nai', 'LH10A1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tablekhoahoc`
--

CREATE TABLE `tablekhoahoc` (
  `idtablekhoahoc` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tablekhoahoc`
--

INSERT INTO `tablekhoahoc` (`idtablekhoahoc`) VALUES
('012018'),
('012019'),
('012020'),
('022018'),
('022019'),
('022020');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tablelop`
--

CREATE TABLE `tablelop` (
  `idtablelop` varchar(45) NOT NULL,
  `tenlop` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `siso` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `idtablegiaovien` varchar(45) DEFAULT NULL,
  `idtablekhoahoc` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tablelop`
--

INSERT INTO `tablelop` (`idtablelop`, `tenlop`, `siso`, `idtablegiaovien`, `idtablekhoahoc`) VALUES
('LH10A1', '10A1', '25', 'GV001', '012020'),
('LH10A2', '10A2', '25', 'GV002', '012020'),
('LH10A3', '10A3', '25', 'GV003', '012020'),
('LH10A4', '10A4', '25', 'GV004', '012020');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tablemonhoc`
--

CREATE TABLE `tablemonhoc` (
  `idtablemonhoc` varchar(45) NOT NULL,
  `tenmonhoc` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sotiet` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tablemonhoc`
--

INSERT INTO `tablemonhoc` (`idtablemonhoc`, `tenmonhoc`, `sotiet`) VALUES
('GDCD', 'Giáo Dục Công Dân', 15),
('SINH', 'Sinh Học', 30),
('THEDUC', 'Thể Dục', 15),
('TIENGANH', 'Ngoại Ngữ (Anh văn)', 45),
('TOAN', 'Toán', 60),
('VAN', 'Ngữ Văn', 60);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `userid` int NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `level` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`userid`, `username`, `password`, `level`) VALUES
(1, 'admin', 'admin', 0);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tablediemthi`
--
ALTER TABLE `tablediemthi`
  ADD PRIMARY KEY (`idtablebangdiem`),
  ADD KEY `idtablehocsinh1_idx` (`idtablehocsinh`),
  ADD KEY `idtablemonhoc_idx` (`idtablemonhoc`),
  ADD KEY `idtablekhoahoc` (`idtablekhoahoc`);

--
-- Chỉ mục cho bảng `tablegiaovien`
--
ALTER TABLE `tablegiaovien`
  ADD PRIMARY KEY (`idtablegiaovien`);

--
-- Chỉ mục cho bảng `tablehocsinh`
--
ALTER TABLE `tablehocsinh`
  ADD PRIMARY KEY (`idtablehocsinh`),
  ADD KEY `idtablelop1_idx` (`idtablelop`);

--
-- Chỉ mục cho bảng `tablekhoahoc`
--
ALTER TABLE `tablekhoahoc`
  ADD PRIMARY KEY (`idtablekhoahoc`);

--
-- Chỉ mục cho bảng `tablelop`
--
ALTER TABLE `tablelop`
  ADD PRIMARY KEY (`idtablelop`),
  ADD KEY `idtablegiaovien1_idx` (`idtablegiaovien`),
  ADD KEY `idtablekhoahoc1_idx` (`idtablekhoahoc`);

--
-- Chỉ mục cho bảng `tablemonhoc`
--
ALTER TABLE `tablemonhoc`
  ADD PRIMARY KEY (`idtablemonhoc`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `userid` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `tablediemthi`
--
ALTER TABLE `tablediemthi`
  ADD CONSTRAINT `idtablehocsinh1` FOREIGN KEY (`idtablehocsinh`) REFERENCES `tablehocsinh` (`idtablehocsinh`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `idtablekhoahoc` FOREIGN KEY (`idtablekhoahoc`) REFERENCES `tablekhoahoc` (`idtablekhoahoc`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `idtablemonhoc1` FOREIGN KEY (`idtablemonhoc`) REFERENCES `tablemonhoc` (`idtablemonhoc`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `tablehocsinh`
--
ALTER TABLE `tablehocsinh`
  ADD CONSTRAINT `idtablelop` FOREIGN KEY (`idtablelop`) REFERENCES `tablelop` (`idtablelop`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `tablelop`
--
ALTER TABLE `tablelop`
  ADD CONSTRAINT `idtablegiaovien3` FOREIGN KEY (`idtablegiaovien`) REFERENCES `tablegiaovien` (`idtablegiaovien`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `idtablekhoahoc3` FOREIGN KEY (`idtablekhoahoc`) REFERENCES `tablekhoahoc` (`idtablekhoahoc`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
