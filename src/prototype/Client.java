package prototype;

public class Client {
    public static void main(String[] args) {
        Student st = new Student(1, "Selva Srithiban", 10);
        IntelligentStudent is = new IntelligentStudent(st, 8);

        Student st1 = st.copy();
        IntelligentStudent st2 = is.copy();

    }
}
