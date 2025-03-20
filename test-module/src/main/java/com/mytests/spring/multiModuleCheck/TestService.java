package com.mytests.spring.multiModuleCheck;

import com.mytests.spring.multiModuleCheck.useBeans.UserComponent;
import org.springframework.stereotype.Service;


@Service
class TestService {


    private final AppService appService;

    // navigates to Appservice, but there is no back navigation
    TestService(AppService appService) {
        this.appService = appService;
    }

    public String getMessage() {
        return appService.getMessage();
    }
}
