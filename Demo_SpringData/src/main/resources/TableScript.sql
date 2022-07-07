drop database if exists customer_db;
create database customer_db;
use  customer_db;


create table customer0(
   customer_id int,
   email_id varchar(50),
   name varchar(20),
   date_of_birth date,
   constraint ps_customer_id_pk primary key (customer_id)
);


insert into customer0 (customer_id, email_id, name, date_of_birth) values (1, 'martin@infy.com', 'martin', sysdate()- interval 9136 day);
commit;
select * from customer;