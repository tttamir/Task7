import Task2.Figure;
import Task2.Triangle;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker();
        Director director = new Director();
        Accountant accountant = new Accountant();

        printINformation(worker);
        printINformation(director);
        printINformation(accountant);




    }
    public static void printINformation(JobTitle  jobTitle){
        jobTitle.printJobTitle();
    }

}