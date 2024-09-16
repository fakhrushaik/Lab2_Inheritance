import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        Worker worker1 = new Worker("John", "Doe", "W01", "Mr.", 1985, 20.0);
        Worker worker2 = new Worker("Jane", "Smith", "W02", "Ms.", 1990, 25.0);
        Worker worker3 = new Worker("Mike", "Johnson", "W03", "Mr.", 1978, 30.0);

        SalaryWorker salaryWorker1 = new SalaryWorker("Sarah", "Lee", "S01", "Mrs.", 1982, 52000.0);
        SalaryWorker salaryWorker2 = new SalaryWorker("Emily", "Clark", "S02", "Ms.", 1975, 60000.0);
        SalaryWorker salaryWorker3 = new SalaryWorker("James", "Brown", "S03", "Mr.", 1980, 75000.0);

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        double[] hoursWorked = {40, 50, 40};

        for (int week = 0; week < 3; week++) {
            System.out.println("Week " + (week + 1) + " Pay Summary:");
            System.out.println("-----------------------------------------------------");
            for (Worker worker : workers) {
                System.out.print(worker.getFirstName() + " " + worker.getLastName() + ": ");
                worker.displayWeeklyPay(hoursWorked[week]);
            }
            System.out.println();
        }
    }
}
