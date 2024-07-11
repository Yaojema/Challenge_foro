
create table topicos(

    id bigint not null auto_increment,
    titulo varchar(200) not null,
    mensaje varchar(250) not null,
    fecha_creacion date not null,
    estado varchar(100) not null,
    autor varchar(150) not null,
    curso varchar(150) not null,

    primary key(id)

);