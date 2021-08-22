# NEWS Portal Java App:

### By Sultan Mwangovya Kirigha

## Description :notebook:

Create a rest REST API for querying and retrieving scoped news and information.
There should be news/articles/posts that are available to all employees without navigating into any department, 
and others that are housed/classified within departments 
(The “Further Exploration” section below explains the need for this set up).
 

### Prerequisites

 * An up-to-date browser, preferably chrome or mozilla
 * Internet connection !


### Technologies used

   * JAVA
   * Gradle
   * Spark
   * Postgres SQL
   * POSTMAN
   * GSON
   * HTML
   * CSS & Bootstrap
   * Junit

### Installation guide 

  * Run sudo apt-get install postgresql postgresql-contrib libpq-dev in the terminal to install PostgreSQL in your device.
  * Enter y when prompted Do you want to continue? [Y/n] and wait for the installation to complete.
  * Create your own credentials with superuser capabilities with the same name as our login name by running sudo -u postgres createuser --superuser $USER
  * Next, we’ll have to create a database with the same name as our login name by running sudo -u postgres createdb $USER
  * Finally run psql in the terminal to connect to the server


### Structure
 * After running the psql command to connect to the server, proceed to create the database wildlife-tracker by executing the following command: create database news_portal;
 * Follow it up with this following command to connect to the newly created database\c news_portal;
 * Once connected, create the following tables by running these commands:
  
         CREATE TABLE users (id serial primary key, name varchar, position varchar, role varchar, department varchar);
         CREATE TABLE news (id serial primary key, title varchar, description varchar, type varchar, author varchar);
         CREATE TABLE departments (id serial primary key, name varchar, description varchar, totalemployees int);
         CREATE TABLE departments_users (id serial primary key, deptid int, userid int);
         CREATE TABLE departments_news (id serial primary key, deptid int, newsid int, userid int);
         CREATE DATABASE news_portal_test WITH TEMPLATE news_portal;




### BUGS
NO BUGS noted, If any are experienced contact via Email sultankirigha@gmail.com :mailbox: and the issue will be sorted.


### LICENSE
 This website is under the MIT license which can be found [HERE](LICENSE).
 Copyright (c) 2021 Sultan Mwangovya Kirigha.