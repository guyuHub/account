package guyu.test.account.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@EnableEurekaClient
@Component
public class EnableEureka {
    @PostConstruct
    public void pare(){
        System.out.println("EnableEureka new in pare ");
    }

}
