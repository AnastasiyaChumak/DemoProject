CREATE DATABASE IF NOT EXISTS `db`;
USE `db`;

INSERT INTO `db`.`department` (`department_name`, `employee_position`, `employee_surname`, `is_lead`, `salary`) VALUES ('dep1', 'assistance', 'John', 0, 1500);
INSERT INTO `db`.`department` (`department_name`, `employee_position`, `employee_surname`, `is_lead`, `salary`) VALUES ('dep2', 'assistance', 'Collins', 0, 1500);
INSERT INTO `db`.`department` (`department_name`, `employee_position`, `employee_surname`, `is_lead`, `salary`) VALUES ('dep3', 'associate professor', 'Den', 0, 1500);
INSERT INTO `db`.`department` (`department_name`, `employee_position`, `employee_surname`, `is_lead`, `salary`) VALUES ('dep4', 'professor', 'Marko', 1, 1500);
INSERT INTO `db`.`department` (`department_name`, `employee_position`, `employee_surname`, `is_lead`, `salary`) VALUES ('dep2', 'professor', 'Elder', 0, 1500);
