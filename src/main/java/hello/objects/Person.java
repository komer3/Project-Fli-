package objects;


public class Person{
    private String firstName;
    private String lastName;

    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
}
class Profesor extends Person{
    private String course;
    private String hours;
}
class Student extends Person{
    private String major;
    private String currentSession;
}
