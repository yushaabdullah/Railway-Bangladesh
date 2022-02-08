Drop TABLE CUSTOMER 

CREATE TABLE CUSTOMER 
(
CustomerId int IDENTITY(1,1) PRIMARY KEY,
LastName varchar(50) NOT NULL ,
FirstName varchar(50) NOT NULL ,
Email varchar(50) NOT NULL ,
CustomerPassword varchar(50) NOT NULL,
Age int NOT NULL,
Gender varchar(50) NOT NULL ,
Phone varchar(50) NOT NULL ,
BookingCount int NOT NULL ,
)

SELECT * FROM CUSTOMER

/*INSERT INTO CUSTOMER VALUES ('"+last_name+"', '"+first_name+"', '"+email+"', '"+sign_up_confirm_password+"','"+age+"','"+gender+"','"+phone+"')

INSERT INTO LogInUser VALUES ('"+email+"','"+sign_up_confirm_password+"')*/

Drop TABLE LogInUser 

CREATE TABLE LogInUser 
(
LoginId int IDENTITY(1,1) PRIMARY KEY,
CustomerId int NOT NULL FOREIGN KEY REFERENCES CUSTOMER (CustomerId),
Email varchar(50) NOT NULL ,
User_Password varchar(50) NOT NULL ,
)

SELECT * FROM LogInUser 


Drop TABLE Train

CREATE TABLE Train 
(
TrainNumber int IDENTITY(1,1) PRIMARY KEY,
TrainName varchar(50) NOT NULL ,
Source varchar(50) NOT NULL ,
Destination varchar(50) NOT NULL ,
DepartureDate varchar(50) NOT NULL ,
DepartureTime varchar(50) NOT NULL ,
ArrivalTime varchar(50) NOT NULL ,
)



INSERT INTO Train Values ('Suborno Express','Dhaka', 'Chittagong', '14/10/2021', '08:30 AM', '05:30 PM') 
INSERT INTO Train Values ('Upaban Express','Dhaka', 'Sylhet', '15/10/2021', '09:40 AM', '03:30 PM') 
INSERT INTO Train Values ('Upakul Express','Dhaka', 'Noakhali', '14/10/2021', '01:00 PM', '08:00 PM') 
INSERT INTO Train Values ('Sundarbon Express','Dhaka', 'Khulna', '15/10/2021', '06:30 AM', '04:30 PM') 
INSERT INTO Train Values ('Barendra Express','Dhaka', 'Rajshahi', '15/10/2021', '10:30 AM', '06:45 PM') 
INSERT INTO Train Values ('Kishoreganj Express','Dhaka', 'Kishoreganj', '14/10/2021', '2:00 PM', '07:30 PM') 
INSERT INTO Train Values ('Lalmoni Express','Dhaka', 'Lalmonirhat', '14/10/2021', '9:45 PM', '07:30 AM') 
INSERT INTO Train Values ('Rangpur Express','Dhaka', 'Rangpur', '14/10/2021', '08:00 AM', '07:45 PM') 
INSERT INTO Train Values ('Benapole Express','Dhaka', 'Benapole', '15/10/2021', '11:30 AM', '04:00 PM') 
INSERT INTO Train Values ('Parbati Express','Dhaka', 'Dinajpur', '15/10/2021', '09:30 PM', '05:30 AM') 
INSERT INTO Train Values ('Isakhan Express','Dhaka', 'Mymensingh', '14/10/2021', '11:00 AM', '03:00 PM')
INSERT INTO Train Values ('Shovon Express','Dhaka', 'Chittagong', '14/10/2021', '11:00 AM', '03:00 PM') 


Select * from Train 


Drop TABLE Seats

CREATE TABLE Seats 
(
IndexNumber int IDENTITY(1,1) PRIMARY KEY,
TrainNumber int NOT NULL FOREIGN KEY REFERENCES Train (TrainNumber),
DepartureDate varchar(50) NOT NULL ,
SeatType varchar(50) NOT NULL ,
SeatNumber varchar(50) NOT NULL ,
SeatStatus varchar(50) NOT NULL,
TicketPrice int NOT NULL,
)


