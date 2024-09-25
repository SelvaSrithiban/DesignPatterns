package prototype;

public class Student implements Prototype<Student>{
    //Declare the attributes
    private int id;
    private String name;
    private int grade;

    //Create a constructor
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Create a Copy Constructor
    Student(Student st){
        this.name = st.name;
        this.id = st.id;
        this.grade = st.grade;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    //Implement a Copy method here
    @Override
    public Student copy() {
      Student student = new Student(this);
      System.out.println("From Student class");
      return student; 
    }
}
