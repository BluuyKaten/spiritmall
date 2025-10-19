package com.wj.spiritmall.spiritmall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpiritmallThirdPartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpiritmallThirdPartyApplication.class, args);
	}

}
