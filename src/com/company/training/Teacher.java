package com.company.training;

public class Teacher {

    private Integer id;
    private String name;
    private Integer salary;
    private Integer salaryEarned;

    public Teacher() {}

    public Teacher(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=0;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", salaryEarned=" + salaryEarned +
                '}';
    }

    public Integer getSalaryEarned() {
        return salaryEarned;
    }

    public void setSalaryEarned(Integer salaryEarned) {
        this.salaryEarned = salaryEarned;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void receiveSalary(Integer salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salaryEarned);
    }
}
