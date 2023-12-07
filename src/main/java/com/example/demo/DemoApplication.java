package com.example.demo;

import com.example.demo.dto.RegisterReflectionForBindingDto;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@RegisterReflectionForBinding(RegisterReflectionForBindingDto.class)
@SpringBootApplication
public class DemoApplication{
  public static void main(String[] args){
    System.getenv()
          .forEach((k,v)->System.out.printf("%s_%s%n",
                                            k,
                                            v));
    SpringApplication.run(DemoApplication.class,
                          args);
  }

  @RequestMapping("/")
  String home(){
    return "Hello World!";
  }
}
