package com.ram.enableScheduling;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
@Configuration
@EnableScheduling
public class AppConfig {
	@Bean
	public Task task() {
		return new Task();
	}
}