# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table customer (
  customer_id                   bigint auto_increment not null,
  name                          varchar(255),
  branche                       varchar(255),
  constraint pk_customer primary key (customer_id)
);

create table project (
  project_id                    bigint auto_increment not null,
  name                          varchar(255),
  beschreibung                  varchar(255),
  image_path                    varchar(255),
  customer_customer_id          bigint,
  constraint pk_project primary key (project_id)
);

create table project_holder (
  projectholder_id              bigint auto_increment not null,
  customer_customer_id          bigint,
  project_project_id            bigint,
  constraint pk_project_holder primary key (projectholder_id)
);

create table project_task (
  projecttask_id                bigint auto_increment not null,
  project_project_id            bigint,
  task_task_id                  bigint,
  constraint pk_project_task primary key (projecttask_id)
);

create table task (
  task_id                       bigint auto_increment not null,
  name                          varchar(255),
  beschreibung                  varchar(255),
  dauer                         bigint,
  project_project_id            bigint,
  constraint pk_task primary key (task_id)
);

create table worker (
  workerid                      bigint auto_increment not null,
  vorname                       varchar(255),
  nachname                      varchar(255),
  abteilung                     varchar(255),
  arbeitszeit                   bigint,
  constraint pk_worker primary key (workerid)
);

create table worker_task (
  workertask_id                 bigint auto_increment not null,
  worker_workerid               bigint,
  task_task_id                  bigint,
  constraint pk_worker_task primary key (workertask_id)
);

alter table project add constraint fk_project_customer_customer_id foreign key (customer_customer_id) references customer (customer_id) on delete restrict on update restrict;
create index ix_project_customer_customer_id on project (customer_customer_id);

alter table project_holder add constraint fk_project_holder_customer_customer_id foreign key (customer_customer_id) references customer (customer_id) on delete restrict on update restrict;
create index ix_project_holder_customer_customer_id on project_holder (customer_customer_id);

alter table project_holder add constraint fk_project_holder_project_project_id foreign key (project_project_id) references project (project_id) on delete restrict on update restrict;
create index ix_project_holder_project_project_id on project_holder (project_project_id);

alter table project_task add constraint fk_project_task_project_project_id foreign key (project_project_id) references project (project_id) on delete restrict on update restrict;
create index ix_project_task_project_project_id on project_task (project_project_id);

alter table project_task add constraint fk_project_task_task_task_id foreign key (task_task_id) references task (task_id) on delete restrict on update restrict;
create index ix_project_task_task_task_id on project_task (task_task_id);

alter table task add constraint fk_task_project_project_id foreign key (project_project_id) references project (project_id) on delete restrict on update restrict;
create index ix_task_project_project_id on task (project_project_id);

alter table worker_task add constraint fk_worker_task_worker_workerid foreign key (worker_workerid) references worker (workerid) on delete restrict on update restrict;
create index ix_worker_task_worker_workerid on worker_task (worker_workerid);

alter table worker_task add constraint fk_worker_task_task_task_id foreign key (task_task_id) references task (task_id) on delete restrict on update restrict;
create index ix_worker_task_task_task_id on worker_task (task_task_id);


# --- !Downs

alter table project drop foreign key fk_project_customer_customer_id;
drop index ix_project_customer_customer_id on project;

alter table project_holder drop foreign key fk_project_holder_customer_customer_id;
drop index ix_project_holder_customer_customer_id on project_holder;

alter table project_holder drop foreign key fk_project_holder_project_project_id;
drop index ix_project_holder_project_project_id on project_holder;

alter table project_task drop foreign key fk_project_task_project_project_id;
drop index ix_project_task_project_project_id on project_task;

alter table project_task drop foreign key fk_project_task_task_task_id;
drop index ix_project_task_task_task_id on project_task;

alter table task drop foreign key fk_task_project_project_id;
drop index ix_task_project_project_id on task;

alter table worker_task drop foreign key fk_worker_task_worker_workerid;
drop index ix_worker_task_worker_workerid on worker_task;

alter table worker_task drop foreign key fk_worker_task_task_task_id;
drop index ix_worker_task_task_task_id on worker_task;

drop table if exists customer;

drop table if exists project;

drop table if exists project_holder;

drop table if exists project_task;

drop table if exists task;

drop table if exists worker;

drop table if exists worker_task;

