package builder;

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
    public void setGradYear(int gradYear) {
        if(gradYear > 2023){
            throw new RuntimeException("Freshers are not allowed to enroll");
        }
        this.gradYear = gradYear;
    }
    private List<String> skills;
    public List<String> getSkills() {
        return skills;
    }
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }


}
