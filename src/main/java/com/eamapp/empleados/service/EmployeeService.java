package com.eamapp.empleados.service;

import com.eamapp.empleados.entity.Employee;
import com.eamapp.empleados.entity.Office;

import java.util.List;

public interface EmployeeService {
    public List<Employee> listarTodoLosEmpleados();
    public Employee guardarEmpleado(Employee empleado);
    public void eliminarEmpleado(Long id);
    public Employee obtenerEmpleadoPorId(Long id);
    public Employee actualizarEmpleado(Employee empleado);
    public List<Office> listarOficinas();
    public List<Employee> getEmployeeOffice(Long idOffice);
}
