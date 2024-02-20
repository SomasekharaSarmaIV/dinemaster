create table if not exists chef(
    id INT PRIMARY KEY AUTO_INCREMENT,
    firstName varchar(255),
    lastName varchar(255),
    expertise varchar(255),
    experienceYears INT,
    restaurantId INT
   
);

create table if not exists restaurant(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name varchar(255),
    address varchar(255),
    cuisineType varchar(255),
    rating INT,
    FOREIGN KEY (rating) REFERENCES chef(id)
);