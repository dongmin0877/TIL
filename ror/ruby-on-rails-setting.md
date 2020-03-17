# RoR setting :package:

```shell
$ sudo apt-get update
$ sudo apt-get install git-core curl zlib1g-dev build-essential libssl-dev libreadline-dev libyaml-dev libsqlite3-dev sqlite3 libxml2-dev libxslt1-dev libcurl4-openssl-dev software-properties-common libffi-dev
```

## Ruby installation

Install rbenv, which controls Ruby version.

```shell
$ git clone https://github.com/rbenv/rbenv.git ~/.rbenv
$ echo 'export PATH="$HOME/.rbenv/bin:$PATH"' >> ~/.bashrc
$ echo 'eval "$(rbenv init -)"' >> ~/.bashrc
$ exec $SHELL
```

Install Ruby compiler ruby-build.

```shell
$ git clone https://github.com/rbenv/ruby-build.git ~/.rbenv/plugins/ruby-build
$ echo 'export PATH="$HOME/.rbenv/plugins/ruby-build/bin:$PATH"' >> ~/.bashrc
$ exec $SHELL
```
Install Ruby and add to rbenv

```shell
$ rbenv install 2.7.0 $$ rbenv rehash
$ rbenv global 2.7.0
```

Check ruby version

```shell
$ ruby -v
```

Install ruby library

```shell
$ gem install bundler
```

## `configure: error: no acceptable C compiler found in $PATH`

```shell
$ sudo apt-get install gcc
```

## RoR installation :rocket:

Install dependency

```shell
$ curl -sL https://deb.nodesource.com/setup_8.x | sudo -E bash -
$ sudo apt-get install -y nodejs
```

Install Rails and add to rbenv

```shell
$ gem install rails -v 6.0.2 $$ rbenv rehash
```

Check rails version

```shell
$ rails -v
```

