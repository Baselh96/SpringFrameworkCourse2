create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);


insert into person values(1, 'Basel', 'Köln', sysDate());
insert into person values(2, 'Asd', 'Syrien', sysDate());
insert into person values(3, 'Eva', 'New York', sysDate());


/*
 * create table personjpa
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);
 */

insert into person_jpa values(10, 'Köln', sysDate(), 'Basel');
insert into person_jpa values(20, 'Syrien', sysDate(), 'Asd');
insert into person_jpa values(30, 'New York', sysDate(), 'Eva');
