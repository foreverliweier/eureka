# eureka

#����ͨ��spring.profiles.active�������ֱ�����peer1��peer2
java -jar eureka-server-1.0.0.jar --spring.profiles.active=peer1
java -jar eureka-server-1.0.0.jar --spring.profiles.active=peer2


Eureka Server�Ỻ�������Ϣ����������IP��ַ�����仯����Ҫˢ�»��档����ͨ��Eureka Server��REST�ӿ���ˢ�»���
curl -X POST http://eureka-server:8761/eureka/apps/your-service-name
���У�eureka-server��Eureka Server����������IP��ַ��your-service-name�Ƿ�������ơ�ִ�и������Eureka Server��ˢ�»��棬�����µķ�����Ϣ�㲥�����е�Eureka Client