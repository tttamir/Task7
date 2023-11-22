public class Accountant implements JobTitle{

    String nameOfJob = "Accountant";

    public Accountant(){

    }

    @Override
    public void printJobTitle() {
        System.out.println("Name of job is " + nameOfJob);
    }
}
