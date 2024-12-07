package Q13;

import java.util.Scanner;

public class Q13ComputerAccountTest{

    /*
     * in order to use the Q13ComputerAccount class, we use it here in this file
     * 
     * in here i used scanners to get user inputs for real name, username, and password
     * 
     * i then used the Q13ComputerAccount class to create a new object which i then parse the previous
     * values into.
     * 
     * with this we can call the functions from the Q13ComputerAccount class
     * 
     * we then print the variables by using System.out.println and call the value using user.printRealName / user.printUsername
     * 
     * after that i set a prompt to ask if a user wants to change their passwords or not, if the string equals to "yes"
     * then we call the change password function, if not then the program ends.
     * 
     * to check if the password has been successfully changed, i added a debugging print line.
     */

    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);  
        
        System.out.println("Input real name, username, and password");
        String realName = myObj.nextLine();
        String userName = myObj.nextLine();
        String password = myObj.nextLine();

        Q13ComputerAccount user = new Q13ComputerAccount(realName, userName, password);

        System.out.println("Real Name is " + user.printRealName());
        System.out.println("Username is " + user.printUserName());


        System.out.println("Do you want to change password? (yes/no)");
        String answ = myObj.nextLine();

        if(answ.equals("yes")){
            System.err.println("type in new password");
            String newpass = myObj.nextLine();
            user.changePassword(newpass);
            //System.out.println(newpass); /*for debugging and checking if the password successfully changed or not */
        } else {
            System.out.println("have a good day");
        }
        
        myObj.close();
    }
}
