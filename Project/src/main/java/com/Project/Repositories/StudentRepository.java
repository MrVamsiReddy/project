package com.Project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.Entity.student;

public interface StudentRepository extends JpaRepository<student, Long> {

}