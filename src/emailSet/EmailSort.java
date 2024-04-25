package emailSet;
import java.util.*;

public class EmailSort {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "a@gmail.com",
                "s@yahoo.com",
                "z@outlook.com",
                "k@outlook.com",
                "d@gmail.com",
                "l@yahoo.com",
                "c@gmail.com",
                "i@outlook.com",
                "g#rediffmail.com"
        );

        Map<String, List<String>> emailMap = new HashMap<>();

        for (String email : emails) {
            String domain = getEmailDomain(email);
            if (!emailMap.containsKey(domain)) {
                emailMap.put(domain, new ArrayList<>());
            }
            emailMap.get(domain).add(email);
        }

        // Print emails separated by domain
        for (Map.Entry<String, List<String>> entry : emailMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static String getEmailDomain(String email) {
        return email.substring(email.indexOf('@') + 1);
    }
}

