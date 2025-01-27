package com.alticelabs.labseq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LabseqApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabseqApplication.class, args);
	}

}
