package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FacadeServiceTestSuite {

    @Autowired
    private FacadeService facadeService;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;


    @Test
    public void findCompanyByPartOfTheNameTest() {
        //Given
        Company btc = new Company("BTC");
        Company cardano = new Company("Cardano");
        Company eth = new Company("ETH");
        Company xmr = new Company("XMR");
        Company algo = new Company("Algo");
        companyDao.save(btc);
        companyDao.save(cardano);
        companyDao.save(eth);
        companyDao.save(xmr);
        companyDao.save(algo);
        //When
        List<Company> facadeResult = facadeService.findCompanyByPartOfTheName("ano");
        //Then
        Assertions.assertEquals(1, facadeResult.size());
        //CleanUp
        companyDao.delete(btc);
        companyDao.delete(cardano);
        companyDao.delete(eth);
        companyDao.delete(xmr);
        companyDao.delete(algo);
    }

    @Test
    public void findEmployeeByPartOfTheLastnameTest() {
        //Given
        Employee kowalski = new Employee("Janusz" , "Kowalski");
        Employee urban = new Employee("Andrzej" , "Urban");
        Employee jackowski = new Employee("Wróżka" , "Jackowski");
        Employee rivi = new Employee("Geralt" , "Rivi");
        Employee johny = new Employee("Johony" , "Johan");
        employeeDao.save(kowalski);
        employeeDao.save(urban);
        employeeDao.save(jackowski);
        employeeDao.save(rivi);
        employeeDao.save(johny);
        //When
        List<Employee> facadeResult = facadeService.findEmployeeByPartOfTheLastname("an");
        //Then
        Assertions.assertEquals(1, facadeResult.size());
        //CleanUp
        employeeDao.delete(kowalski);
        employeeDao.delete(urban);
        employeeDao.delete(jackowski);
        employeeDao.delete(rivi);
        employeeDao.delete(johny);
    }
}