import java.util.*;
 
public class Encrypt {
	public static void main(String[] args){
		String mesg, encrypted = "";
		int key;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a message: ");
		mesg = sc.nextLine();
		
		System.out.println("Enter key: ");
		key = sc.nextInt();
 
		for(int i = 0; i < mesg.length(); ++i){
			ch = mesg.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch + key);
	            
	            if(ch > 'z'){
	                ch = (char)(ch - 'z' + 'a' - 1);
	            }
	            
	            encrypted += ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch + key);
	            
	            if(ch > 'Z'){
	                ch = (char)(ch - 'Z' + 'A' - 1);
	            }
	            
	            encrypted += ch;
	        }
	        else {
	        	encrypted += ch;
	        }
		}
		
		System.out.println("Encrypted Message = " + encrypted);
	}
}
