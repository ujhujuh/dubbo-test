# dubbo-test 启动

## 本地启动zookeeper
```
docker pull zookeeper
docker run -it -d --name zookeeper -p 2181:2181 -p 2888:2888 -p 3888:3888 -v E:/Volume/zookeeper/data:/data -v E:/Volume/zookeeper/datalog:/datalog  zookeeper
```

## 启动producer和consumer

调用consumer中getGoods方法, localhost:8062/goods/getGoods 验证服务调用情况

## 启动dubbo-admin查看dubbo控制台
```
java -jar dubbo-admin-0.0.1-SNAPSHOT.jar
```