package com.example.testspringgit.demo;

import org.springframework.stereotype.Component;

@Component
public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("C++ Developer is writing code...");
    }
}
