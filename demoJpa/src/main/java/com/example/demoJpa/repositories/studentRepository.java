package com.example.demoJpa.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demoJpa.entities.student;

@Repository
public interface studentRepository extends CrudRepository <student, Integer>{
 @Query("select s from student as s")
 List<student> findAllStudent();
}
