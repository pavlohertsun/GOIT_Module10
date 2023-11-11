import task3.FrequencyCounter;
import task3.MyFileReader;
import task_1.PhoneNumbersFileReader;
import task_1.PhoneNumbersValidator;
import task_2.UsersToJSONConverter;
import task_2.UsersFileReader;
import task_2.User;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        //---------------------task_1-------------------
        PhoneNumbersFileReader fr = new PhoneNumbersFileReader();
        PhoneNumbersValidator pnv = new PhoneNumbersValidator();
        List<String> lines = fr.readFromFile("task1.txt");
        List<String> validated = pnv.validateNumbers(lines);
        for(String phone : validated){
            System.out.println(phone);
        }
        //---------------------task_2-------------------
        UsersFileReader usersFileReader = new UsersFileReader();
        UsersToJSONConverter jsonConverter = new UsersToJSONConverter();
        List<User> users = usersFileReader.readFromFile("task2.txt");
        jsonConverter.convertToJSON(users);
        //---------------------task_3-------------------
        MyFileReader myFileReader = new MyFileReader();
        FrequencyCounter frequencyCounter = new FrequencyCounter();
        List<String> lines2 = myFileReader.readFromFile("task3.txt");
        Map<String, Integer> frequency = frequencyCounter.countFrequency(lines2);
        for(var entry : frequency.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
