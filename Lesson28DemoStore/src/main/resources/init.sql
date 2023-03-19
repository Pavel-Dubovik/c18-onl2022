create
database demostore_db;

create table categories
(
    id        serial not null primary key,
    name      varchar(30),
    imageName varchar(30)
);

INSERT INTO categories (id, name, imageName)
VALUES (1, 'Mobile phones', 'mobile.jpg');
INSERT INTO categories (id, name, imageName)
VALUES (2, 'Laptops', 'laptop.jpg');
INSERT INTO categories (id, name, imageName)
VALUES (3, 'GPS Navigators', 'jps_nav.jpg');
INSERT INTO categories (id, name, imageName)
VALUES (4, 'Fridges', 'fridge.jpg');
INSERT INTO categories (id, name, imageName)
VALUES (5, 'Cars', 'car.jpg');
INSERT INTO categories (id, name, imageName)
VALUES (6, 'Cameras', 'camera.jpg')

create table products
(

)