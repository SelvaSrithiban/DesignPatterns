package registry;

public class Student implements Prototype<Student>{
    //Declare the attributes
    private int id;
    private String name;
    private String email;
    private String batch;

    //Create a constructor
    public Student(int id, String name, String email, String batch){
        this.id = id;
        this.name = name;
        this.email = email;
        this.batch = batch;
    }

    //Create a Copy Constructor
    Student(Student st){
        this.name = st.name;
        this.id = st.id;
        this.email = st.email;
        this.batch = st.batch;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getBatch(){
        return batch;
    }



    //Implement a Copy method here
    @Override
    public Student copy() {
      Student student = new Student(this);
      System.out.println("From Student class");
      return student; 
    }
}
