package homework;

public class User implements Persisterable, ReportPrintable, Userable{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void save(){
        System.out.println("Save user: " + this.getName());
    }

    public void report(){
        System.out.println("Report for user: " + name);
    }
}
