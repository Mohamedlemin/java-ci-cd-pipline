package com.msservice.cicdtest;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestClient;
import org.xhtmlrenderer.pdf.ITextRenderer;

@SpringBootApplication
@AllArgsConstructor
@EnableScheduling
@EnableCaching
public class CiCdTestApplication {
	@Bean
	public RestClient restClient(){
		return RestClient.create();
	}

	@Bean
	public ITextRenderer iTextRenderer(){
		return new ITextRenderer();
	}

	public static void main(String[] args) {
		SpringApplication.run(CiCdTestApplication.class, args);
	}

}
