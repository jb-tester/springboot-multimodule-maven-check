package com.mytests.spring.multiModuleCheck;

import com.mytests.spring.multiModuleCheck.useBeans.UserComponent;
import org.springframework.stereotype.Service;


// AutowiredIn is empty: doesn't navigate to usage in TestService
@Service
class AppService {

    private final UserComponent userComponent;

    AppService(UserComponent userComponent) {
        this.userComponent = userComponent;
    }
    public String getMessage() {
        return "collected beans: " + userComponent.getMessage();
    }
}
