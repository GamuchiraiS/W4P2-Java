package testing;

public class Duplicate {
    //fields
    public int[] valueArray;
    public int counter; 
    
    public Duplicate() {
    	valueArray = new int[10];
    	counter = 0;
    } 
    //method for determining the duplicates numbers
    public int AmountDupNums(int [] valueArray)
    {

        for (int i = 0; i < 10; i++)
        {
            for (int x = i + 1; x < 10; x++)
            {
                //If a duplicate of the element is found, 
                //incremnt amountOfDuplicNums
                if (valueArray[i] == valueArray[x])
                {
                    counter++;
                    break;
                }
            }
        }
        return counter;

    }
}
