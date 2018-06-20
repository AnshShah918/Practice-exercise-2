package main.practiceExercise;

public class Pallindrome {
	public String reverseString(String str){

		if(str.length()<1) {
			return "Invalid Input";
		}else if(str.length()==1) {
			System.out.println("Although It's just a letter");
			return str;
		}
		String rev = "";
	    for (int i = str.length()-1; i>=0 ; i--) {
	        char ch = str.charAt(i);
	        rev+=ch;
	        }
	    if(str.equals(rev) == true) {
	    	System.out.println("A pallindrome");
	    	return "Pallindrome";
	    }
	    else return "Not";
	}

}
