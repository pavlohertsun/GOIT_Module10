package task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbersValidator {
    public List<String> validateNumbers(List<String> lines){
        List<String> validated = new ArrayList<>();
        Pattern pattern = Pattern.compile("(\\(\\d{3}\\) \\d{3}-\\d{4})|(\\d{3}-\\d{3}-\\d{4})");
        for(String phone : lines){
            Matcher matcher = pattern.matcher(phone);
            if(matcher.find()){
                validated.add(matcher.group());
            }
        }
        return validated;
    }
}
