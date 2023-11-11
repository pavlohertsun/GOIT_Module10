package task_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UsersToJSONConverter {
    public void convertToJSON(List<User> users){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(users);

        try (FileWriter writer = new FileWriter("user.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
