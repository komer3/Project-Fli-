package hello;
import objects.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;




@RestController
public class StudySessionsController{

    @RequestMapping("/study")
    public StudySession getStudySession(@RequestParam(value="id", defaultValue="123") int id) {
        Person profe = new Person();
        StudySession sess = new StudySession(10, "Chicago", id);
        return sess;
    }
    @RequestMapping(
        value = "/studySess",
        method = RequestMethod.GET)
    public void UpdateSession(@RequestParam(value = "_id", defaultValue = "Yass") int id) {
        //Database shit
    }   
}


class StudySession{
    private int students;
    private String location;
    private int id;

    public StudySession(int students, String location, int id){
        this.students = students;
        this.location = location;
        this.id = id;
    }
    
    public int getNumberOfStudents(){
        return students;
    }
    public String getStudents(){
        return location;
    }
    public int getId(){
        return id;
    }
    void addStudents(String firstName, String lastName, String Major){
        

    }
}





