package com.sboot.demo.sbootexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sboot.demo.sbootexample.entity.Employee;
import com.sboot.demo.sbootexample.service.empServiceImpl;

@Controller
public class empController {
    
    @Autowired
    private empServiceImpl service;

    @GetMapping("/")
    public String viewHomePage(Model model){
        List<Employee> listEmployees = service.listAllEmployees();
        model.addAttribute("listEmployees", listEmployees);
        System.out.println("Get /");
        return "Home";
    }

    @GetMapping("/new")
    public String add(Model model){
        model.addAttribute("employee", new Employee());
        return "New";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee emp){
            service.save(emp);
            return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditEmployeePage(@PathVariable(value = "id") int id){
        ModelAndView mav = new ModelAndView("Custom");
        Employee emp = service.getEmployee(id);
        mav.addObject("employee", emp);
        return mav;
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable(value = "id") int id){
        service.delete(id);
        return "redirect:/";
    }
}
