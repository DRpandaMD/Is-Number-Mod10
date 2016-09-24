
public class RefactoredLuhnAlgo 
{
	//Thanks @ Chris Wareham 
	//http://www.chriswareham.demon.co.uk/software/Luhn.java
	//Location: https://gist.github.com/mdp/9691528
	
	public static boolean IsValidMod10Number(String number)
	{
		int sumTotal = 0;
		boolean checkBit = false;
		
		//additional checks
		if((number.length() == 0) || (number.equals("0")))
		{
			return false;
		} 
		
		for(int index = number.length() - 1; index >= 0; index--)
		{
			int num = Integer.parseInt(number.substring(index, index + 1));
			if(checkBit)
			{
				num *= 2;
				{
					if(num > 9)
					{
						num -= 9;
					}
				}
				sumTotal += num;
				checkBit = !checkBit;
			}
		}
		return (sumTotal % 10 == 0);
	}
}
