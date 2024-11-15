package az.atlacademy.employee_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import az.atlacademy.employee_management.model.entity.EmployeeEntity;
import az.atlacademy.employee_management.service.EmployeeService;

@Controller
public class EmployeeController 
{
    @Autowired
    private EmployeeService employeeService; 

    @GetMapping("/")
    public String viewHomePage(Model model) 
    {
        model.addAttribute("allemplist", employeeService.getAllEmployee());    
        return "index";
    }

    @GetMapping("/addnew")
    public String addNewEmployee(Model model) 
    {        
        EmployeeEntity employee = new EmployeeEntity();
        model.addAttribute("employee", employee);        
        return "newemployee";
    }

    @PostMapping("/save")    
    public String saveEmployee(@ModelAttribute("employee") EmployeeEntity employee) 
    {
        employeeService.save(employee);        
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")    
    public String updateForm(@PathVariable(value = "id") long id, Model model) 
    {
        EmployeeEntity employee = employeeService.getById(id);        
        model.addAttribute("employee", employee);
        return "update";    
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) 
    {
        employeeService.deleteViaId(id);
        return "redirect:/";
    }
}
