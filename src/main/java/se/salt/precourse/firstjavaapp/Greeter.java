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

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();
    System.out.println(greet(name));

    System.out.print("When does that course start (yyyy-mm-dd)? ");
    String startDate = reader.readLine();

    StartDateHandler startDateHandler = new StartDateHandler();
    if(startDateHandler.dateHasOnlyNumbers(startDate) ){
      System.out.print("You start in " + startDateHandler.daysToCourseStart(startDate) + " days. Better get cracking on that Pre-course!!");
    } else {
      System.out.print("Please provide a valid date");
    }

  }
}
