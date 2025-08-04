package com.example.githubactionlib;

public class GHAServiceImpl implements GHAService {
    @Override
    public String hello(String name) {
        return """
                Hello, "%s"!""".formatted(name);
    }
}
