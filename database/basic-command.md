## :card_file_box: Database (MySql)

Basic commands

```shell
$ mysql -uroot -p
<!-- Enter your password -->
```

Create database

```sql
>> CREATE DATABASE `database-name`;
-- Create database

>> SHOW DATABASES;
-- Check databases

>> USE `database-name`;
-- Use database
```

Migrate your model

```shell
$ python manage.py migrate
<!-- Migrate to mysql database -->
```

Check table

```sql
>> EXPLAIN `table-name`;
-- Check your table's structure
```
