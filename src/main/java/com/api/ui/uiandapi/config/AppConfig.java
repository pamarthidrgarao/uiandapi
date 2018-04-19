package com.api.ui.uiandapi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;

@Configuration
@SpringBootApplication
@ComponentScan(basePackages = { "com.api.ui" })
@EntityScan(basePackages = { "com.api.ui" })
@EnableJpaRepositories("com.api.ui")
public class AppConfig {
	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}

	@Bean
	public EmbeddedServletContainerCustomizer singlePageAppRouting() {
		return new EmbeddedServletContainerCustomizer() {
			public void customize(ConfigurableEmbeddedServletContainer container) {
				container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/"));
			}
		};
	}
}
