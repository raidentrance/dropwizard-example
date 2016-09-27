/**
 * 
 */
package com.raidentrance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.raidentrance.config.DropwizardConfiguration;
import com.raidentrance.rest.UserResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * @author raidentrance
 *
 */
public class DropwizardApplication extends Application<DropwizardConfiguration> {

	private static final Logger LOG = LoggerFactory.getLogger(DropwizardApplication.class);

	@Override
	public void run(DropwizardConfiguration configuration, Environment environment) throws Exception {
		LOG.info("Starting app {}", configuration.getAppName());
		LOG.info("Registering resources");
		final UserResource resource = new UserResource();
		environment.jersey().register(resource);
		LOG.info("Resources registered");
	}

	public static void main(String[] args) throws Exception {
		new DropwizardApplication().run(args);
	}
}
