package com.example.demo.domain.repository;

import com.example.demo.domain.po.DemoPo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoPoRepository
extends JpaRepository<DemoPo,String>{}
