import java.util.*;
 
public class Decrypt {
	public static void main(String[] args){
		String mesg, decrypted = "";
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
	            ch = (char)(ch - key);
	            
	            if(ch < 'a'){
	                ch = (char)(ch + 'z' - 'a' + 1);
	            }
	            
	            decrypted += ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch - key);
	            
	            if(ch < 'A'){
	                ch = (char)(ch + 'Z' - 'A' + 1);
	            }
	            
	            decrypted += ch;
	        }
	        else {
	        	decrypted += ch;
	        }
		}
		
		System.out.println("Decrypted Message = " + decrypted);
	}
}
