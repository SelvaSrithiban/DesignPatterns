package builder;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        //Student student = new Student(1, "Selva Srithiban", "selva.thiban@gmail.com", "Nov23", "Java Backend");

        Builder builder = new Builder();
        builder.setId(1);
        builder.setName("Selva Srithiban");
        builder.setEmail("selva.thiban@gmail.com");
        builder.setBatch("Nov23");
        builder.setCourse("Java Backend");
        builder.setGradYear(2024);
        builder.setSkills(new ArrayList<>());
        
        Student student = new Student(builder);
    }
    
}
