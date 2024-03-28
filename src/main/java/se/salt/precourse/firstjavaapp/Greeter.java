package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Greeter {

  private static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn;
  }

  private static long calculateDays(String date){
    LocalDate currentDate = LocalDate.now();
    long days = ChronoUnit.DAYS.between(currentDate,LocalDate.parse(date));
    return days;
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    System.out.print("When does that course start? ");
    String date =reader.readLine();

    System.out.println(greet(name));
    System.out.println("Today it is "+ calculateDays(date) +" days left until the course starts");
  }
}
