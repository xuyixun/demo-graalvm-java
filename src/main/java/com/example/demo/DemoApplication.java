package com.example.demo;

import com.example.demo.dto.RegisterReflectionForBindingDto;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RegisterReflectionForBinding(RegisterReflectionForBindingDto.class)
@RestController
public class DemoApplication{
  public static void main(String[] args){
    SpringApplication.run(DemoApplication.class,
                          args);
  }

  @RequestMapping("/")
  String home(){
    return "Hello World!";
  }
}
