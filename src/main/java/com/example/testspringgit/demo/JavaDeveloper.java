package com.example.testspringgit.demo;

import org.springframework.stereotype.Component;

@Component("javaDeveloper")
public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java Developer is writing code...");
    }
}
