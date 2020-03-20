# Index list of scaffolding

## Index action method

`books#index` action is an action that creates a main page called when you enter '/books'.

```ruby
def index
  @books = Book.all
end
```

## `index.json.builder`

`index.json.builder` file is a template used to output the results of the index aciton in JSON format. If you want to use `index.json.builder`, enter `http://localhost:3000/books.json`. So, you can see following result.

```
[
    {
        "id":1,
        "isbn":"00001",
        "title":"hello world",
        "price":6000,
        "publish":"ruby on rails",
        "published":"2020-03-20",
        "cd":false,
        "created_at":"2020-03-20T10:16:38.585Z",
        "updated_at":"2020-03-20T10:16:38.585Z",
        "url":"http://localhost:3000/books/1.json"
    }
]
```

## Auto created code of scaffolding

```ruby
def index
  @books = Book.all

  response_to do |format|
    format.html # index.html.erb
    format.json { render json: @books }
  end
end
```

If the specified format is html, call `index.html.erb`, and if json, apply the `to_json` method to the variable `@book` to replace it with JSON format.

## `index.html.erb`

The code in `books/index.html.erb` is associated with the `books#index` action. Check the following auto created code.

```html
<p id="notice"><%= notice %></p>

<h1>Books</h1>

<table>
  <thead>
    <tr>
      <th>Isbn</th>
      <th>Title</th>
      <th>Price</th>
      <th>Publish</th>
      <th>Published</th>
      <th>Cd</th>
      <th colspan="3"></th>
    </tr>
  </thead>

  <tbody>
    <% @books.each do |book| %>
      <tr>
        <td><%= book.isbn %></td>
        <td><%= book.title %></td>
        <td><%= book.price %></td>
        <td><%= book.publish %></td>
        <td><%= book.published %></td>
        <td><%= book.cd %></td>
        <td><%= link_to 'Show', book %></td>
        <td><%= link_to 'Edit', edit_book_path(book) %></td>
        <td><%= link_to 'Destroy', book, method: :delete, data: { confirm: 'Are you sure?' } %></td>
      </tr>
    <% end %>
  </tbody>
</table>

<br>

<%= link_to 'New Book', new_book_path %>
```

## View Helper

`View Helper` means a method that helps create template files. View Helper makes it easy to create frequently used processing in views.

```html
<a href="http://www.rubyonrails.org/" target="_blank" rel="nofollow">External link</a>
```

Above code can be replaced like below.

```ruby
<%= link_to "External link", "http://www.rubyonrails.org/", target: "_blank", rel: "nofollow" %>
```

You can also create a confirmation box, such as the following code.

```ruby
<%= link_to 'Destroy', book, method: :delete, data: { confirm: 'Are you sure?' } %>
```

| Helper name | path |
| --- | --- |
| book_path | /books |
| book_path(id) | /books/:id |
| new_book_path | /books/new |
| edit_book_path(id) | /books/:id/edit |

