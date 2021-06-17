package tech.getArray.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getArray.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
