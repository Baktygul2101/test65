use `test`;

create table `products` (
 `id` INT auto_increment NOT NULL,
 `name` varchar(128) NOT NULL,
 `image` varchar(128) NOT NULL,
 `count` int not null,
 `description` varchar(128) NOT NULL,
 `price` float not null
);

create table `categories` (
 `id` INT auto_increment NOT NULL,
 `name` varchar(128) NOT NULL,
 `icon` varchar(128) NOT NULL,
 PRIMARY KEY (`id`)
);
