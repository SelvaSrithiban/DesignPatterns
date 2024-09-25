package registry;

public class IntelligentStudent extends Student {
    //Declare the attributes
    private int iq;

    //Create a Constructor
    /*public IntelligentStudent(int iq){
        this.iq = iq;
    }*/

    public IntelligentStudent(Student student) {
        super(student.getId(), student.getName(), student.getEmail(), student.getBatch());
        // Additional logic for IntelligentStudent
    }

    //Create a Copy Constructor
    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }


    //Override the copy method here
    @Override
    public IntelligentStudent copy(){
        IntelligentStudent student = new IntelligentStudent(this);
        System.out.println("From Intelligent Student Class");
        return student;
    }
}
