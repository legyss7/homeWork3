package org.example;

import java.util.Comparator;

public class SalaryComparator implements Comparator<WorkerBase> {

    @Override
    public int compare(WorkerBase o1, WorkerBase o2) {
        return Double.compare(o1.getMonthlySalary(), o2.getMonthlySalary());
    }
}
