package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(name);

        if (match.matches()) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Name is invalid, Try with another name.");
        }
        return true;
    }


    public boolean lastName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(name);

        if (match.matches()) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Name is invalid, Try with another name.");
        }
        return true;
    }


    public boolean email(String mail) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$");
        Matcher match = pattern.matcher(mail);

        if (match.matches()) {
            System.out.println("email is valid");
        } else {
            System.out.println("email is invalid, Try with another id.");
        }
        return true;
    }


    public boolean mobileNumber(String mobNum) {
        Pattern pattern = Pattern.compile("^[0-9]{2}\s[0-9]{10}$");
        Matcher match = pattern.matcher(mobNum);

        if (match.matches()) {
            System.out.println("Mobile number is valid");
        } else {
            System.out.println("Mobile Number is invalid, Try with another number.");
        }
        return true;
    }


    public boolean ruleOne(String password) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]{8,}$");
        Matcher match = pattern.matcher(password);

        if (match.matches()) {
            System.out.println("First Rule is valid");
        } else {
            System.out.println("First Rule is invalid, Try another.");
        }
        return true;
    }


    public boolean ruleTwo(String password) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]{1,}[a-zA-Z]{7,}$");
        Matcher match = pattern.matcher(password);

        if (match.matches()) {
            System.out.println("Second Rule is valid");
        } else {
            System.out.println("Second Rule is invalid, Try another.");
        }
        return true;
    }


    public boolean ruleThird(String password) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,}[a-zA-Z0-9]{7,}$");
        Matcher match = pattern.matcher(password);

        if (match.matches()) {
            System.out.println("Third Rule is valid");
        } else {
            System.out.println("Third Rule is invalid, Try another.");
        }
        return true;
    }


    public boolean ruleFourth(String password) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9@$!%*#?&]{1,}[a-zA-Z0-9@$!%*#?&]{7,}$");
        Matcher match = pattern.matcher(password);

        if (match.matches()) {
            System.out.println("Fourth Rule is valid");
        } else {
            System.out.println("Fourth Rule is invalid, Try another.");
        }
        return true;
    }
}
