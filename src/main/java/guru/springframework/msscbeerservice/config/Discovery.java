package guru.springframework.msscbeerservice.config;


import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local-discovery")
@EnableEurekaClient
public class Discovery {
}
