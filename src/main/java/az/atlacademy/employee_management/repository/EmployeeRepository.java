package az.atlacademy.employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.atlacademy.employee_management.model.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>
{
    
}
