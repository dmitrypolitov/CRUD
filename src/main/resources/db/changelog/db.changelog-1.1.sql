--liquibase formatted sql
--changeset politov:1
INSERT INTO parent(name)
values ('Bob'),('Sam'),('Alex'),('Anna'),('Vika');
--rollback DROP TABLE politov1

--changeset politov:2
INSERT INTO car(name, color, parent_id)
values ('BWM', 'Red', 1), ('Lada', 'White', 1), ('Mercedes', 'Black', 2), ('Opel', 'Green', 3), ('Subaru', 'Grey', 4), ('Reno', 'Grey', 4);
--rollback DROP TABLE car;

