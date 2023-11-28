package org.example;


public abstract class WorkerBase  implements WorkInfo, Comparable<WorkerBase> {
    protected static int id = 0;
    protected int idWork;
    protected String name;
    protected String lastName;
    protected double averageMonthlySalary;

    public int getId() {
        return idWork;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return averageMonthlySalary;
    }

    protected WorkerBase(String name, String lastName, double salary) {
        WorkerBase.id++;
        idWork = WorkerBase.id;
        this.name = name;
        this.lastName = lastName;
        this.averageMonthlySalary = salaryOfMonth(salary);
    }

    protected abstract Double salaryOfMonth(double salary);

    @Override
    public int compareTo(WorkerBase o) {
        return Double.compare(getMonthlySalary(), o.getMonthlySalary());
    }
}
