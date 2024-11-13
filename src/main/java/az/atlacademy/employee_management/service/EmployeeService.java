package az.atlacademy.employee_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.atlacademy.employee_management.model.entity.EmployeeEntity;
import az.atlacademy.employee_management.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
    @Autowired
    private EmployeeRepository empRepo;
    
    public List<EmployeeEntity> getAllEmployee() 
    {
        return empRepo.findAll();    
    }

    public void save(EmployeeEntity employee) 
    {        
        empRepo.save(employee);
    }

    public EmployeeEntity getById(Long id) 
    {
        Optional<EmployeeEntity> optional = empRepo.findById(id);        
        EmployeeEntity employee = null;

        if (optional.isPresent())            
            employee = optional.get();
        else            
            throw new RuntimeException(
                "Employee not found for id : " + id
            );        
        
        return employee;
    }
        
    public void deleteViaId(long id) 
    {
        empRepo.deleteById(id);    
    }
}
