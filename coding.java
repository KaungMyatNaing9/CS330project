package Programming;
import java.util.Scanner;

public class coding {
    public static boolean state = false;   //lock or unlock status
    public static int password = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
        
            password = sc.nextInt();
            password= bugcheck(password);
            if(password == 9){
               
                password = sc.nextInt();
                password= bugcheck(password);
                if(password == 9){
                    
                    password = sc.nextInt();
                    password= bugcheck(password);
                    if(password == 3){
                        
                        password = sc.nextInt();
                        password= bugcheck(password);
                        if(password == 0){
                            
                            password = sc.nextInt();
                            password= bugcheck(password);
                            if(password == 6){
                                
                                password = sc.nextInt();
                                password= bugcheck(password);
                                if(password == 1){
                                	 System.out.println("UnLocked");
                                    
                                    }    
                                if(password == 4){
                                    System.out.println("Locked");
                                    
                                }    
                            }
                        }
                    }
                }
            }
        } 
    }
    public static int bugcheck(int password) {
		if(password<0) {
			password=0-password;
		}
		if(password>9) {
			return 2;
		}
		else {
			return password;
		}
	}
}

