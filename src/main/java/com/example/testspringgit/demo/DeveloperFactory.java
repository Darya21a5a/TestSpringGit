package com.example.testspringgit.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Data
@Component
public class DeveloperFactory implements Developer{
    private Developer developer;

    @Autowired
    public DeveloperFactory(@Qualifier("javaDeveloper") Developer developer) {
        this.developer = developer;
    }

    @Override
    public void writeCode() {
        developer.writeCode();
    }
}
