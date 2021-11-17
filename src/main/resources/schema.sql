DROP TABLE IF EXISTS issue;

CREATE TABLE issue
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(250) NOT NULL,
    author      VARCHAR(250) NOT NULL,
    description VARCHAR(250) DEFAULT NULL
);