package com.mytests.spring.multiModuleCheck.impls;

import com.mytests.spring.multiModuleCheck.api.MyService;
import org.springframework.stereotype.Service;

 
@Service
public class MyFooService implements MyService {
    @Override
    public String getMessage() {
        return "foo";
    }
}
