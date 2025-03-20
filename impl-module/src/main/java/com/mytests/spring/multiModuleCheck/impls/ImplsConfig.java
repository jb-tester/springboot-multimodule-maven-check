package com.mytests.spring.multiModuleCheck.impls;

import com.mytests.spring.multiModuleCheck.api.MyBeanClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.mytests.spring.multiModuleCheck.impls")
public class ImplsConfig {

    @Bean
    public MyBeanClass myBean1() {
        return new MyBeanClass("myBean1");
    }
    @Bean
    public MyBeanClass myBean2() {
        return new MyBeanClass("myBean2");
    }
}
