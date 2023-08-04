package StudentMs.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import StudentMs.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
