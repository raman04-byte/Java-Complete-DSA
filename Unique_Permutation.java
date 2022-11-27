// Java implementation of the approach
import java.util.ArrayList;
import java.util.Scanner;

public class Unique_Permutation {

	// Function that returns true if string s
	// is present in the Arraylist
	static boolean isPresent(String s, ArrayList<String> Res)
	{

		// If present then return true
		for (String str : Res) {

			if (str.equals(s))
				return true;
		}

		// Not present
		return false;
	}

	// Function to return an ArrayList containing
	// all the distinct permutations of the string
	static ArrayList<String> distinctPermute(String str)
	{

		// If string is empty
		if (str.length() == 0) {

			// Return an empty arraylist
			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}

		// Take first character of str
		char ch = str.charAt(0);

		// Rest of the string after excluding
		// the first character
		String restStr = str.substring(1);

		// Recurvise call
		ArrayList<String> prevRes = distinctPermute(restStr);

		// Store the generated sequence into
		// the resultant Arraylist
		ArrayList<String> Res = new ArrayList<>();
		for (String s : prevRes) {
			for (int i = 0; i <= s.length(); i++) {
				String f = s.substring(0, i) + ch + s.substring(i);

				// If the generated string is not
				// already present in the Arraylist
				if (!isPresent(f, Res))

					// Add the generated string to the Arraylist
					Res.add(f);
			}
		}

		// Return the resultant arraylist
		return Res;
	}

	// Driver code
	public static void main(String[] args)
	{
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
		double start = System.currentTimeMillis();
		System.out.println(distinctPermute(s));
        double end = System.currentTimeMillis();
        float  second= (float) ((end-start) /1000F);
        System.out.println(second + " seconds");

	}
}
