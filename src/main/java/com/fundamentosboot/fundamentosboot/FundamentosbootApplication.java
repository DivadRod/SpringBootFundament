package com.fundamentosboot.fundamentosboot;

import com.fundamentosboot.fundamentosboot.component.ComponentDependecy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosbootApplication implements CommandLineRunner {

	private ComponentDependecy componentDependecy;


	public FundamentosbootApplication(@Qualifier("componentTwoImplement") ComponentDependecy componentDependecy){
		this.componentDependecy = componentDependecy;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependecy.saludar();
	}
}
