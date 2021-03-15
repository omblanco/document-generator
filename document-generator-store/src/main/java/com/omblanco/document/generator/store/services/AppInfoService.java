package com.omblanco.document.generator.store.services;

import com.omblanco.document.generator.store.services.bo.AppInfoBO;

import reactor.core.publisher.Mono;

public interface AppInfoService {

    /**
     * Recupera información de la aplicación
     * @return Información
     */
    Mono<AppInfoBO> getAppInfo();
}
