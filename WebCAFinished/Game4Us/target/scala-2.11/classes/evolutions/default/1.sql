# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table contact_us (
  contact_id                    integer not null,
  email                         varchar(255),
  content                       varchar(255),
  constraint pk_contact_us primary key (contact_id)
);
create sequence contact_us_seq;

create table games (
  id                            integer not null,
  game_title                    varchar(255),
  game_details                  varchar(255),
  game_rating                   varchar(255),
  game_devs                     varchar(255),
  game_release                  varchar(255),
  game_price                    double,
  xbox_one                      boolean,
  ps4                           boolean,
  pc                            boolean,
  genre_genre_id                integer,
  constraint pk_games primary key (id)
);
create sequence GAMES_seq;

create table genre (
  genre_id                      integer not null,
  genre_name                    varchar(255),
  constraint pk_genre primary key (genre_id)
);
create sequence GENRE_seq;

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table games add constraint fk_games_genre_genre_id foreign key (genre_genre_id) references genre (genre_id) on delete restrict on update restrict;
create index ix_games_genre_genre_id on games (genre_genre_id);


# --- !Downs

alter table games drop constraint if exists fk_games_genre_genre_id;
drop index if exists ix_games_genre_genre_id;

drop table if exists contact_us;
drop sequence if exists contact_us_seq;

drop table if exists games;
drop sequence if exists GAMES_seq;

drop table if exists genre;
drop sequence if exists GENRE_seq;

drop table if exists user;

