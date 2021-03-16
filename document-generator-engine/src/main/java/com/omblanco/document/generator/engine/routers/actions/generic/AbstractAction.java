package com.omblanco.document.generator.engine.routers.actions.generic;

import org.apache.camel.Exchange;

/**
 * Clase genérica para todas las acciones
 * @author oscar.martinezblanco
 *
 */
public abstract class AbstractAction {
    
    /**
     * Método que permite implementar la lógica propia de cada acción
     * @param exchange
     */
    protected abstract void process(final Exchange exchange);
}
