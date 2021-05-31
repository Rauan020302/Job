package com.company.training;

public class Student {
    private Integer id;
    private String name;
    private Integer grade;
    private Integer feesPaid;
    private Integer feesTotal;

    public Student() {}

    public Student(Integer id, String name, Integer grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }

    public Integer getFeesPaid() {
        return feesPaid;
    }

    public void payFeesPaid(Integer fees) {
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }



    public Integer getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(Integer feesTotal) {
        this.feesTotal = feesTotal;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getRemainingFees(){
        return feesTotal-feesPaid;
    }

    public void setFeesPaid(Integer feesPaid) {
        this.feesPaid = feesPaid;
    }
}
