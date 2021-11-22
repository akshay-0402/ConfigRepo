package com.akshay.cloud.client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "another-app")
@RefreshScope
public class AnotherConfiguration {
	
	private String anotherAppmessage;
	private String anotherAppKey;
	
	public String getAnotherAppmessage() {
		return anotherAppmessage;
	}
	public void setAnotherAppmessage(String anotherAppmessage) {
		this.anotherAppmessage = anotherAppmessage;
	}
	public String getAnotherAppKey() {
		return anotherAppKey;
	}
	public void setAnotherAppKey(String anotherAppKey) {
		this.anotherAppKey = anotherAppKey;
	}
	@Override
	public String toString() {
		return "AnotherConfiguration [anotherAppmessage=" + anotherAppmessage + ", anotherAppKey=" + anotherAppKey
				+ "]";
	}

}
