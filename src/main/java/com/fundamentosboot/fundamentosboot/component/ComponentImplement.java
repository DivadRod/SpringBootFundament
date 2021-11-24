package com.fundamentosboot.fundamentosboot.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependecy{

    @Override
    public void saludar() {
        System.out.println("HI :3");
    }
}
