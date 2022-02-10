package com.akshay.cloud.client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("app")
@RefreshScope
public class ConfigClientPropertiesConfig {
	
//	https://github.com/akshay-0402/ConfigRepo.git

	private String message;
	private String key;
	private SubApp subApp;
	
	public static class SubApp {
		private String subMessage;
		private String subKey;
		private String subTotalMessage;

		public String getSubMessage() {
			return subMessage;
		}
		public void setSubMessage(String subMessage) {
			this.subMessage = subMessage;
		}
		public String getSubKey() {
			return subKey;
		}
		public void setSubKey(String subKey) {
			this.subKey = subKey;
		}
		public String getSubTotalMessage() {
			return subTotalMessage;
		}
		public void setSubTotalMessage(String subTotalMessage) {
			this.subTotalMessage = subTotalMessage;
		}
		@Override
		public String toString() {
			return "SubApp [subMessage=" + subMessage + ", subKey=" + subKey + ", subTotalMessage=" + subTotalMessage
					+ "]";
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	/*@Override
	public String toString() {
		return "ConfigClientPropertiesConfig [message=" + message + ", key=" + key + "]";
	}*/


	public SubApp getSubApp() {
		return subApp;
	}

	public void setSubApp(SubApp subApp) {
		this.subApp = subApp;
	}

	public String toString() {
		return "ConfigClientPropertiesConfig [message=" + message + ", key=" + key + ", subApp=" + subApp + "]";
	}
}
