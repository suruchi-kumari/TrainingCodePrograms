package com.moicro.phase2.currencyexchange.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import brave.sampler.Sampler;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class CurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}

	public Sampler samples() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
