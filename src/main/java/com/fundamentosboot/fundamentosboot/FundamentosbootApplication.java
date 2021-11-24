package com.fundamentosboot.fundamentosboot;

import com.fundamentosboot.fundamentosboot.bean.MyBean;
import com.fundamentosboot.fundamentosboot.bean.MyBeanWithDependency;
import com.fundamentosboot.fundamentosboot.bean.MyOperationImplement;
import com.fundamentosboot.fundamentosboot.component.ComponentDependecy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosbootApplication implements CommandLineRunner {

	private ComponentDependecy componentDependecy;
	private MyBean myBean;

	private MyBeanWithDependency myBeanWithDependency;

	public FundamentosbootApplication(@Qualifier("componentTwoImplement") ComponentDependecy componentDependecy, MyBean myBean, MyBeanWithDependency myBeanWithDependency){
		this.componentDependecy = componentDependecy;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependecy.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
	}
}
