package com.example.demo6.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
  @Id// @Id 애너테이션을 사용하여 ID 필드를 지정
  @GeneratedValue(strategy = GenerationType.IDENTITY)// GeneratedValue 어노테이션 사용용하면 ID가 자동으로 생성
  private int id;
  private String name;
  private int age;
  private String email;
  private String address;
}
