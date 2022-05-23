CREATE TABLE IF NOT EXISTS Users
(
    userId serial PRIMARY KEY,
    firstname varchar (50) NOT NULL,
    lastname varchar (50) NOT NULL,
    email varchar(50) NOT NULL,
    phoneNumber varchar(10) NOT NULL,
    zipCode numeric (5) NOT NULL,
    city varchar (50) NOT NULL,
    adress varchar (50) NOT NULL,
    country varchar (50) NOT NULL
)