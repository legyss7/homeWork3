package org.example;

public class Program {
    public static void main(String[] args) {

        Worker worker = Worker.create(
                "Oleg", "LastOleg", 5000);
        Freelancer freelancer1 = Freelancer.create(
                "Maks", "LastMaks", 18);
        Freelancer freelancer2 = Freelancer.create(
                "Denis", "LastDenis", 55);
        Freelancer freelancer3 = Freelancer.create(
                "Igor", "LastIgor", 15);


        DataWorkers dataWorkers = new DataWorkers();
        dataWorkers.addWorker(worker);
        dataWorkers.addWorker(freelancer1);
        dataWorkers.addWorker(freelancer2);
        dataWorkers.addWorker(freelancer3);
        System.out.println(dataWorkers.listPrint());

        //Вариант 1. сортировка Comparator
//        dataWorkers.sortComparator();
//        System.out.println(dataWorkers.listPrint());

        //Вариант 2. сортировка Comparable
        dataWorkers.sortComparable();
        System.out.println(dataWorkers.listPrint());

        dataWorkers.removeWorker(0);
        System.out.println(dataWorkers.listPrint());

        dataWorkers.removeWorker(freelancer3);
        System.out.println(dataWorkers.listPrint());
    }
}