import static org.junit.Assert.*;

import org.junit.Test;

public class TestModNumberTests
{

	ModNumberTest testMod;
	
	
	static String ccNumber = "360886098120310";
	static String nullString = null;
	
	
	//Tests Path 1
	@Test
	public void testPathOne()
	{
		assertEquals(false, ModNumberTest.IsValidMod10Number(""));
	}
	
	//Path 2 is logically impossible to test for and can be ignored
	
	//Test Path 3
	@Test
	public void testPathThree()
	{
		assertEquals(false, ModNumberTest.IsValidMod10Number("3"));
	}
	
	//Tests Path 4
	@Test
	public void testPathFour()
	{
		assertEquals(false, ModNumberTest.IsValidMod10Number("11"));
	}
	
	
	//Test Path 5
	@Test
	public void testPathFive()
	{
		assertEquals(true, ModNumberTest.IsValidMod10Number("8367"));
	}
	
	//also test path 5
	@Test
	public void testccNuber()
	{
		assertEquals(true, ModNumberTest.IsValidMod10Number(ccNumber));
	}
	
	@Test
	public void testLuhnCCNumber()
	{
		assertEquals(true, RefactoredLuhnAlgo.IsValidMod10Number(ccNumber));
	}
	
	

}
