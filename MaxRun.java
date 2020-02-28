import java.util.Scanner;

/**
 * This program determines the max run of a given string using maxRun method.
 * 
 * @author Amin Zeina
 * @version 1.0
 * @since 2020-02-24
 */
 
public class MaxRun {
  
  /**
  * This method determines and returns the max run of passed in string.
  */
  
  public static int maxRun(String stringEntered) {
    int maxRunValue = 1;
    int currentRun = 1;
    
    // for loop to determine max run
    for (int charCounter = 1; charCounter < stringEntered.length(); charCounter++) {
      // Check if there are 2 characters in a row
      if (stringEntered.charAt(charCounter) == stringEntered.charAt(charCounter - 1)) {
        currentRun++;
        if (currentRun > maxRunValue) {
          maxRunValue = currentRun;
        }
      } else {
        // Reset current run
        currentRun = 1;
      }
    }
    return maxRunValue;
  }
  
  /**
  * This class gets a user's string then calls maxRun method.
  */
 
  public static void main(String[] args) {
    // Declare variables 
    String stringEntered = null;
    
    // Create scanner object
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a string of which you want to find the max run: ");
    
    // Get user's string
    stringEntered = userInput.nextLine();
    
    // Check if anything was entered 
    if (!stringEntered.isEmpty()) {
      // Show max run by calling maxRun method, passing in user's string
      System.out.println("The max run of the string “" + stringEntered + "” is " 
          + maxRun(stringEntered) + ".");
    } else {
      // Show invalid input because string was empty
      System.out.println("Invalid input. Please enter a string.");
    }
  }
}