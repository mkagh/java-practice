package emailapp;

import java.util.Scanner;

public class Email {
   private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int passwordDefaultLength=5;
    private String alternateEmail;

    //constructor za first i last name
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("email created" + this.firstName + this.lastName);
        this.department=setDepartment();
        System.out.println("department" + this.department );
        this.password=generatePassword(passwordDefaultLength);
        System.out.println("password " + this.password );
        email=firstName.toLowerCase();
        System.out.println(email);


    }

    public String setDepartment(){
        System.out.println("1 sales /n 2 dev /n enter: ");
        Scanner scanner=new Scanner(System.in);
        int value=scanner.nextInt();
        if (value==1){return "sales"; }
        else if (value==2){return "dev"; }
        else {return "";}

    }

    private String generatePassword(int length){
        String passwordSet="ABCDEFG";
        char[]password=new char[length];
        for(int i=0; i<length;i++){
            int place=(int)( Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(place);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int mailboxCapacity){
        this.mailboxCapacity=mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
    }

    public void changePassword(String password){
        this.password=password;
    }

    public  int getMailboxCapacity(){return  mailboxCapacity;}
    public  String getAlternateEmail(){return  alternateEmail;}
    public  String getPassword(){return  password;}

    public String display(){
    return firstName + " " + lastName;
    }
}
