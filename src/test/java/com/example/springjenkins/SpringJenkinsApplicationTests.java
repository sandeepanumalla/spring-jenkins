package com.example.springjenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringJenkinsApplicationTests {

    Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
        assertTrue(true);
    }

}
