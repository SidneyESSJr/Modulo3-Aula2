package br.com.uberserverdriver.driver.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/travels")
public class travelResources {

    @GetMapping
    public String travel() {
        return "Chegamos em travels";
    }
}
