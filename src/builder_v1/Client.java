package builder_v1;

import java.util.ArrayList;
//import java.util.stream.*;

public class Client {

    public static void main(String[] args) {
        //Student student = new Student(1, "Selva Srithiban", "selva.thiban@gmail.com", "Nov23", "Java Backend");

        /*Student student = Student
                            .getBuilder()
                            .setId(1)
                            .setName("Selva Srithiban")
                            .setEmail("selva.thiban@gmail.com")
                            .setBatch("Nov23")
                            .setCourse("Java Backend")
                            .setGradYear(2024);*/

        
        //Student student = new Student(builder);

        Student student = Student
                        .getBuilder()
                        .setId(1)
                        .setName("Selva Srithiban")
                        .setEmail("selva.thiban@gmail.com")
                        .setBatch("Nov23")
                        .setCourse("Backend")
                        .setGradYear(2024)
                        .setSkills(new ArrayList<>())
                        .build();
                            
                        
                        
                        }
    
}
