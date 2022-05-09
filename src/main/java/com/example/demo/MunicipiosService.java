package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="https://servicodados.ibge.gov.br/api/v1/", name="municipios")
public interface MunicipiosService {
    @GetMapping("localidades/distritos")
    List<Distritos> getAll(); 
}
