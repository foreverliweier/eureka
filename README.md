# eureka

#可以通过spring.profiles.active属性来分别启动peer1和peer2
java -jar eureka-server-1.0.0.jar --spring.profiles.active=peer1
java -jar eureka-server-1.0.0.jar --spring.profiles.active=peer2


Eureka Server会缓存服务信息，如果服务的IP地址发生变化，需要刷新缓存。可以通过Eureka Server的REST接口来刷新缓存
curl -X POST http://eureka-server:8761/eureka/apps/your-service-name
其中，eureka-server是Eureka Server的主机名或IP地址，your-service-name是服务的名称。执行该命令后，Eureka Server会刷新缓存，并将新的服务信息广播给所有的Eureka Client