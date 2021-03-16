package com.omblanco.document.generator.engine.routers.actions.log;

import java.time.Instant;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("logAction")
public class LogAction {

    private static final Logger LOG = LoggerFactory.getLogger(LogAction.class);
    
    public void process(final Exchange exchange) {
        LOG.info("Log action execution, Time: {}", Instant.now().toEpochMilli());
    }
}
