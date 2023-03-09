package com.eamapp.empleados.controller;

import com.eamapp.empleados.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleados")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String listarEstudiantes(Model modelo){
        modelo.addAttribute("estudiantes", service.listarTodoLosEmpleados());
        return "estudiantes";
    }
}
