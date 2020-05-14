# springboot+sentinel实现服务降级

1.下载sentinel
https://github.com/alibaba/Sentinel/releases/download/1.7.2/sentinel-dashboard-1.7.2.jar

2.启动sentinel
```
java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.7.2.jar
```

3.application.properties或application.yml添加支持
```
spring.application.name=api-server
spring.cloud.sentinel.transport.dashboard=localhost:8080
spring.cloud.sentinel.eager=true
```