package registry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistryImpl implements StudentRegistry{

    Map<String, Student> students = new HashMap<>(); 

    //Function to store the data in the registry
    @Override
    public void register(String key,Student apr23Student){
        students.put(key, apr23Student);
    }

    //Function to retrieve the prototype
    @Override
    public Student retrievePrototype(String key){
        return students.get(key).copy();
    }
    
}
