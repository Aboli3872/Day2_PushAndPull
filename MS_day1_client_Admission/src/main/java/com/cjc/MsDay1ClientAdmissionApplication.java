package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsDay1ClientAdmissionApplication {

	public static void main(String[] args) 
	{
		System.out.println("This is ms client admisssion");
		System.out.println("This is Admission Client");
		SpringApplication.run(MsDay1ClientAdmissionApplication.class, args);
	}

}
