package com.example.ShowHello;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from bridgelabz";
    }
    @GetMapping("/hello/query")
    public String greetUser(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @GetMapping("hello/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

}
