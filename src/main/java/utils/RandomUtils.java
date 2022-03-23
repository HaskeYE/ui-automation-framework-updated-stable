package utils;

import java.util.Random;

public class RandomUtils {
    public static String generateRandomEmail(String domain) {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder emailPrefix = new StringBuilder();
        Random rnd = new Random();
        while (emailPrefix.length() < 7) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            emailPrefix.append(SALTCHARS.charAt(index));
        }
        return emailPrefix.append("@").append(domain).toString();
    }

    public static String generateRandomName() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder name = new StringBuilder();
        Random rnd = new Random();
        while (name.length() < 7) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            name.append(SALTCHARS.charAt(index));
        }
        return name.toString();
    }
}
