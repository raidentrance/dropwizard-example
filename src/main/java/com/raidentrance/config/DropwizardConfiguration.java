/**
 * 
 */
package com.raidentrance.config;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

/**
 * @author raidentrance
 *
 */
public class DropwizardConfiguration extends Configuration {
	@NotEmpty
	private String appName;

	@JsonProperty
	public String getAppName() {
		return appName;
	}

	@JsonProperty
	public void setAppName(String appName) {
		this.appName = appName;
	}

}
