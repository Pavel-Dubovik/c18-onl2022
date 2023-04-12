create
    database myshop_db;

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
VALUES (6, 'Cameras', 'camera.jpg');


--------------------------------------------------------
--  ddl for table products
--------------------------------------------------------
drop table if exists products;
create table if not exists products
(
    id          serial primary key,
    name        varchar(200) not null,
    description varchar(300) null,
    price       int          not null,
    image_path  varchar(300) null,
    category_id int          not null
);
alter table products
    add constraint fk_products_category_id_categories_id
        foreign key (category_id)
            references categories (id)
            on delete cascade
            on update cascade;

create unique index idx_products_id_unique on products (id asc);

INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('Смартфон Apple iPhone 13 128GB (темная ночь)',
        'Apple iOS, экран 6.1'''' OLED (1170x2532), Apple A15 Bionic, ОЗУ 4 ГБ, флэш-память 128 ГБ, камера 12 Мп, аккумулятор 3227 мАч, 1 SIM',
        2600, 'mobileApple.jpg', 1);

INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('Смартфон Samsung Galaxy A52 SM-A525F/DS 8GB/256GB (синий)',
        'Android, экран 6.5'''' AMOLED (1080x2400), Qualcomm Snapdragon 720G, ОЗУ 8 ГБ, флэш-память 256 ГБ, карты памяти, камера 64 Мп, аккумулятор 4500 мАч, 2 SIM',
        1200, 'mobileSamsung.jpg', 1);
INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('Игровой ноутбук Lenovo Legion 5 15ACH6H 82JU00A1PB',
        '15.6'''' 1920 x 1080 IPS, 120 Гц, несенсорный, AMD Ryzen 7 5800H 3200 МГц, 16 ГБ DDR4, SSD 512 ГБ, видеокарта NVIDIA GeForce RTX 3060 6 ГБ, Windows 10, цвет крышки темно-синий',
        5500, 'laptopLenovo.jpg', 2);
INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('Игровой ноутбук Acer Nitro 5 AN515-45-R1A6 NH.QBREP.00B',
        '15.6'''' 1920 x 1080 IPS, 144 Гц, несенсорный, AMD Ryzen 5 5600H 3300 МГц, 16 ГБ DDR4, SSD 1024 ГБ, видеокарта NVIDIA GeForce RTX 3070 8 ГБ, Linux, цвет крышки черный',
        5000, 'laptopAcer.jpg', 2);
INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('GPS навигатор GEOFOX MID502GPS', 'экран 5'''' TFT (800 x 480), ОЗУ 128 Мб, флэш-память 8 Гб, Windows CE 6.0',
        222, 'navigatorGeofox.jpg', 3);
INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('GPS навигатор NAVITEL E707 Magnetic',
        'экран 7'''' TFT (800 x 480), процессор MStar MSB2531 800 МГц, флэш-память 8 Гб, Linux', 342,
        'navigatorNavitel.jpg', 3);
INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('Холодильник Bosch Serie 6 VitaFresh Plus KGN39AI32R',
        'отдельностоящий, полный No Frost, электронное управление, класс A++, полезный объём: 388 л (280 + 108 л), инверторный компрессор, зона свежести, перенавешиваемые двери, складная полка, полка для вина, лоток для яиц, отделка: защита от отпечатков, 60x66x203 см, нержавеющая сталь',
        2950, 'fridgeBosch.jpg', 4);
INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('Холодильник Samsung RB37A52N0B1/WT',
        'отдельностоящий, полный No Frost, электронное управление, класс A+, полезный объём: 367 л (269 + 98 л), инверторный компрессор, перенавешиваемые двери, лоток для яиц, 59.5x64.7x201 см, черный',
        2248, 'fridgeSamsung.jpg', 4);
INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('Volvo XC40', '1.6 T3 MT Turbo Momentum', 87832, 'carVolvo.jpg', 5);
INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('Tesla Model X', 'электрический двигатель, P100D Long Range', 272107, 'carTesla.jpg', 5);
INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('Зеркальный фотоаппарат Canon EOS 4000D Kit 18-55mm III',
        'зеркальная камера, байонет Canon EF-S, матрица APS-C (1.6 crop) 18 Мп, с объективом F3.5-5.6 18-55 мм, Wi-Fi',
        1449, 'cameraCanon.jpg', 6);
INSERT INTO products (name, description, price, image_path, category_id)
VALUES ('Зеркальный фотоаппарат Nikon D5600 Kit 18-55mm AF-P DX VR',
        'Зеркальный фотоаппарат Nikon D5600 Kit 18-55mm AF-P DX VR', 2550, 'cameraNikon.jpg', 6);


