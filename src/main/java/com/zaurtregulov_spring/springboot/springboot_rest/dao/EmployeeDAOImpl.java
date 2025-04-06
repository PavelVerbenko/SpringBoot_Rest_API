package com.zaurtregulov_spring.springboot.springboot_rest.dao;


import com.zaurtregulov_spring.springboot.springboot_rest.entity.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {

        Session session = entityManager.unwrap(Session.class);

        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

//    @Override
//    @Transactional
//    public void saveEmployee(Employee employee) {
//
//        Session session = sessionFactory.getCurrentSession();
//        session.saveOrUpdate(employee);
//    }
//
//    @Override
//    @Transactional
//    public Employee getEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//
//        Employee employee = session.get(Employee.class, id);
//        return employee;
//    }
//
//
//    @Override
//    @Transactional
//    public void deleteEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Query<Employee> query = session.createQuery("delete from Employee " + "where id =: employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();
//    }

}
