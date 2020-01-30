# :metal: Django Deploy using ec2

## :link: Connect to Instance 

Locate your directory in which pem keypair is.

```shell
$ chmod 400 your-keypair.pem
$ ssh -i your-keypair.pem ubuntu@public-DNS
```

## :wrench: EC2 setting

```shell
$ sudo apt-get upgrade
$ sudo apt-get upgrade -y
```

Install pyenv

```shell
$ sudo apt-get install python3-venv
```

Install virtualenv

```shell
$ python3 -m venv env
```

Launch virtualenv

```shell
$ source env/bin/activate
```

## :sparkles: Clone repository

```shell
$ git clone "your-repository"
```

## :package: Install gunicorn

Should install gunicorn to virtualenv.

```shell
$ pip3 install gunicorn
```

## :package: Install Nginx to Ubuntu and Launch

```shell
$ sudo apt-get install -y nginx
$ sudo nginx
```

## :warning: [ERROR] Address already in use

```shell
$ sudo fuser -k 80/tcp
```

## :lock: Security group setting

Check your instance's security group name.

Move to security group tap.

Add Inbound rules. (Check group name)


| Type | Protocol | Port Range | Source |
| --- | --- | --- | --- |
| SSH | TCP | 22  | custom 0.0.0.0/0 |
| HTTP | TCP | 80  | Anywhere 0.0.0.0/0, ::/0 |
| Cutstom | TCP | 8000 | Anywhere 0.0.0.0/0, ::/0 |

Refresh your puplic aws dns.

## :rocket: Launch Django app using gunicorn

```shell
$ gunicorn --bind 0.0.0.0:8000 your-app-name.wsgi:application
```

