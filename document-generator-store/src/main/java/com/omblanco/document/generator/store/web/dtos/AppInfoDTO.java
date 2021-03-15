package com.omblanco.document.generator.store.web.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AppInfoDTO {
    
    private String environment;
    
    private String version;
    
    private String name;
    
    private Date now;
}
