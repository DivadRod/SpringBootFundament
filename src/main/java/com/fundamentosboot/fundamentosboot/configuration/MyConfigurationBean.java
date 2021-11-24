package com.fundamentosboot.fundamentosboot.configuration;

import com.fundamentosboot.fundamentosboot.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }

    @Bean
    public MyOperation beanOperationSum(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
