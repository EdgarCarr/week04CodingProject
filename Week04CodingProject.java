package week04CodingProject;

public class Week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int newAge = ages[ages.length-1]-ages[0];
		System.out.println(newAge);
		//b. Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] gamesPlayed = {21, 4, 6, 45, 12, 75, 11, 1, 32};
		int newGames = gamesPlayed[gamesPlayed.length-1]-gamesPlayed[0];
		System.out.println(newGames);
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int result = 0;
		for (int age  : ages) {
			result += age;
		}
		int average = result/ages.length;
		System.out.println(average);
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int sum = 0;
		for (String name : names) {
			sum += name.length();
		}
		int averageLetter = sum/names.length;
		System.out.println(averageLetter);		
				
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String concatNames = "";
		for (String name : names) {
			concatNames += name + " ";
		} 
		System.out.println(concatNames);
		
		//3. How do you access the last element of any array?
		//*use name of array with some square brackets and .length-1 
		//4. How do you access the first element of any array?
		//*name of array along with square brackets and a 0, because 0 is the first index.
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[6];
		for (int i = 0; i < names.length; i++) {
			int length = names[i].length();
			nameLengths[i] = length;
		}
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumAll = 0;
		for (int name : nameLengths) {
			sumAll += name;
		} 
		System.out.println(sumAll); }
		//7. Test.
	
	//System.out.println(concatString("BeetleJuice", 3));
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String concatString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	//7. example: System.out.println(concatString("Beetlejuice", 3));
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String fullName(String firstName, String lastName) {
	 String result = " ";
	 result = firstName + " " + lastName;
	 return result;
	}
//8. example: System.out.println(fullName("Son", "Goku"));
	
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean greaterThan100(int[] array) {
		int sum = 0;
		for (int number : array) {
			sum += number;
		} if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	//9. System.out.println(greaterThan100(ages));
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double average(double[] array) {
		double sum = 0; 
		for (double number : array) {
			sum += number;
		} return (sum/array.length);
	}
	//10. example: 
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean greaterAverage(Double[] firstArray, Double[] secondArray) {
		double sum1 = 0;
		double sum2 = 0;
		for (double firstNumber : firstArray) {
			sum1 += firstNumber;
		}
		for (double secondNumber : secondArray)	{
			sum2 += secondNumber;
		}
		double firstAverage = sum1/firstArray.length;
		double secondAverage = sum2/secondArray.length;
		if (firstAverage > secondAverage) {
			return true;
		}
		else {
			return false;
		}
	}
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket>10.50) {
			return true;
		}
		else {
			return false;
		}
	}
	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
    	 public int addNumbers(int a, int b) {
    		 int sum = a + b;
    		 return sum;
    	 }}//if i ever need to add two certain numbers together this is how i would use this method. 
		
		




