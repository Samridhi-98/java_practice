package com.example.demo.com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
      return args -> {
          Student maria = new Student("Maria","maria307@gmail.com", LocalDate.of(2001, Month.AUGUST,24));
          Student alex = new Student("Alex","alex30@gmail.com", LocalDate.of(1995, Month.AUGUST,5));
          Student aley = new Student("Aley","aley567@gmail.com", LocalDate.of(1967, Month.DECEMBER,25));
          Student mary = new Student("Mary","mary78@gmail.com", LocalDate.of(1999, Month.JULY,15));
          Student alexa = new Student("Alex","alex30@gmail.com", LocalDate.of(1985, Month.AUGUST,5));
          repository.saveAll(List.of(maria,alex,aley,mary,alexa));
      };
    };
}
