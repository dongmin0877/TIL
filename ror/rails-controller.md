# Controller in RoR

Purpose of controller is to receive requests for the application. 

## Create controller

```shell
$ rails generate controller <name> <options>
    create  app/controllers/hello_controller.rb
    invoke  erb
    create    app/views/hello
    invoke  test_unit
    create    test/controllers/hello_controller_test.rb
    invoke  helper
    create    app/helpers/hello_helper.rb
    invoke    test_unit
    invoke  assets
    invoke    scss
    create      app/assets/stylesheets/hello.scss
```

If you create controller, rails add `<name>_controller.rb` to `app/controller`.

## Delete controller

`destroy` command removes controller easily created by `generate` command.

```shell
$ rails destroy controller <name>
    remove  app/controllers/hello_controller.rb
    invoke  erb
    remove    app/views/hello
    invoke  test_unit
    remove    test/controllers/hello_controller_test.rb
    invoke  helper
    remove    app/helpers/hello_helper.rb
    invoke    test_unit
    invoke  assets
    invoke    scss
    remove      app/assets/stylesheets/hello.scss
```

## hello_controller.rb

Open `<name>_controller.rb`(In this case, hell_controller.rb) and type following code.

```ruby
# coding: utf-8

class HelloController < ApplicationController
  def index
    render text: 'Hello World!!'
  end
end
```

1. UTF-8

    The standard character code for rails is UTF-8. So, you should to add masic comment to first line.

    `# coding: utf-8`

    However, after Ruby 2.0, the character code is considered UTF-8 by default, so there is no need to use magic comments.

2. ApplicationController

    All controller have to inherit `ApplicationController`. (To be exact, inherit `ApplicationController::Base`)

3. Action method

    Action method handles requests from clients. Controller class can create one or more action methods. All you have to do is declare action method as a `public`. If you want to hide the method, declare it as a `private`.

## Routing

Add route to `/config/routes.rb`.

```ruby
Rails.application.routes.draw do
  # For details on the DSL available within this file, see https://guides.rubyonrails.org/routing.html
  match ':controller(/:action(/:id))', via: [ :get, :post, :patch ]
end
```

`:controller(/:action(/:id))` URL example (It's not apt to RESTful)

* `http://localhost:3000/books`
* `http://localhost:3000/hello/index`
* `http://localhost:3000/blog/show/108`
