package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import org.springframework.test.context.junit4.SpringRunner;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.io.IOException;

import com.github.tomakehurst.wiremock.WireMockServer;
// import com.github.tomakehurst.wiremock.http.HttpStatus;
import com.github.tomakehurst.wiremock.client.WireMock;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AddrClientTest.FeignConfig.class)
@ActiveProfiles("test")
public class AddrClientTest {

    public static WireMockServer wireMockServer;

    @Mock
    AddrClient client;

    // @Autowired
    // private UsuarioClient deviceClient;

    @BeforeClass
    public static void setup(){
        // wireMockServer = new WireMockServer(8090);
        // wireMockServer.start();
        FixtureFactoryLoader.loadTemplates("br.com.fixture");

    }

    // @AfterClass
    // public static void finish(){
    //     wireMockServer.shutdown();
    // }

    @Test
    @DisplayName("Teste do feign")
    public void testGetOneCepById() {
        
        Address body = Fixture.from(Address.class).gimme("valid");
        // ResponseEntity<UsuarioClient> response = new ResponseEntity<>(body, HttpStatus.OK);
        when(this.client.buscaUm(anyString())).thenReturn(body);




    }

    // @Test
    // public void listDevicesTest() throws IOException {
    //     String body = "[{'name': 'Apple', 'model': 'Iphone 11' }, { 'name': 'Apple', 'model': 'Apple Watch' }]";        
    //     wireMockServer.stubFor(get(urlPathMatching("/devices"))
    //             .willReturn(WireMock.aResponse())
    //             .withStatus(200)
    //             .withHeader("ContentType",MediaType.APPLICATION_JSON_VALUE)
    //             .withBody(body);
    //     assertFalse(deviceClient.buscaTodos().isEmpty());
    // }

    @EnableFeignClients(clients = AddrClient.class)
    @Configuration
    @EnableAutoConfiguration
    static class FeignConfig{}
}
