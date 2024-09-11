package com.example.ProductUsageH2.h2_demo;

import com.example.ProductUsageH2.h2_demo.model.Product1;
import com.example.ProductUsageH2.h2_demo.repository.ProductInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(H2DemoApplication.class, args);
		Object dataSource = context.getBean("dataSource");
		System.out.println(dataSource);

	}
		 
        @Bean
		CommandLineRunner commandLineRunner(ProductInterface productInterface ) {

		return args -> {
			productInterface.save(new Product1(null, "Apple IPodsPro", "iPods", "Apple"));
			productInterface.save(new Product1(null, "Redmi Note10 Pro", "NotePros", "Xiomie"));
		};



		}

	}


