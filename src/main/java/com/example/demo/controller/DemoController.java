package com.example.demo.controller;

import com.example.demo.dto.ModelAttributeDto;
import com.example.demo.dto.RegisterReflectionForBindingDto;
import com.example.demo.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController{
  @GetMapping("/")
  public String demo(TestDto dto){
    System.out.println(dto.getName());
    return "success";
  }

  @GetMapping("/model_attribute")
  public String modelAttribute(
  @ModelAttribute ModelAttributeDto dto){
    System.out.println(dto.getName());
    return "success";
  }

  @GetMapping("/register_reflection_for_binding")
  public String registerReflectionForBinding(RegisterReflectionForBindingDto dto){
    System.out.println(dto.getName());
    return "success";
  }
}
