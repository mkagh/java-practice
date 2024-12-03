import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         //implicit(automatic type conversion from smaller to
        // bigger data type-short to int)
        //implicitno se desava kad se manji data type pretvara u veci
         //short x=2;
        // int y=x+2;

        // System.out.println(y);

        // explicit
//        double x=2.2;
//        int y=(int)x+2;//ovo int u zagradi je explicit
//        System.out.println(y);

        //casting pretvaranje stringa u int//stringovi i
        //bilo koji brojevi nekompatibilni za razliku od prva dva
        //primera
//        String z="2";
//        int f=Integer.parseInt(z)+4;
//        System.out.println(f);
//-----------------------------
//formating numbers
//        String result= NumberFormat.getPercentInstance().format(0.1);//ovo je metod chaining
        //prvi metod vraca objekat koji u sebi sadrzi format metod.
        //
//        System.out.println(result);
        //------------------------
//        Scanner scanner=new Scanner(System.in);//in je da se uzme iz terminala vrednost
//        System.out.print("Name: ");//lepse print nego println
//        String result =scanner.nextLine().trim();//nextLine(), a ne next jer bi onda uzelo samo ime a ne
//        //ime i prezime jer je jedna rec ukucana u terminal ustvari token a next uzima samo 1 token
//        System.out.println("Tvoje ime je" + result);
//---------------------------------HIPOTEKA(SAMO SU MI NAZIVI VARIJABLI NESPRETNI)
//        Scanner scanner=new Scanner(System.in);
//
//        System.out.print("P: ");
//        String p=scanner.nextLine();
//
//        int intP=Integer.parseInt(p);
//
//        System.out.print("AnualRate: ");
//        String anualRate=scanner.nextLine();
//
//        float intAnualRate=Float.parseFloat(anualRate)/100/12;
//
//        System.out.print("Years: ");
//        String years=scanner.nextLine();
//
//        int intYears=Integer.parseInt(years)*12;
//
//        double exponential=Math.pow((1+intAnualRate),intYears);
//
//        double result=exponential*intP*intAnualRate/(exponential-1);
//
//        System.out.println(result);
//------------------------------------------------SWITCH
//        String role ="admin";
//        switch (role){
//            case "admin":
//                System.out.println("you are admin");
//                break;
//            case "moderator":
//                System.out.println("you are moderator");
//                break;
//            default:
//                System.out.println("default");
//        }
        //---------------------WHILE
        Scanner scanner=new Scanner(System.in);
        String input="";
        while(!input.equals("quit")){
            System.out.print("input: ");
            input=scanner.next().toLowerCase();
            System.out.println(input);
//---------------------


        }







    }
}