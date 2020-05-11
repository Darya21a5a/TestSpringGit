package com.example.testspringgit.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("C++ Developer is writing code...");
    }
}
