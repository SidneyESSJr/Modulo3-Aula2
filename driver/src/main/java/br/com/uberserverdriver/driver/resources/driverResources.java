package br.com.uberserverdriver.driver.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/drivers")
public class driverResources {
    

    @GetMapping
    public String getDriver() {
        return "Chegamos aqui";
    }
}
