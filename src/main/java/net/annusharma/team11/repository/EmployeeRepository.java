package net.annusharma.team11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.annusharma.team11.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
