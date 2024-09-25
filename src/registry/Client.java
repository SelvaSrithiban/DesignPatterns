package registry;

import java.util.ArrayList;
import java.util.List;

public class Client {
    //Method the store the prototype in the registry
    static void fillRegistry(StudentRegistry st){
        //Create a Student object and store it in registry
        Student apr23Student = new Student(25, "Temp_name", "Temp@gmail.com", "Apr23"); 
        st.register("Apr23Student", apr23Student);

        Student may23Student = new Student(25, "Temp_name", "Temp@gmail.com", "May23"); 
        st.register("May23Student", apr23Student);

    }
    public static void main(String[] args) {
        //Create a StudentRegistry Object and fill the registry
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);
        //Create a copy of Apr23Student
        Student st2 = studentRegistry.retrievePrototype("Apr23Student");

        List<Student> apr23Students = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            apr23Students.add(studentRegistry.retrievePrototype("Apr23Student"));
        }
    }
}
