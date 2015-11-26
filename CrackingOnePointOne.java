// 1.1 Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?

class CrackingOnePointOne
{
	public static void main(String[] args)
	{
		String stringTrue = "ASDFqwerUIOP";
		String stringFalse = "ASDFqwerUIOPP";

		System.out.println("stringTrue is: " + hasUniqueCharacters(stringTrue));
		System.out.println("stringFalse is: " + hasUniqueCharacters(stringFalse));
	}

	private static boolean hasUniqueCharacters(String string)
	{
		String stringUse = string.toLowerCase();
		int[] alphabet = new int[24];
		for(int i = 0; i < stringUse.length(); i++)
		{
			alphabet[stringUse.charAt(i) - 'a']++;
		}

		boolean retVal = true;
		for(int i = 0; i < alphabet.length; i++)
		{
			if(alphabet[i] > 1)
			{
				retVal = false;
			}
		}
		return retVal;
	}
}