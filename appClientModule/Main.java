import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(permuteCompare("strA", "strA"));
	}
	
	public static boolean permuteCompare(String strA, String strB) {
		
		/*
		 * Step 1: Check if the strings are not null
		 */
		if(strA == null || strB == null)
			return false;
		
		/*
		 * Step 2: Check if the length of both strings is not equal, then they will not match
		 */
		if(strA.length() != strB.length()) 
			return false;
		
		/*
		 * Step 3: Convert both strings to ArrayList (split method looks like not a elegant way, but works)
		 */
		List<String> strAList = new ArrayList<String>(Arrays.asList(strA.split("")));
		List<String> strBList = new ArrayList<String>(Arrays.asList(strB.split("")));
		
		/*
		 * Step 4: Sort both ArrayList using Collections
		 */
		Collections.sort(strAList);
		Collections.sort(strBList);
		
		/*
		 * Step 5: Compare them using equals that will compare size and each element value (Ref: https://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html#equals-java.lang.Object-)
		 */
		if(!strAList.equals(strBList))
			return false;

		return true;
	}

}