INSERT INTO Seats Values (1,'14/10/2021','AC','1A','Available',900)
INSERT INTO Seats Values (1,'14/10/2021','AC','2A','Available',900)
INSERT INTO Seats Values (1,'14/10/2021','AC','3A','Available',900)
INSERT INTO Seats Values (1,'14/10/2021','AC','4A','Available',900)
INSERT INTO Seats Values (1,'14/10/2021','AC','5A','Available',900)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','1B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','2B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','3B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','4B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','5B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','6B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','7B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','8B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','9B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','10B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','11B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','12B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','13B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','14B','Available',500)
INSERT INTO Seats Values (1,'14/10/2021','NON AC','15B','Available',500)

Select * from Seats 

Drop table Seats

SELECT COUNT(*) FROM Seats WHERE TrainNumber='"++"' AND DepartureDate='"++"'
SELECT COUNT(*) FROM Seats WHERE TrainNumber='"++"' AND DepartureDate='"++"' AND SeatStatus='Available'


CREATE TABLE Tickets 
(
IndexNumber int IDENTITY(1,1) PRIMARY KEY,
TicketID varchar(50) NOT NULL ,
CustomerId int NOT NULL FOREIGN KEY REFERENCES CUSTOMER (CustomerId),
TrainNumber int NOT NULL FOREIGN KEY REFERENCES Train (TrainNumber),
TrainName varchar(50) NOT NULL ,
Source varchar(50) NOT NULL ,
Destination varchar(50) NOT NULL ,
DepartureDate varchar(50) NOT NULL ,
DepartureTime varchar(50) NOT NULL ,
SeatNumbers varchar(100) NOT NULL ,
Fare int NOT NULL,
)

Drop Table Tickets

SELECT TicketPrice FROM Seats WHERE TrainNumber = '" + train_number + "' AND DepartureDate = '" + departure_date + "' AND SeatType ='AC'

SELECT * FROM Seats WHERE TrainNumber = '" + train_number + "' AND DepartureDate = '" + departure_date + "' AND SeatType ='AC' AND SeatStatus='Available'



SELECT * FROM Train WHERE Source = 'Dhaka' AND Destination = 'Chittagong' AND DepartureDate = '07/10/2021'
SELECT * FROM Train

SELECT TrainNumber FROM Train WHERE TrainName = '"+train_name+"'


DROP TABLE LogInUser 



DELETE From CUSTOMER

Select * from CUSTOMER where Email = '"++"'

Select * from LogInUser

INSERT INTO LogInUser (CustomerId,Email,User_Password) VALUES (1,'yu','sign_up_confirm_password')

DROP TABLE CUSTOMER

Select * from Tickets WHERE CustomerId='"+customer_id+"' AND TrainNumber = '" + train_number + "' AND DepartureDate = '" + departure_date + "'

INSERT INTO Tickets Values ('"+ticket_number+"','"+customer_id+"','" + train_number + "','"+train_name+"','"+source+"','"+destination+"','" + departure_date + "','"+departure_time+"','"+seat_number+"','"+total_fare+"')

Select * from Train WHERE TrainNumber = '" + train_number + "' AND DepartureDate = '" + departure_date + "'

Select * from Seats WHERE TrainNumber = '" + train_number + "' AND DepartureDate = '" + departure_date + "' AND SeatNumber='"+seat_number+"'

Update Seats set SeatStatus='Booked' where TrainNumber = '" + train_number + "' AND DepartureDate = '" + departure_date + "' AND SeatNumber='"+seat_number+"'


Select * from Tickets WHERE CustomerId='"+customer_id+"' AND TrainNumber = '" + train_number + "' AND DepartureDate = '" + departure_date + "'


Select * from Seats WHERE SeatNumber='"+seat_number+"' AND TrainNumber = '" + train_number + "' AND DepartureDate = '" + departure_date + "'


Select * from CUSTOMER WHERE CustomerId='"+customer_id+"'


Update CUSTOMER set BookingCount='"+booking_count+"' where CustomerId='"+customer_id+"'



Select CustomerId, max(BookingCount) as maxBooking from CUSTOMER Group By CustomerId

Select CustomerId, max(BookingCount) as maxBooking from CUSTOMER where BookingCount<(Select max(BookingCount)  from CUSTOMER )  Group By CustomerId

Select CustomerId, max(BookingCount) as maxBooking from CUSTOMER where BookingCount<(Select max(BookingCount)  from CUSTOMER  where BookingCount<(Select max(BookingCount)  from CUSTOMER ) )  Group By CustomerId
