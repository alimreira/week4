package com.weekOne.demoWeekOneToFour.Repository;

import com.weekOne.demoWeekOneToFour.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
