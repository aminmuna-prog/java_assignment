
import java.lang.*;

public class amountNoteCount {


    public static void countCurrency(int amount)
    {
        int[] notes = new int[]{1000,500,200,100,50,20,10,5,2,1};
        int[] noteCounter = new int[notes.length];

       //      count notes
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        // Print notes
        System.out.println("Amount's notes Count ->");
        for (int i = 0; i < notes.length; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }

//    call function
    public static void main(String args[]){
        int amount = 546;
        countCurrency(amount);
    }

    /* This code is contributed by Sagar Shukla */
}
