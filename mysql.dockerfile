FROM mysql:5.7.22

MAINTAINER Andre Papazoglu

ENV MYSQL_DATABASE=mystore
ENV MYSQL_ROOT_PASSWORD=root

ADD ./products.sql /docker-entrypoint-initdb.d

EXPOSE 3306