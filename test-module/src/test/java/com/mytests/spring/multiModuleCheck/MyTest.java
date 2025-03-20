package com.mytests.spring.multiModuleCheck;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = SpringbootMultimoduleMavenCheckApplication.class)
class MyTest {

@Autowired
ApplicationContext ctx;

    @Autowired
    TestService testService;


    @Test
    void testBeanFromTestModule() {
        System.out.println(testService.getMessage());
        assert testService.getMessage().equals("collected beans: foo bar myBean1 myBean2");
    }
}