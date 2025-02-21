package com.example.ShowHello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from bridgelabz";
    }
    @GetMapping("/hello/query")
    public String greetUser(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    // Path Variable Example: /hello/param/Mark
    @GetMapping("hello/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

}
