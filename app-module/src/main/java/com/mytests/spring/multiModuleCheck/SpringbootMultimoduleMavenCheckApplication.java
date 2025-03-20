package com.mytests.spring.multiModuleCheck;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootMultimoduleMavenCheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMultimoduleMavenCheckApplication.class, args);
    }
   /* @Bean
        public CommandLineRunner commandLineRunner(AppService appService) {
            return args -> {
                System.out.println("--------------------------------------");
                System.out.println(appService.getMessage());
                System.out.println("--------------------------------------");
            };
        }*/
}
