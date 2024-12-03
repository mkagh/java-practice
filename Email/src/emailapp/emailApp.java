package emailapp;

public class emailApp {
    public  static  void main(String[] args){
        Email em1=new Email("John ","Smith ");
        em1.setMailboxCapacity(300);
        System.out.println(em1.getMailboxCapacity());
        System.out.println(em1.display());
    }
};
