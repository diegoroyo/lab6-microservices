package config;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class ConfigServer {

    public static void main(String[] args){
        SpringApplication.run(ConfigServer.class,args);
    }
}
