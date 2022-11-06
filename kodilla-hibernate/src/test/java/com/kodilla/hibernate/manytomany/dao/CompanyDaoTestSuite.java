package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }
    @Test
    void testRetrieveEmployeesWithGivenLastname(){
        //Given
        Employee johnKowalski = new Employee("John", "Kowalski");
        Employee stevenSpielberg = new Employee("Steven", "Spielberg");
        Employee cezaryPazura = new Employee("Cezary", "Pazura");
        employeeDao.save(johnKowalski);
        employeeDao.save(stevenSpielberg);
        employeeDao.save(cezaryPazura);
        int johnKowalskiId = johnKowalski.getId();
        int stevenSpielbergId = stevenSpielberg.getId();
        int cezaryPazuraId = cezaryPazura.getId();

        //When
        List<Employee> result =  employeeDao.retrieveEmployeesWithGivenLastname("Spielberg");

        //Then
        assertEquals("Spielberg", result.get(0).getLastname());

        //CleanUp
        try {
            employeeDao.deleteById(johnKowalskiId);
            employeeDao.deleteById(stevenSpielbergId);
            employeeDao.deleteById(cezaryPazuraId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void testRetrieveCompaniesWithGivenPartName(){
        //Given
        Company carpFishing = new Company("Carp Fishing");
        Company developerJs = new Company("Developer JS");
        Company helpDesk = new Company("Help Desk");
        companyDao.save(carpFishing);
        companyDao.save(developerJs);
        companyDao.save(helpDesk);
        int carpFishingId = carpFishing.getId();
        int developerJsId = developerJs.getId();
        int helpDeskId = helpDesk.getId();

        //When
        List<Company> result = companyDao.retrieveCompaniesWithGivenPartName("Hel");

        //Then
        assertEquals("Help Desk", result.get(0).getName());

        //CleanUp
        try {
            companyDao.deleteById(carpFishingId);
            companyDao.deleteById(developerJsId);
            companyDao.deleteById(helpDeskId);
        } catch (Exception e) {
            //do nothing
        }
    }
}