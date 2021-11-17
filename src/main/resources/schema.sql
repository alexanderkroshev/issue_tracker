DROP TABLE IF EXISTS issue;

CREATE TABLE issue
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(250) NOT NULL,
    author      VARCHAR(250) NOT NULL,
    description VARCHAR(250) DEFAULT NULL
);

DROP TABLE IF EXISTS tracker;

CREATE TABLE tracker
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    name   VARCHAR(250) NOT NULL,
    status ENUM('Resolved', 'Created', 'Closed'),
    date   DATE
);