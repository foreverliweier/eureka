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
public class EurekaServer3Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer3Application.class).web(true).run(args);
    }
}
