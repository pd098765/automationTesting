package collections_Programs;

public class ASCI_value {

	public static void main(String[] args) {

//     int value='a';
//     System.out.println(value);
		        
		        String[] words = {"Apple", "Orange"};

		        for (String word : words) {
		            System.out.println("ASCII values for " + word + " :");
		            
		            for (int i = 0; i < word.length(); i++) {
		                char ch = word.charAt(i);
		                int ascii = (int) ch; // This converts char to ASCII number
		                System.out.println(ch + " = " + ascii);
		            }
		        }
		    }
		

	}

