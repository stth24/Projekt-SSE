-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 31. Mrz 2017 um 16:05
-- Server-Version: 5.6.26
-- PHP-Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `sse_projektverwaltung`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `aufgaben`
--

CREATE TABLE IF NOT EXISTS `aufgaben` (
  `id` int(11) NOT NULL,
  `bezeichnung` varchar(100) NOT NULL,
  `beschreibung` varchar(1000) DEFAULT NULL,
  `startzeit` datetime NOT NULL,
  `endzeit` datetime NOT NULL,
  `projekt_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `aufgaben_mitarbeiter`
--

CREATE TABLE IF NOT EXISTS `aufgaben_mitarbeiter` (
  `aufgabe_id` int(11) NOT NULL,
  `mitarbeiter_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `kunden`
--

CREATE TABLE IF NOT EXISTS `kunden` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `mitarbeiter`
--

CREATE TABLE IF NOT EXISTS `mitarbeiter` (
  `id` int(11) NOT NULL,
  `vorname` varchar(100) NOT NULL,
  `nachname` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `projekte`
--

CREATE TABLE IF NOT EXISTS `projekte` (
  `id` int(11) NOT NULL,
  `bezeichnung` varchar(100) NOT NULL,
  `beschreibung` varchar(1000) DEFAULT NULL,
  `kunde_id` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `email` varchar(100) NOT NULL,
  `passwort` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `aufgaben`
--
ALTER TABLE `aufgaben`
  ADD PRIMARY KEY (`id`),
  ADD KEY `projekt_id` (`projekt_id`),
  ADD KEY `projekt_id_2` (`projekt_id`);

--
-- Indizes für die Tabelle `kunden`
--
ALTER TABLE `kunden`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `mitarbeiter`
--
ALTER TABLE `mitarbeiter`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `projekte`
--
ALTER TABLE `projekte`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`email`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `aufgaben`
--
ALTER TABLE `aufgaben`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `kunden`
--
ALTER TABLE `kunden`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `mitarbeiter`
--
ALTER TABLE `mitarbeiter`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `projekte`
--
ALTER TABLE `projekte`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
