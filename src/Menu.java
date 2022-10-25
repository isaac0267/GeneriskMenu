import java.util.Scanner;

public class Menu {
        private String menuHeader; // we write the menuheader and save at insid of datatype.
        private String leadText;  // we write the other one and save that in the sting data type leadtext
        private String [] menuItems;// we write the other one and call it the menuitems and save it.

        // making a constructor
        public Menu(String menuHeader, String leadText,String[]menuItems){
            this.menuHeader=menuHeader;
            this.leadText=leadText;
            this.menuItems=menuItems;
        }
        // making a method that call printmenu. That print all the menu for os.

        public void printmenu(){
            System.out.println(menuHeader);   // to print the menuHeader.
            for (int i = 0; i <menuItems.length ; i++) { // use the for loop.
                if(menuItems[i]!=null){
                    System.out.println(i+".");
                    System.out.println(menuItems[i]);
                }
            }
            System.out.println(leadText);
        }
        // making another method,and we call the method read choice.In this method we make sure to make user
        // to enter his choice and read the choice.
        public int readChoice(){
            Scanner input=new Scanner(System.in);
            while(!input.hasNextInt()){
                System.out.println("\n It has to be between 1,2,3,and 9");
                System.out.println("Tray aging");
                System.out.println(menuHeader);
                for (int i = 0; i <menuItems.length ; i++) {
                    if(menuItems[i]!=null){
                        System.out.println(i+".");
                        System.out.println(menuItems[i]);
                    }
                }
                System.out.println(leadText);// to print the lead text one more timeinput.nextLine();   // give the chance to user enter his or her choice.
            }
            return input.nextInt();  // return the user input if its legal.

        }




}
