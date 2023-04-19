#!/bin/bash

# 设置变量
IMAGE_NAME=xuxueli/xxl-job-admin
IMAGE_VERSION=2.3.1

CONTAINER_NAME=xxl-job-admin
CONTAINER_PORT=8080
CONTAINER_OUTSIDE_PORT=8081
MYSQL_HOST=192.168.56.150
MYSQL_PORT=3306
MYSQL_DATABASE=xxl_job
MYSQL_USERNAME=root
MYSQL_PASSWORD=mwh123456
ACCESS_TOKEN=KWoFi1t8goSh5k\(F

# 检查是否已存在同名容器，如果存在则先删除
if [ "$(docker ps -aq -f name=$CONTAINER_NAME)" ]; then
  docker stop $CONTAINER_NAME
  docker rm $CONTAINER_NAME
fi

# 运行Docker container
docker run -d \
  --name $CONTAINER_NAME \
  --restart always \
  -v /path/to/xxl-job/logs:/data/applogs \
  -p $CONTAINER_OUTSIDE_PORT:$CONTAINER_PORT \
  -p 9999:9999 \
  -e PARAMS="--spring.datasource.url=jdbc:mysql://$MYSQL_HOST:$MYSQL_PORT/$MYSQL_DATABASE \
  --xxl.job.accessToken=$ACCESS_TOKEN \
  --spring.datasource.username=$MYSQL_USERNAME --spring.datasource.password=$MYSQL_PASSWORD" \
  $IMAGE_NAME:$IMAGE_VERSION
