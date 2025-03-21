package com.project.brunojdsz.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class Application {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		builder.bannerMode(Banner.Mode.OFF);
//		builder.lazyInitialization(true);
		builder.run(args);

		ConfigurableApplicationContext applicationContext = builder.context();

		ExampleValue value = applicationContext.getBean(ExampleValue.class);
		value.print();

		AppProperties properties = applicationContext.getBean(AppProperties.class);

		System.out.println(properties.getValue1());

	}

}
