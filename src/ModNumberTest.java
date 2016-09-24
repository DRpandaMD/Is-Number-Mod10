
public class ModNumberTest 
{
	
	//Partial Refactor of code
	//Formating improved
	//
	public static boolean IsValidMod10Number(String numberString)
	{
		int [] numberArray = new int[numberString.length()];
		boolean checkBit = false;
		int sumTotal = 0;
		//check against empty strings and 0
		if((numberString.length() == 0) || (numberString.equals("0")))
		{
			return false;
		}
		
		for(int i = 0; i < numberString.length(); i++)
		{
			numberArray[i] = Integer.parseInt(numberString.substring(i, i + 1));
		}
		
		for(int index = numberArray.length - 1; index >= 0; index--)
		{
			
			if(checkBit)
			{
				numberArray[index] *= 2;
				
				if(numberArray[index] > 9)
				{
					numberArray[index] -= 9;
				}
			}
			
			sumTotal += numberArray[index];
			checkBit = !checkBit;
		}
		return (sumTotal % 10) == 0;
	}
}


