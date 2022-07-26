--liquibase formatted sql
--changeset politov:1
    CREATE TABLE parent
(
    id bigserial primary key,
    name varchar(250) unique
);
--rollback DROP TABLE politov1

--changeset politov:2
    CREATE TABLE car
(
    id bigserial primary key,
    name varchar(250),
    color varchar(250),
    parent_id bigint references parent(id)
);
--rollback DROP TABLE politov2
