DROP DATABASE IF EXISTS `task_board`;
CREATE DATABASE `task_board` DEFAULT CHARSET utf8 COLLATE utf8_bin;
GRANT ALL PRIVILEGES ON `task_board`.* TO task_board@localhost IDENTIFIED BY 'hogehoge';
