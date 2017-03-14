import java.util.*;

public class mainTest
{
    public static void main(String[] args)
    {
        catanDice newDice = new catanDice();

        int dice1 = newDice.generateDiceNumber();
        int dice2 = newDice.generateDiceNumber();

        System.out.println("Dice 1 is " + dice1);
        System.out.println("Dice 2 is " + dice2);


    }
}