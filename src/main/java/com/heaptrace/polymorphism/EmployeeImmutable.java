package com.heaptrace.polymorphism;

public final class EmployeeImmutable {
    private final Integer employeeId;
    private final String employeeName;
    private final String email;
    private final Double salary;


    public EmployeeImmutable(Integer employeeId, String employeeName, String email, Double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.salary = salary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmail() {
        return email;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        EmployeeImmutable employee = new EmployeeImmutable(101, "Sachin","sachin@gmail.com",10000.0);
        System.err.println(employee);
    }
}
