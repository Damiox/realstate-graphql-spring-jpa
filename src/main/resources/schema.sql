drop table if exists app_neighbourhood;
drop table if exists app_house;

create table app_neighbourhood (
    id bigint,
    name varchar(100) not null,
    city varchar(100) not null,
    primary key (id)
);

create table app_house (
    id bigint,
    beds int not null,
    baths int not null,
    sqft int not null,
    age int not null,
    neighbourhoodid bigint,
    primary key (id),
    foreign key (neighbourhoodid) references app_neighbourhood(id)
);

create sequence if not exists hibernate_sequence start with 100;
