package dk.sunepoulsen.timelog.users.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static dk.sunepoulsen.tes.springboot.service.core.utils.SpringBootApplicationUtils.COMPONENT_SCAN_PACKAGES;

@EnableWebMvc
@EnableAsync
@SpringBootApplication( scanBasePackages = { COMPONENT_SCAN_PACKAGES } )
public class Application {
    public static void main( String[] args ) {
        SpringApplication.run( Application.class, args );
    }
}
