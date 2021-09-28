package com.akshay.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*
 
 Before that create a repository in github and create a <your-file-name>.yml or <your-file-name>.properties 
 
 basically <your-file-name> must be client application name 
 
 we can create file names with profile names like 
 <your-file-name>-<profile-name>.yml eg: clientconfig-dev.yml
 
 After starting the application, access below url
 
 http://localhost:8888/<file-name>/<profile-name>
 http://localhost:8888/CONFIG_CLIENT/default
 
 */

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}

}
