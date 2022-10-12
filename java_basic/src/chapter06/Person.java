package chapter06;

import java.util.Scanner;

public class Person {
    public String lastName;
    public String firstName;
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getLength() {
        return lastName.length()+firstName.length();
    }
}
