package conm.lijun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author weed
 * @date 2020/8/17 0017 9:41
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka3002 {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka3002.class);
    }
}
