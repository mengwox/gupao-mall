#!/bin/sh

# nacos容器构建脚本
# 镜像
IMAGE_VERSION=2.2.1

# 容器
CONTAINER_NAME=mall-nacos

# mysql
MYSQL_SERVICE_HOST=192.168.56.150
MYSQL_SERVICE_PORT=3306
MYSQL_SERVICE_USER=root
MYSQL_SERVICE_PASSWORD=mwh123456
MYSQL_SERVICE_DB_NAME=mawenhao

# 构建 Docker 镜像
# docker build -t $IMAGE_NAME .

# 检查是否已存在同名容器，如果存在则先删除
if [ "$(docker ps -aq -f name=$CONTAINER_NAME)" ]; then
  docker stop $CONTAINER_NAME
  docker rm $CONTAINER_NAME
fi

# 下载并运行 Nacos 服务器
docker run -d \
  --name $CONTAINER_NAME \
  -e MODE=standalone \
  -e SPRING_DATASOURCE_PLATFORM=mysql \
  -e MYSQL_SERVICE_HOST=$MYSQL_SERVICE_HOST \
  -e MYSQL_SERVICE_PORT=$MYSQL_SERVICE_PORT \
  -e MYSQL_SERVICE_USER=$MYSQL_SERVICE_USER \
  -e MYSQL_SERVICE_PASSWORD=$MYSQL_SERVICE_PASSWORD \
  -e MYSQL_SERVICE_DB_NAME=$MYSQL_SERVICE_DB_NAME \
  -p 8848:8848 \
  nacos/nacos-server:$IMAGE_VERSION

# 检查 Nacos 服务器是否已成功运行
nacos_running=$(docker ps -f "name=$CONTAINER_NAME" --format "{{.Names}}")
if [ "$nacos_running" = "nacos" ]; then
  echo "Nacos is running."
else
  echo "Failed to start Nacos."
fi
