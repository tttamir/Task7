public class Director implements JobTitle{

    String nameOfJob = "Director";

    public Director(){

    }

    @Override
    public void printJobTitle() {
        System.out.println("Name of job is " + nameOfJob);
    }
}
