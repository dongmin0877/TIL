# Model in Rails

Model is in charge of database and business logic to access external service.

## ORM

`ORM(Object Relational Mapping)` is a technique that connects the rich objects of an application to tables in a relational database management system.

## Connect to database

To connect to the database using active records, `config/database.yml` must have a setting associated with the connection.

`database.yml`
```ruby
default: &default
  adapter: sqlite3
  pool: <%= ENV.fetch("RAILS_MAX_THREADS") { 5 } %>
  timeout: 5000

development:
  <<: *default
  database: db/development.sqlite3

test:
  <<: *default
  database: db/test.sqlite3

production:
  <<: *default
  database: db/production.sqlite3
```

1. Create `database.yml` in YAML format.
    
    YAML displays parameters in the form of `<parameter name>:<values>`.

    ```ruby
    production:
      adapter: sqlite3
    ```

2. Distinguish the environment according to the purpose.

    Differentiate environments for development purposes.

## Create Model class

```shell
$ rails generate model name field:type [...] [options]
```

```shell
$ rails generate model book isbn:string title:string price:integer
    invoke  active_record
    create    db/migrate/20200317035542_create_books.rb
    create    app/models/book.rb
    invoke    test_unit
    create      test/models/book_test.rb
    create      test/fixtures/books.yml
```

## Migration

Migrations are a convenient way for you to alter your database in a structured and organized manner.

Before migration you can check migration file at `db/migrate/<date>_create_books.rb`.

```ruby
class CreateBooks < ActiveRecord::Migration[6.0]
  def change
    create_table :books do |t|
      t.string :isbn
      t.string :title
      t.integer :price

      t.timestamps
    end
  end
end
```

To run migration file, type following command.

```shell
$ rake db:migrate
```

If you got an error, type following command.

```shell
$ rake db:drop:all
$ rake db:create:all
$ rake db:migrate
```

## Database console

```shell
& rails dbconsole

> .tablse
ar_internal_metadata  books                 schema_migrations  

> .schema books
CREATE TABLE IF NOT EXISTS "books" ("id" integer PRIMARY KEY AUTOINCREMENT NOT NULL, "isbn" varchar, "title" varchar, "price" integer, "created_at" datetime(6) NOT NULL, "updated_at" datetime(6) NOT NULL);

> .quit
```

## Controller and View

```ruby
class HelloController < ApplicationController
  ...
  def list
    @books = Book.all
  end
end
```

```html
<table border='1'>
    <tr>
        <th>ISBN-code</th><th>title</th><th>price</th>
        <th>created_date</th><th>updated_date</th>
    </tr>
<% @books.each do |book| %>
    <tr>
        <td><%= book.isbn %></td>
        <td><%= book.title %></td>
        <td><%= book.price %></td>
        <td><%= book.created_at %></td>
        <td><%= book.updated_at %></td>
    </tr>
<% end %>
</table>
```