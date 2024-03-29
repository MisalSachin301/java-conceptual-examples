package com.heaptrace.employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManagementTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //Query 3.1 : How many male and female employees are there in the organization?
        Map<String,Long> noOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//        System.out.println(noOfMaleAndFemaleEmployees);

        //Query 3.2 : Print the name of all departments in the organization?
//        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //Query 3.3 : What is the average age of male and female employees?
        Map<String, Double> avgAgeOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
     //   System.out.println(avgAgeOfMaleAndFemaleEmployees);

        //Query 3.4 : Get the details of highest paid employee in the organization?
//        Employee employee = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        Employee employee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
//        System.out.println(employee);

        //Query 3.5 : Get the names of all employees who have joined after 2015?
//        employeeList.stream().filter(employee1 -> employee1.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

        //Query 3.6 : Count the number of employees in each department?
        Map<String, Long> employeeCountByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Set<Map.Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
        for (Map.Entry<String, Long> entry : entrySet)
        {
//            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
//        System.out.println(employeeCountByDepartment);

        //Query 3.7 : What is the average salary of each department?
        Map<String, Double> avgSalaryOfDepartments = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(avgSalaryOfDepartments);

        //Query 3.8 : Get the details of youngest male employee in the product development department?
        Employee youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream().filter(emp -> emp.getGender().equals("Male") && emp.getDepartment().equals("Product Development"))
                .min(Comparator.comparingInt(Employee::getAge)).get();
//        System.out.println(youngestMaleEmployeeInProductDevelopmentWrapper);

        //Who has the most working experience in the organization?
//        Employee seniorMostEmployeeWrapper = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get();
        Optional<Employee> seniorMostEmployeeWrapper=
                employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
//        System.out.println(seniorMostEmployeeWrapper);

        //Query 3.10 : How many male and female employees are there in the sales and marketing team?
        Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = employeeList.stream().filter(emp -> emp.getDepartment().equals("Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//        System.out.println(countMaleFemaleEmployeesInSalesMarketing);

        //Query 3.11 : What is the average salary of male and female employees?
        Map<String, Double> avgSalaryOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(avgSalaryOfMaleAndFemaleEmployees);

        //Query 3.12 : List down the names of all employees in each department?
        Map<String, List<Employee>> employeeListByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entrySet2 = employeeListByDepartment.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entrySet2){
//            System.out.println("--------------------------------------");
//
//            System.out.println("Employees In "+entry.getKey() + " : ");
//
//            System.out.println("--------------------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
//                System.out.println(e.getName());
            }
        }

        //Query 3.13 : What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println("Average salary: "+employeeSalaryStatistics.getAverage());
//        System.out.println("Total salary: "+employeeSalaryStatistics.getSum());

        //Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<Employee>> partitionEmployeesByAge = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));
        Set<Map.Entry<Boolean, List<Employee>>> entrySet3 = partitionEmployeesByAge.entrySet();
        for (Map.Entry<Boolean, List<Employee>> entry : entrySet3)
        {
//            System.out.println("----------------------------");

            if (entry.getKey())
            {
//                System.out.println("Employees older than 25 years :");
            }
            else
            {
//                System.out.println("Employees younger than or equal to 25 years :");
            }

//            System.out.println("----------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
//                System.out.println(e.getName());
            }
        }

        //Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Employee employee1 = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
//        System.out.println(employee1.getName());
//        System.out.println(employee1.getAge());
//        System.out.println(employee1.getDepartment());

        //Query 3.16 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Employee employee2 = employeeList.stream().min(Comparator.comparingInt(Employee::getAge)).get();
//        System.out.println(employee2.getName());
//        System.out.println(employee2.getAge());
//        System.out.println(employee2.getDepartment());

        //Query 3.17 : find the second largest salary of employee?
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).limit(1).toList().forEach(System.out::println);
    }
}
