package com.example.dubboconsumer.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Student implements Serializable {

    private Long id;

    private String name;

    private Integer age;
}
