package codedream.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author alice
 * @time 2023-06-12 17:33
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer1Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer1Application.class).web(true).run(args);
    }
}
