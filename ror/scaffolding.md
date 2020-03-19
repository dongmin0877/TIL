# Scaffolding

`Scaffolding` is the function to create the structure of an application. It lets you build CRUD easily. :rocket:


## Use scaffolding

```shell
$ rails generate scaffold name field:type [...] [options]
```

Create book model by using scaffolding.

```shell
$ rails generate scaffold book isbn:string title:string price:integer publish:string published:date cd:boolean
    invoke  active_record
    create    db/migrate/20200317234651_create_books.rb
    create    app/models/book.rb
    invoke    test_unit
    create      test/models/book_test.rb
    create      test/fixtures/books.yml
    invoke  resource_route
    route    resources :books
    invoke  scaffold_controller
    create    app/controllers/books_controller.rb
    invoke    erb
    create      app/views/books
    create      app/views/books/index.html.erb
    create      app/views/books/edit.html.erb
    create      app/views/books/show.html.erb
    create      app/views/books/new.html.erb
    create      app/views/books/_form.html.erb
    invoke    test_unit
    create      test/controllers/books_controller_test.rb
    create      test/system/books_test.rb
    invoke    helper
    create      app/helpers/books_helper.rb
    invoke      test_unit
    invoke    jbuilder
    create      app/views/books/index.json.jbuilder
    create      app/views/books/show.json.jbuilder
    create      app/views/books/_book.json.jbuilder
    invoke  assets
    invoke    scss
    create      app/assets/stylesheets/books.scss
    invoke  scss
    create    app/assets/stylesheets/scaffolds.scss
```

## Migration

```shell
$ rake db:migrate
```

## Check the result


Move to `http://localhost:3000/books`.

```
Books
Isbn	Title	Price	Publish	Published	Cd	
New Book
```

## Check the routes

If you create `book` by using scaffolding, routes.rb will be as below.

```ruby
Rails.application.routes.draw do
  resources :books
  ...
end
```

Also you can easily check routes by typing following command line.

```shell
$ rake routes
```

You can see the list below.

|Prefix|Verb|URI Pattern|Controller#Action|
|---|---|---|---|
|books|GET|/books(.:format)|books#index|
| |POST|/books(.:format)|books#create|
|new_book|GET|/books/new(.:format)|books#new|
|edit_book|GET|/books/:id/edit(.:format)|books#edit|
|book|GET|/books/:id(.:format)|books#show|
| |PATCH|/books/:id(.:format)|books#update|
| |PUT|/books/:id(.:format)|books#update|
| |DELETE|/books/:id(.:format)|books#destroy|