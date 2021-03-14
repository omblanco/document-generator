package com.omblanco.document.generator.exporter.services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.omblanco.document.generator.exporter.services.AppInfoService;
import com.omblanco.document.generator.exporter.services.bo.AppInfoBO;
import com.omblanco.document.generator.exporter.utils.ExporterQualifiersConstants;

import reactor.core.publisher.Mono;

@Service(ExporterQualifiersConstants.Service.APP_INFO_SERVICE)
public class AppInfoServiceImpl implements AppInfoService {

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.environment}")
    private String environment;

    @Value("${app.name}")
    private String name;

    @Override
    public Mono<AppInfoBO> getAppInfo() {
        return Mono.just(AppInfoBO.builder()
                .environment(environment).name(name)
                .version(appVersion).now(new Date()).build());
    }

}
