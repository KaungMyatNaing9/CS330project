package Programming;
import java.util.Random;
public class securitydevice { 
	public static boolean state = false;   
    public static int password = 0;
    public static void main(String[] args) {
    	Random rand = new Random();
    	int num=10;
    	int num2=0;
        while (state==false){
        
            password = rand.nextInt(num);
            num2++;
            password= bugcheck(password);
            if(password == 9){
               
            	password = rand.nextInt(num);
            	num2++;
                password= bugcheck(password);
                if(password == 9){
                    
                	password = rand.nextInt(num);
                	num2++;
                    password= bugcheck(password);
                    if(password == 3){
                        
                    	password = rand.nextInt(num);
                    	num2++;
                        password= bugcheck(password);
                        if(password == 0){
                            
                        	password = rand.nextInt(num);
                        	num2++;
                            password= bugcheck(password);
                            if(password == 6){
                                
                            	password = rand.nextInt(num);
                            	num2++;
                                password= bugcheck(password);
                                if(password == 1 && state==false){
                                	 System.out.println("UnLocked");
                                    state=true;
                                    }    
                                if(password == 4 && state==true){
                                    System.out.println("Locked");
                                    state=false;
                                }    
                            }
                        }
                    }
                }
            }
        } 
        System.out.println("count:"+num2);
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
