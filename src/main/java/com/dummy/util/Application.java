/**
 * 
 */
package com.dummy.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author arydewo
 *
 */
@SpringBootApplication
@Configuration
@EnableWebMvc
@ComponentScan(basePackages ="com.dummy")
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long lStart = System.currentTimeMillis();
		System.out.println("-----------------------------------------");
		System.out.println("com.dummy.api.Application is starting");
		SpringApplication.run(Application.class);
		System.out.println("com.dummy.api.Application is started");
		System.out.println("-----------------------------------------");
		long lEnd = System.currentTimeMillis();
		long lDiff = lEnd-lStart;
		System.out.println("v0.1|"+lDiff);
		System.out.println("-----------------------------------------");
		System.out.println("java.version="+System.getProperty("java.version"));
		System.out.println("java.version.date="+System.getProperty("java.version.date"));
		System.out.println("java.vendor="+System.getProperty("java.vendor"));
		System.out.println("java.vm.name="+System.getProperty("java.vm.name"));
		System.out.println("java.vm.version="+System.getProperty("java.vm.version"));
		System.out.println("java.vm.info="+System.getProperty("java.vm.info"));
		System.out.println("java.runtime.name="+System.getProperty("java.runtime.name"));
		System.out.println("java.runtime.version="+System.getProperty("java.runtime.version"));
		System.out.println("java.class.version="+System.getProperty("java.class.version"));
		
		
		
	}

}
