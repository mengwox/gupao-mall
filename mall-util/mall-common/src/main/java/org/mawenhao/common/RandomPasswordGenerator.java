package org.mawenhao.common;

import java.security.SecureRandom;

public class RandomPasswordGenerator {

    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+-=";
    private static final int PASSWORD_LENGTH = 16;

    private static final SecureRandom random = new SecureRandom();

    public static String generate() {
        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(randomIndex));
        }
        return password.toString();
    }

    public static void main(String[] args) {
        String password = RandomPasswordGenerator.generate();
        System.out.println("Random password: " + password);
    }
}
