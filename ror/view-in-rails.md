# View in Rails

In MVC, the final output is based on the use of `ERB(Embedded Ruby)`. ERB is a structure in which Ruby scripts are inserted in HTML.

## Create template variable

`hello_controller.rb`
```ruby
class HelloController < ApplicationController
  ...
  def view
    @msg = 'Hello World...!!'
  end
end
```
A `template variable` is a variable used to pass data from an action method to a view.

## Create template

The template file should to be created with the name `/<controller_name>/<action_name>.html.erb` inside `/app/view` directory. In this case, create `/hello/view.html.erb`.

`/hello/view.html.erb`
```html
<div id="main">
<%= @msg %>
</div>
```

Check `http://localhost:3000/hello/view`

## <% ... %> and <%= ... %>

```html
<% code %>
<%= return statement %>
```

Example.

```html
<div><% price = 1000
result = price * 1.05 %>
</div>
<div>price : <%= result %></div>
<!-- price : 1050.0 -->
```

## Auto create view

```shell
$ rails generate controller <name> <viewName>
```

It create automatically template file with controller class.

## Common layout

To set common layout, modify `/app/views/layouts/application.html.erb`.

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Helloworld</title>
    <%= csrf_meta_tags %>
    <%= csp_meta_tag %>

    <%= stylesheet_link_tag 'application', media: 'all', 'data-turbolinks-track': 'reload' %>
    <%= javascript_pack_tag 'application', 'data-turbolinks-track': 'reload' %>
  </head>

  <body>
    <%= yield %>
  </body>
</html>
```

Templates are included in `<%= yield %>`. So above code can be rebuild like this.

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Helloworld</title>
    <%= csrf_meta_tags %>
    <%= csp_meta_tag %>

    <%= stylesheet_link_tag 'application', media: 'all', 'data-turbolinks-track': 'reload' %>
    <%= javascript_pack_tag 'application', 'data-turbolinks-track': 'reload' %>
  </head>

  <body>
    <div id="main">
    <%= @msg %>
    </div>
  </body>
</html>
```
