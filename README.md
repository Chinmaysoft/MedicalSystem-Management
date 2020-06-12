# Medical Data Management System
    Medical system we store medical data like Medicine,Ayurvedic products or Cosmetic also
    we add patient data like name,number,Disease etc. 
    in this i am not using jaspar report because its not support in my system.


## Create Database Tables
** Registration **
CREATE TABLE Registration(UserName varchar(50) PRIMARY KEY,
Email varchar(25) not null UNIQUE,
Addre varchar(50) not null,
Phone_Number varchar(10) not null,
Medical_Name varchar(25) not null,
UPassword varchar(120) not null,
RTimestamp datetime DEFAULT CURRENT_TIMESTAMP  
);

** Patient **
CREATE TABLE Patient(Patient_ID INTEGER PRIMARY KEY AUTOINCREMENT,
Patient_Name varchar(50),
Phone_Number varchar(10),
Doctor_Name varchar(25),
City varchar(20),
Disease varchar(50),
Total_Price float
);

** Products like(Ayurvedic,Medicine,Cosmetic) **
CREATE TABLE Products (
	Product_id	INTEGER PRIMARY KEY AUTOINCREMENT,
	Product_Name	varchar(120) NOT NULL UNIQUE,
	Company_Name	varchar(120) NOT NULL,
	Mfg_Date	date NOT NULL,
	Exp_Date	date NOT NULL,
	Price	float,
	Quantity	INTEGER,
	Status	varchar(120) NOT NULL,
	PTimestamp	datetime DEFAULT CURRENT_TIMESTAMP
);

** Bill **
CREATE TABLE Bill(Bill_id INTEGER PRIMARY KEY AUTOINCREMENT,
Patient_Name varchar(120) NOT NULL,
Phone_Number varchar(10) NOT NULL,
Doctor_Prescription varchar(128) NOT NULL,
Total_Price float,
Bill_Details varchar(100) NOT NULL,
Patient_ID INTEGER REFERENCES Patient(Patient_ID) ,
Timestamp datetime DEFAULT CURRENT_TIMESTAMP
);

** Add path in SQLConnection file**


##### Thank You