import java.util.Scanner;


public class NVCCguestWIFI {
	
	//variables
	private static boolean registered = false;   //checks if the user is registered
	private static int firstLine;   //the first 4 set of the password
	static int lastLine; //the last 4 set of the password
	private static char[] middleLine = {'a','b','c','d','e','f','g','h','i'};  //the middle set of the password
    private static String name;
    private static String  lastName ;
	
	
	public static void register(){
		  Scanner keyboard = new Scanner(System.in);
		  System.out.println("Enter first Name");
		  String input1 = keyboard.nextLine(); //get the first name
		  name = input1; //store the first name
		  
		  System.out.println("Enter your last name and press enter");
		  String input2 = keyboard.nextLine();
		  lastName = input2; //store the last name
		  
		  
		  firstLine = (int)(Math.random()*90+1);
		  lastLine = (int)(Math.random()*90+1);
		  
		  System.out.print(firstLine);
		  for(int j = 0; j<4; j++){
		  int i = (int)(Math.random()*10+1);
		  System.out.print(middleLine[i]);
		
		  }
		  System.out.println(lastLine);
		  System.out.println("userName: " + name.charAt(1-1) + lastName);
		  
		  
		
		
		
	}
	

	public static void main(String args[]) {
		if(!registered){
			register();
			
		}
		

	}

}
