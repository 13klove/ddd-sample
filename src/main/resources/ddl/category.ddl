create table category
(
    id         bigint not null auto_increment,
    name       varchar(255),
    created_at datetime(6),
    updated_at datetime(6),
    primary key (id)
) engine=InnoDB;

create table product
(
    id          bigint  not null auto_increment,
    name        varchar(255),
    stock       integer not null,
    price       bigint  not null,
    description varchar(255),
    status      varchar(15),
    updated_at  datetime(6),
    created_at  datetime(6),
    primary key (id)
) engine=InnoDB;

create table product_category_mapping
(
    id          bigint not null auto_increment,
    category_id bigint,
    product_id  bigint not null,
    primary key (id)
) engine=InnoDB;

create table product_file
(
    id           bigint not null auto_increment,
    display_name varchar(255),
    name         varchar(255),
    url          varchar(255),
    type         varchar(10),
    product_id   bigint not null,
    size         bigint,
    created_at   datetime(6),
    updated_at   datetime(6),
    primary key (id)
) engine=InnoDB;

create table seller
(
    id             bigint not null auto_increment,
    company_name   varchar(255),
    company_number varchar(255),
    password       varchar(255),
    seller_id      varchar(255),
    primary key (id)
) engine=InnoDB;

create table medical_information
(
    id         bigint      not null auto_increment,
    seller_id  bigint      not null,
    blood_type varchar(10) not null,
    primary key (id)
) engine=InnoDB;