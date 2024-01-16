package com.aleman.aleman;

import com.aleman.aleman.model.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class AlemanApplication {

	public static void main(String[] args) {

		SpringApplication.run(AlemanApplication.class, args);
	}

	/**
	 *
	 * @param context
	 * @return CommandLineRunner all parameters
	 */
	@Bean
	public CommandLineRunner getBeans(ApplicationContext context) {
		return args -> {
			String[] beans = context.getBeanDefinitionNames();
			//System.out.println("Springboot beans :");
			Arrays.sort(beans);
			for(String bean : beans) {
				//System.out.println(bean);
				//Do nothing
			}
		};
	}

}
