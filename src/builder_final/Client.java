package builder_final;

import java.util.ArrayList;
//import java.util.stream.*;

public class Client {

    public static void main(String[] args) {
        
        Student student = Student
                        .getBuilder()
                        .setId(1)
                        .setName("Selva Srithiban")
                        .setEmail("selva.thiban@gmail.com")
                        .setBatch("Nov23")
                        .setCourse("Backend")
                        .setGradYear(2022)
                        .setSkills(new ArrayList<>())
                        .build();
                                           
     }
    
}
