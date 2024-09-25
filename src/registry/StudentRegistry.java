package registry;

public interface StudentRegistry {

    //Function to store the data in the registry
    void register(String key, Student student);
    

    //Function to retrieve the prototype
    Student retrievePrototype(String key);
    
}
