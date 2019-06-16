package io.waxc.demo.webstarter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class WebstarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebstarterApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World";
    }
}
