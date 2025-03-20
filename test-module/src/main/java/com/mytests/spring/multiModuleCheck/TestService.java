package com.mytests.spring.multiModuleCheck;

import org.springframework.stereotype.Service;


@Service
class TestService {


    private final AppService appService;

    // navigates to AppService bean, but there is no back navigation
    TestService(AppService appService) {
        this.appService = appService;
    }

    public String getMessage() {
        return appService.getMessage();
    }
}
