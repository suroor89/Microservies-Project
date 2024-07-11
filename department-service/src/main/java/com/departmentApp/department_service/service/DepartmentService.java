package com.departmentApp.department_service.service;

import com.departmentApp.department_service.entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}