package com.example.githubactionlib;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TestGHAService {
    @Test
    void testHello() {
        GHAService service = new GHAServiceImpl();
        Assertions.assertThat(service.hello("Newman")).contains("Newman");
    }
}
