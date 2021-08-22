SET MODE PostgreSQL;
CREATE TABLE IF NOT EXISTS news (
 id int PRIMARY KEY auto_increment,
 employee VARCHAR,
 role VARCHAR,
 department VARCHAR,
 news VARCHAR,
);
