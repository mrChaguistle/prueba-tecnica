CREATE DATABASE IF NOT EXISTS tasks_db;

USE tasks_db;

CREATE TABLE IF NOT EXISTS tasks
(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(64) NOT NULL,
	`description` VARCHAR(255) NOT NULL,
	start_date DATE DEFAULT CURRENT_DATE(),
	PRIMARY KEY (id)
);

INSERT IGNORE INTO tasks (`name`, `description`, start_date) VALUES ('Tarea uno', 'Esta es la descripcion de la tarea uno', CURRENT_DATE());
