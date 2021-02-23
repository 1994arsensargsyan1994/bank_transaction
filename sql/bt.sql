create table users
(
    id         bigserial not null
        constraint users_pkey
            primary key,
    email      varchar(255),
    first_name varchar(255),
    last_name  varchar(255),
    password   varchar(255)
);

alter table users
    owner to postgres;

create table accounts
(
    id         bigserial not null
        constraint accounts_pkey
            primary key,
    creat_time date,
    user_id    bigint
        constraint fknjuop33mo69pd79ctplkck40n
            references users
);

alter table accounts
    owner to postgres;

create table transaction
(
    id      bigserial not null
        constraint transaction_pkey
            primary key,
    status  varchar(255),
    type    varchar(255),
    user_id bigint
        constraint fkanjpo5tiapru7an6cw4cu37y4
            references users
);

alter table transaction
    owner to postgres;

create table user_role
(
    user_id bigint not null
        constraint fkj345gk1bovqvfame88rcx7yyx
            references users,
    roles   varchar(255)
);

alter table user_role
    owner to postgres;

