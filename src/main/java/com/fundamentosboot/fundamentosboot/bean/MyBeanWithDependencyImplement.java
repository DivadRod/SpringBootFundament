package com.fundamentosboot.fundamentosboot.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 34;
        System.out.println(myOperation.sum(numero));
        System.out.println("Bean with dependency");
    }
}
