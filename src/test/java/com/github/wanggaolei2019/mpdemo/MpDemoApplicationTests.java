package com.github.wanggaolei2019.mpdemo;

import com.github.wanggaolei2019.mpdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MpDemoApplicationTests {
    
    @Resource
    UserService userService;
    
    @Test
    void contextLoads() {
        userService.queryList(null);
    }
    
}
