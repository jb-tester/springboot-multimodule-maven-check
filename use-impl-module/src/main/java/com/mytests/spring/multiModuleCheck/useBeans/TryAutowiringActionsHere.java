package com.mytests.spring.multiModuleCheck.useBeans;

import org.springframework.stereotype.Component;

@Component
public class TryAutowiringActionsHere {

    // invoke Generate | Autowire Beans... action here
    // Expected:
    // the beans defined in the `impl-module`, i.e.
    // MyService | myFooService, myBarService
    // MyBeanClass | myBean1, myBean2
    // should be available
    // Actual:
    // the `MyService` node is shown w/o any bean subnodes;
    // for `MyBeanClass` type nothing is shown
    // No autowiring errors are shown for the manually injected beans
    // (see `UserComponent` class)
    // injection by completion works to some extent:
    // you can complete the beans by the supertype entering,
    // but not by the concrete bean name

    public void checkInjectionByCompletionHere() {
        System.out.println("====== injection by completion =====");
        // myFooSer  // doesn't work
        // myBean1   // doesn't work
        // myBeanC // works
        // myServ   // works
        System.out.println("===================");
    }

    ;
}
