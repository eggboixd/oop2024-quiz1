package Q13;

public class Q13ComputerAccount {

    /*
     * 
     * for this question we are asked to create a program for
     * a computer account that takes in user's real name, username, and password
     * 
     * first, i set the variables for realname, username, and password as strings
     * 
     * then we initialize the objects in the class by creating a constructor Q13ComputerAccount
     * to assign initial values to variables of the object
     * 
     * it takes in the parameters of the variables we just declared earlier.
     * 
     * after that i created a method to print the real name, username, and change password
     * 
     * 
     * 
     */

    private String realName;
    private String userName;
    private String password;

    public Q13ComputerAccount(String realName, String userName, String password) {
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }

    String printRealName() {
        return realName;
    }

    String printUserName() {
        return userName;
    }

    void changePassword(String newPass) {
        this.password = newPass;
        System.out.println("password has been changed");
    }
}
