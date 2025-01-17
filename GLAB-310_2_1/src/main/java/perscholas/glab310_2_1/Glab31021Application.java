package perscholas.glab310_2_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Glab31021Application {

    public static void main(String[] args) {
        SpringApplication.run(Glab31021Application.class, args);
    }

}
