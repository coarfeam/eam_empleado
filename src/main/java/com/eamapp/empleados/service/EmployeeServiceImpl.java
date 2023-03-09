package com.eamapp.empleados.service;

import com.eamapp.empleados.entity.Employee;
import com.eamapp.empleados.entity.Office;
import com.eamapp.empleados.repositories.EmployeeRepository;
import com.eamapp.empleados.repositories.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository repositorioEmployee;
    @Autowired
    private OfficeRepository repositorioOffice;
    @Override
    public List<Employee> listarTodoLosEmpleados() {
        return repositorioEmployee.findAll();
    }

    @Override
    public Employee guardarEmpleado(Employee empleado) {
        return repositorioEmployee.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Long id) {
        repositorioEmployee.deleteById(id);
    }

    @Override
    public Employee obtenerEmpleadoPorId(Long id) {
        return repositorioEmployee.findById(id).get();
    }

    @Override
    public Employee actualizarEmpleado(Employee empleado) {
        return repositorioEmployee.save(empleado);
    }

    @Override
    public List<Office> listarOficinas() {
        return repositorioOffice.findAll();
    }

    @Override
    public List<Employee> getEmployeeOffice(Long idOffice) {
        Office oficina = repositorioOffice.findById(idOffice).orElse(null);
        if (oficina != null){
            return listarTodoLosEmpleados();
        }
        return Collections.emptyList();
    }
}
