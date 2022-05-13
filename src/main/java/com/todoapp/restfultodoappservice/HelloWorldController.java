package com.todoapp.restfultodoappservice;

//Controller
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HelloWorldController {

    @GetMapping (path ="/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    //hello-world-bean
    @GetMapping (path ="/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World Bean");
    }

    //
    @GetMapping (path ="/hello-world/path-var/{name}")
    public HelloWorldBean HelloWorldPathVariable(@PathVariable String name) {
       //throw new RuntimeException("Something Went Wrong");
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }



}
