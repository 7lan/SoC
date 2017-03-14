import java.util.Random;
class catanDice
{ 
    public catanDice()
    {
      
    }

    public int generateDiceNumber()
    {
        Random rnumber = new Random();
        int randomDiceNumber;

        int min = 1;
        int max = 6;

        randomDiceNumber = rnumber.nextInt(max - min + 1) + min;

        return randomDiceNumber;
    }
}