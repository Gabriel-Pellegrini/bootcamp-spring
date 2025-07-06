package com.devsuperior.dscatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DscatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DscatalogApplication.class, args);

		new Thread(() -> System.out.println("Hello World")).run();

		input.add("banana");
		input.add("maca");
		System.out.println(getIntput(input));

	}
	private static ArrayList<String> input = new ArrayList<>();

	private static String getIntput(ArrayList<String> payload) {


		if (!payload.isEmpty()) {
			return payload.get(0);
		}

		return "vazio";
	}

}
