package com.example.demo;

import com.example.demo.domain.po.DemoPo;
import com.example.demo.domain.repository.DemoPoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner
implements CommandLineRunner{
  private final DemoPoRepository demoPoRepository;

  public Runner(DemoPoRepository demoPoRepository){this.demoPoRepository = demoPoRepository;}

  @Override
  public void run(String... args){
    this.demoPoRepository.save(new DemoPo());
  }
}
