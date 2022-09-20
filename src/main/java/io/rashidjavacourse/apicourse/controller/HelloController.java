// package io.rashidjavacourse.hello;
package io.rashidjavacourse.apicourse.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController{

    @GetMapping("/hello")
        public String sayHi(){
            return "Hi";
        }
}