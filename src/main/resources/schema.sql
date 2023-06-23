-- This is just a draft file as for now and it will not be run in the application
-- I have copied it from my console
-- TODO Add docker support and run database in docker container and re-use this file

-- CREATE DATABASE library;

CREATE TABLE books
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR NOT NULL,
    author      VARCHAR NOT NULL,
    total_count INT     NOT NULL,
    taken_count INT
);

CREATE TABLE subscribers
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL
);

CREATE TABLE taken_books
(
    id            SERIAL PRIMARY KEY,
    book_id       INT,
    subscriber_id INT,
    date_owned DATE,
    is_returned BOOLEAN,
    CONSTRAINT fk_article FOREIGN KEY (book_id) REFERENCES books (id),
    CONSTRAINT fk_tag FOREIGN KEY (subscriber_id) REFERENCES subscribers (id)
);

INSERT into books(name, author, total_count, taken_count)
VALUES ('Women Who Run With the Wolves: Myths and Stories of the Wild Woman Archetype ', 'Clarissa Pinkola Estes', 2,
        0);

INSERT into books(name, author, total_count, taken_count)
VALUES ('Eho Labyrinths', 'Max Frei', 1, 0);

INSERT into books(name, author, total_count, taken_count)
VALUES ('Folk of the forest', 'Lesia Ukrainka', 3, 0);

INSERT into subscribers(name)
VALUES ('Daria Malysheva');

INSERT into subscribers(name)
VALUES ('John Snow');

-- ALTER TABLE books
--     OWNER TO postgres;
-- ALTER TABLE subscribers
--     OWNER TO postgres;
-- ALTER TABLE taken_books
--     OWNER TO postgres;


DROP TABLE IF EXISTS taken_books;
DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS subscribers;


