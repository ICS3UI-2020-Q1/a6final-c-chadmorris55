import java.util.Scanner;
/**
 * 
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    //creates the 5 element array
    int [] cards = new int [5];
    //constants stored here
    final int INCREASE_COUNT = 6;
    final int DECREASE_COUNT = 10;
    //asks user ot input numebrs and records them with a loop
    System.out.println("Please enter the value of 5 cards:");
    for (int i=0; i < cards.length; i++){
      cards[i] = input.nextInt();
    }
    //determines how to affect the count and then affects the count accordingly
    int count = 0;
    for (int i=0; i < cards.length; i++){
      //if card value is low increase the count
      if (cards[i] <= INCREASE_COUNT){
        count = count + 1;
        //if value is high, decrease the count
      } else if (cards [i] >= DECREASE_COUNT){
        count = count - 1;
        //if value is mid, dont change the value
      } else {
        count = count;
      }
    }
    //prints out final result here
    System.out.println("The count would be " + count);
    
  }
}
