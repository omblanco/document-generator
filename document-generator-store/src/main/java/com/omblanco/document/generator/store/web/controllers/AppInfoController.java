package com.omblanco.document.generator.store.web.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omblanco.document.generator.store.services.AppInfoService;
import com.omblanco.document.generator.store.services.bo.AppInfoBO;
import com.omblanco.document.generator.store.utils.StoreQualifiersConstants;
import com.omblanco.document.generator.store.utils.StoreWebConstants;
import com.omblanco.document.generator.store.web.dtos.AppInfoDTO;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController(StoreQualifiersConstants.Controller.APP_INFO_CONTROLLER)
@RequestMapping(StoreWebConstants.Paths.SYSTEM)
public class AppInfoController {

    
    private AppInfoService appInfoService;
    
    protected ModelMapper modelMapper;
    
    /**
     * Recupera el estado de la aplicación
     * @return
     */
    @GetMapping(StoreWebConstants.Paths.AppInfo.GET)
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
