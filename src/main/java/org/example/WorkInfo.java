package org.example;

public interface WorkInfo {
    int getId();
    String getName();
    String getLastName();
    double getMonthlySalary();

    default String workPrint(boolean header) {
        String str = header ? "id | Имя | Фамилия | Зарплата за месяц\n" : "";
        str += String.format("%d | %s | %s | %f",
                getId(), getName(), getLastName(), getMonthlySalary());
        return str;
    }
}
