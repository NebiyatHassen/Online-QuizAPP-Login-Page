
create database Login;
 use Login;
 
create table Logins(
userName varchar(20),
email varchar(20),
Password varchar(20) UNIQUE ,
phoneNumber varchar(15)
); 

insert into Logins(userName , email , Password,phoneNumber ) values('Nebiyat','mebathas@gmail.com','2389','0982018897');

select *from Logins;

