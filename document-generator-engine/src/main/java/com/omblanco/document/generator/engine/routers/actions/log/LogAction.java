package com.omblanco.document.generator.engine.routers.actions.log;

import java.time.Instant;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.omblanco.document.generator.engine.routers.actions.generic.AbstractAction;

/**
 * Acción de log
 * @author oscar.martinezblanco
 *
 */
@Component("logAction")
public class LogAction extends AbstractAction {

    private static final Logger LOG = LoggerFactory.getLogger(LogAction.class);

    @Override
    public void process(Exchange exchange) {
        LOG.info("Log action execution, Time: {}", Instant.now().toEpochMilli());
    }
    
}
