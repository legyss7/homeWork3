package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataWorkers {
    private List<WorkerBase> list;

    public DataWorkers(List<WorkerBase> list) {
        this();
        this.list = list;
    }

    public DataWorkers() {
        this.list = new ArrayList<>();
    }

    public void addWorker(WorkerBase worker) {
        list.add(worker);
    }

    public void removeWorker(WorkerBase workerBase) {
        list.remove(workerBase);
    }

    public void removeWorker(int index) {
        list.remove(index);
    }

    public String listPrint() {
        boolean flagHeader = true;
        StringBuilder str = new StringBuilder();
        for (WorkerBase workerBase : list) {
            str.append(workerBase.workPrint(flagHeader));
            str.append("\n");
            //отключить повторную печать заголовка
            if (flagHeader) flagHeader = false;
        }
        return str.toString();
    }

    public void sortComparator() {
        SalaryComparator salaryComparator = new SalaryComparator();
        list.sort(salaryComparator);
    }

    public void sortComparable() {
        Collections.sort(list);
    }

}
