package builder_v1;

import java.util.List;

public class Builder {
    
    private int id;
    private String name;
    private String email;
    private String batch;
    private String course;
    private int gradYear;
    public int getGradYear() {
        return gradYear;
    }
    public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }
    private List<String> skills;
    public List<String> getSkills() {
        return skills;
    }
    public Builder setSkills(List<String> skills) {
        this.skills = skills;
        return this;
    }
    public int getId() {
        return id;
    }
    public Builder setId(int id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }
    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    public String getEmail() {
        return email;
    }
    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getBatch() {
        return batch;
    }
    public Builder setBatch(String batch) {
        this.batch = batch;
        return this;
    }
    public String getCourse() {
        return course;
    }
    public Builder setCourse(String course) {
        this.course = course;
        return this;
    }

    public void validate(){
        if(getGradYear() > 2023){
            throw new RuntimeException("Freshers are not allowed to enroll");
        }
        if(getCourse() == null){
            throw new RuntimeException("Course is mandatory");
        }
    }

    public Student build(){
        return new Student(this);
    }
}
