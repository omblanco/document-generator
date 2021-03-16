package com.omblanco.document.generator.engine.routers;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.RouteDefinition;
import org.springframework.stereotype.Component;

@Component
public class EngineRouteBuilder extends RouteBuilder {

    private static final String QUARTZ_PATERN = "quartz://%sTimer?cron=%s";

    private static final String SPACE_TOKEN = " ";
    private static final String PLUS_TOKEN = "+";
    
    private static final String LOG_INPUT = "log:input";
    private static final String LOG_OUTPUT = "log:output";
    
    @Override
    public void configure() throws Exception {
        
        final RouteDefinition routeDefinition = from(String.format(QUARTZ_PATERN, "foo",
                "0/1 0/1 * 1/1 * ? *".replace(SPACE_TOKEN, PLUS_TOKEN)));
        
        routeDefinition.to(LOG_INPUT);
        
        routeDefinition.bean("logAction");
        
        routeDefinition.to(LOG_OUTPUT);
    }

}
