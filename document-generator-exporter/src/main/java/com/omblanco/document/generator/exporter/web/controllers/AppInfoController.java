package com.omblanco.document.generator.exporter.web.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omblanco.document.generator.exporter.services.AppInfoService;
import com.omblanco.document.generator.exporter.services.bo.AppInfoBO;
import com.omblanco.document.generator.exporter.utils.ExporterQualifiersConstants;
import com.omblanco.document.generator.exporter.utils.ExporterWebConstants;
import com.omblanco.document.generator.exporter.web.dtos.AppInfoDTO;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController(ExporterQualifiersConstants.Controller.APP_INFO_CONTROLLER)
@RequestMapping(ExporterWebConstants.Paths.SYSTEM)
public class AppInfoController {

    
    private AppInfoService appInfoService;
    
    protected ModelMapper modelMapper;
    
    /**
     * Recupera el estado de la aplicación
     * @return
     */
    @GetMapping(ExporterWebConstants.Paths.AppInfo.GET)
    public Mono<ResponseEntity<AppInfoDTO>> getAppInfo() {
        return appInfoService.getAppInfo()
                .map(this :: convertBoToDto)
                .map(dto -> ResponseEntity.ok().contentType(APPLICATION_JSON).body(dto))
                            .defaultIfEmpty(ResponseEntity.notFound().build());
    }
    
    private AppInfoDTO convertBoToDto(AppInfoBO bo) {
        return modelMapper.map(bo, AppInfoDTO.class);
    }
}
