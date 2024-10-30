package lambdasAndStreams;

public class Players implements Comparable<Players>{

    String name;
    int rank;
    int age;

    Players(String name, int rank, int age){
        this.name = name;
        this.rank = rank;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Players [name=" + name + ", rank=" + rank + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Players o) {
        // TODO Auto-generated method stub
        return this.name.compareTo(o.name);
    }

    
    
}
