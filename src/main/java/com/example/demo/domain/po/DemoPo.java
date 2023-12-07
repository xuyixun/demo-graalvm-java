package com.example.demo.domain.po;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity(name="demo")
public class DemoPo{
  @Id
  @GeneratedValue(strategy=GenerationType.UUID)
  private String uuid;
  @CreationTimestamp private LocalDateTime createAt;
}
