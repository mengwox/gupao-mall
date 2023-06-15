#!/bin/bash

# mysql容器构建脚本

IMAGE_NAME=mysql
CONTAINER_NAME=mysql1
MYSQL_VERSION=8.0.32
ROOT_PASSWORD=mwh123456

# 构建 Docker 镜像
# docker build -t $IMAGE_NAME .

# 检查是否已存在同名容器，如果存在则先删除
if [ "$(docker ps -aq -f name=$CONTAINER_NAME)" ]; then
  docker stop $CONTAINER_NAME
  docker rm $CONTAINER_NAME
fi

# 运行 Docker 容器
docker run -d \
  --name $CONTAINER_NAME \
  --restart always \
  -p 3307:3306 \
  -e MYSQL_ROOT_PASSWORD=$ROOT_PASSWORD \
  $IMAGE_NAME:$MYSQL_VERSION
