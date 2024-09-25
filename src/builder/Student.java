package builder;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String email;
    private String batch;
    private String course;
    private int gradYear;
    private List<String> skills;
    
    Student(int id, String name, String email, String batch, String course){
        this.id = id;
        this.name = name;
        this.email = email;
        this.batch = batch;
        this.course = course;
    }

    Student(Builder builder){
        this.id = builder.getId();
        this.name = builder.getName();
        this.email = builder.getEmail();
        this.batch = builder.getBatch();
        this.course = builder.getCourse();
        this.skills = new ArrayList<>();
    }
}
