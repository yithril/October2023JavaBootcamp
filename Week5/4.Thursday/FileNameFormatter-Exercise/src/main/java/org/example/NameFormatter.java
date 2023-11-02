package org.example;

public class NameFormatter {
    private int firstNumber;
    private NameFormatter() {

    }

    public static String format(String firstName, String lastName) {
        return String.format("%s, %s", lastName, firstName);
    }

    //method overloading
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return String.format("%s, %s %s %s, %s", lastName, prefix, firstName, middleName, suffix);
    }

    //method overloading
    public static String format(String fullName) {
        String[] parts = fullName.split(" ");

        if (parts.length == 2) {
            return format(parts[0], parts[1]);
        } else if (parts.length == 3 && fullName.contains(",")) {
            String firstName = parts[0];
            String lastName = parts[1];
            String suffix = parts[2].replace(",", "");
            return format(firstName, lastName) + ", " + suffix;
        } else if (parts.length == 3) {
            String firstName = parts[0];
            String middleName = parts[1];
            String lastName = parts[2];
            return format(firstName, middleName, lastName, "", "");
        } else {
            String prefix = parts[0];
            String firstName = parts[1];
            String middleName = parts[2];
            String lastName = parts[3].replace(",", "");
            String suffix = parts[4];
            return format(prefix, firstName, middleName, lastName, suffix);
        }
    }
}
