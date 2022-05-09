package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements CommandLineRunner {

    private final AddrClient usuarioClient;
    private final MunicipiosService municipiosService;

    public Initializer(AddrClient usuarioClient, MunicipiosService municipiosService) {
        this.usuarioClient = usuarioClient;
        this.municipiosService = municipiosService;
    }

    @Override
    public void run(String... args) {
        Address usuario = this.usuarioClient.buscaUm("31270360");
        System.out.println("OOOOOOI" + usuario.toString());

        List<Distritos> distritos = this.municipiosService.getAll();
        System.out.println("OOOOOOI" + distritos.toString());

    }
}