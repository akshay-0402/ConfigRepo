package com.akshay.cloud.client.controller;

/*
For this we need to add spring-boot-starter-web dependency otherwise server will start and stop 

we also need to add spring-boot-starter-actuator in order to reload configuration properties 

So if we update configuration properties (i.e in git repo) those changes will not be reflected immediately in spring config client server, 

so we need to hit the below request 

POST : http:<host>:<port>/actuator/refresh
	eg : http://localhost:8088/actuator/refresh with empty body

Then configuration properties will be reloaded and reflected.

 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.cloud.client.config.AnotherConfiguration;
import com.akshay.cloud.client.config.ConfigClientPropertiesConfig;
import com.akshay.cloud.client.config.ConfigClientPropertiesConfig.SubApp;

@RestController
public class ConfigClientController {
	
	@Autowired
	ConfigClientPropertiesConfig propertiesConfig;
	
	@Autowired
	AnotherConfiguration anotherConfig;
	
	@GetMapping("/getMessage")
	public String getValue() {
		System.out.println(propertiesConfig.getSubApp().toString());
		SubApp subApp = propertiesConfig.getSubApp();
		
		StringBuilder builder = new StringBuilder();
		builder.append(propertiesConfig.getKey());
		builder.append("_______");
		builder.append(propertiesConfig.getMessage());
		builder.append("_______");
		builder.append(subApp.getSubKey());
		builder.append("_______");
		builder.append(subApp.getSubMessage());
		builder.append("_______");
		builder.append(subApp.getSubTotalMessage());
		builder.append("________");
		builder.append(anotherConfig.getAnotherAppKey());
		builder.append("_______");
		builder.append(anotherConfig.getAnotherAppmessage());
		return builder.toString();
	}
}
