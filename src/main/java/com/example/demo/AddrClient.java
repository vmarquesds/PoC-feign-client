package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://api.postmon.com.br/v1/", name = "usuario")
public interface AddrClient {

    @GetMapping("localidades/distritos")
    List<Address> buscaTodos();

    @GetMapping("cep/{id}")
    Address buscaUm(@PathVariable("id") String id);
}