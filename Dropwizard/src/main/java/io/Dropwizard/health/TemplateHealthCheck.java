package io.Dropwizard.health;

import com.codahale.metrics.health.HealthCheck.Result;
import com.codahale.metrics.health.HealthCheckRegistry;

public class TemplateHealthCheck extends HealthCheckRegistry{
	
	private final String template;

    public TemplateHealthCheck(String template) {
        this.template = template;
    }

    protected Result check() throws Exception {
        final String saying = String.format(template, "TEST");
        if (!saying.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }

}
