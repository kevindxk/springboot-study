package com.kevin;

import com.kevin.pojo.Penson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootprojectApplicationTests {

    @Autowired
    private Penson penson;

    @Test
    void contextLoads() {
        System.out.println(penson);
    }

}
