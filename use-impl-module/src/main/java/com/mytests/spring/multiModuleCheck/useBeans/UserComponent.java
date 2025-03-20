package com.mytests.spring.multiModuleCheck.useBeans;

import com.mytests.spring.multiModuleCheck.api.MyBeanClass;
import com.mytests.spring.multiModuleCheck.api.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserComponent {

    @Autowired
    MyBeanClass myBean1;

    @Autowired
    MyBeanClass myBean2;

    @Autowired
    MyService myFooService;

    @Qualifier("myBarService")
    @Autowired
    private MyService myService2;


    public String getMessage() {
        return myFooService.getMessage() + " " + myService2.getMessage() + " " + myBean1.getId() + " " + myBean2.getId();
    }
}
