package com.lld.ufc;

import com.lld.ufc.driver.UFCDriver;
import com.lld.ufc.producer.UFCProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UfcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UfcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UFCDriver.run();
	}
}
