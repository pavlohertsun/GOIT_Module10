package task_2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class UsersFileReader {
    public List<User> readFromFile(String filePath) {
        List<User> users = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            String[] header = scanner.nextLine().split(" ");
            while (scanner.hasNextLine()) {
                String[] values = scanner.nextLine().split(" ");
                Map<String, String> userMap = new HashMap<>();
                for (int i = 0; i < header.length; i++) {
                    userMap.put(header[i], values[i]);
                }
                users.add(new User(userMap.get("name"), Integer.parseInt(userMap.get("age"))));
            }
        } catch (IOException e) {
            System.err.println("no such file");
            e.printStackTrace();
        }
        return users;
    }
}
