package org.example;

public class Worker extends WorkerBase {
    private Worker(String name, String lastName, double salary) {
        super(name, lastName, salary);
    }
    public static Worker create(String name, String lastName, double salary){
        if (name == null || name.length() < 3){
            throw new RuntimeException("Некорректное имя работника.");
        }
        if (lastName == null || lastName.length() < 3){
            throw new RuntimeException("Некорректная фамилия работника.");
        }
        if (salary < 1000){
            throw new RuntimeException("Некорректная ежемесячная зарплата работника.");
        }
        return new Worker(name, lastName, salary);
    }
    @Override
    protected Double salaryOfMonth(double salary) {
        return salary;
    }
}
