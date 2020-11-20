
package mid;

import java.util.Scanner;
import java.util.ArrayList;

public class Mid {
    
    public static Scanner shark = new Scanner(System.in); 
    public static ArrayList<String> namae = new ArrayList<>(); //list for names
    public static ArrayList<Integer> nenrei = new ArrayList<>();  // list for ages

    //Delete Entry
    static void DetaSakujo(ArrayList<String> YuzaMei, ArrayList<Integer> YuzaNenrei) {
        System.out.println("====== Delete Entry ======");

        System.out.print("Enter a Name to Delete: ");
        String SakujoYuza = shark.next();

        if (YuzaMei.contains(SakujoYuza)) {
            for (int i = 0; i < YuzaMei.size(); i++) {
                if (SakujoYuza.equals(YuzaMei.get(i))) {
                    System.out.println(YuzaMei.get(i) + " was deleted from the list");
                        YuzaMei.remove(i);
                        YuzaNenrei.remove(i);
                            break;}}} 
                else {
                    System.out.println("No " + SakujoYuza + " in the list");}
                seap(YuzaMei, YuzaNenrei);}
    
         //Add entry (name, age)
    static void DetaTsuika(ArrayList<String> YuzaMei, ArrayList<Integer> YuzaNenrei) {
        System.out.println("======= Add Entry ========");
        System.out.print("\nEnter Name: ");
        String name = shark.next();
        YuzaMei.add(name);

        System.out.print("Enter Age: ");
        int age = shark.nextInt();
        YuzaNenrei.add(age);
        seap(YuzaMei, YuzaNenrei);}
    
        //Update
    static void DetaKoshin(ArrayList<String> YuzaMei, ArrayList<Integer> YuzaNenrei) {
        System.out.println("====== Update an Entry=======");

        System.out.print("\nEnter a Name to Update: ");
        String YuzaEdit = shark.next();

        if (YuzaMei.contains(YuzaEdit)) {
            for (int i = 0; i < YuzaMei.size(); i++) {
                if (YuzaEdit.equals(YuzaMei.get(i))) {
                    System.out.print("\nEnter New Name: ");
                    String AtarashiNamae = shark.next();
                    YuzaMei.set(i, AtarashiNamae);
                    System.out.print("Enter New Age: ");
                    int ShinJidai = shark.nextInt();
                    YuzaNenrei.set(i, ShinJidai);
                    break;}}} 
                else {
                    System.out.println("No " + YuzaEdit + " in the list");}
                seap(YuzaMei, YuzaNenrei);}
    
    //View all entries
    static void DetaMiru(ArrayList<String> YuzaMei, ArrayList<Integer> YuzaNenrei) {
        System.out.println("====== View All Entries =======");

        for (int i = 0; i < YuzaMei.size(); i++) {
            System.out.println("\n"+YuzaMei.get(i) + " is " + YuzaNenrei.get(i));}
        seap(YuzaMei, YuzaNenrei);}

    //Exit 
    static void Deguchi(ArrayList<String> YuzaMei, ArrayList<Integer> YuzaNenrei) {
        System.out.println("Termination Complete");
        System.out.println("");
        System.exit(0);
        return;
    }
    //OUPUT 
    static void seap(ArrayList<String> namae, ArrayList<Integer> nenrei) {

        System.out.println("\n*************************************************************\n" +
                           "*                       MIDTERM EXAM                        *\n" +
                           "*               Object Oriented Programming                 *\n" +
                           "*            Kenette Roeven C. Saylo BSCS 2B AI             *\n" +
                           "*************************************************************"+
                "\n======= Options ======="+
                    "\n1. Add entry"+
                    "\n2. Delete entry"+
                    "\n3. View all entries"+
                    "\n4. Update"+
                    "\n0. Exit");

        int input = 0;
        System.out.print("Select an option: ");
        try {
            input = shark.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println("Invalid keyword");
            System.exit(0);
        }
        switch (input) {

            case 0:
                Deguchi(namae, nenrei);
            case 1:
                DetaTsuika(namae, nenrei);
            case 2:
                DetaSakujo(namae, nenrei);
            case 3:
                DetaMiru(namae, nenrei);
            case 4:
                DetaKoshin(namae, nenrei);
            default: {
                System.out.println("Invalid input, please try again");
                seap(namae, nenrei);
            } 
        }        
    }



    public static void main(String[] args) {
        seap(namae, nenrei);

    }
    
}
