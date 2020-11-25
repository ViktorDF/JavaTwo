package lessonThree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, ArrayList<Long>> phonebook = new HashMap<>();

    public void add(long telephone, String firstname) {
        if (phonebook.containsKey(firstname)) {
            phonebook.get(firstname).add(telephone);
        } else {
            ArrayList<Long> phone = new ArrayList<>();
            phone.add(telephone);
            phonebook.put(firstname, phone);
        }
    }

    public ArrayList<Long> get(String firstname) {
            return phonebook.get(firstname);
    }
}
