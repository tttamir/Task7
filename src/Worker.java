public class Worker implements JobTitle {

    String nameOfJob = "Worker";

    public Worker(){

    }

    @Override
    public void printJobTitle() {
        System.out.println("Name of job is " + nameOfJob);
    }
}
