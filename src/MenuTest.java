public class MenuTest {
    public static void main(String[] args) { // her we run the whole programme. we make a method it calls run
        run();
    }
    public static  void run(){
        String[] menuItem=new String[10];
        menuItem[1]="Choice one";
        menuItem[2]="Choice two";
        menuItem[3]="Choice three";
        menuItem[9]="quit";
        // Now we use the constructor that we made in the Menu class.To print the menu and soo on.
        Menu menu=new Menu("MENU","Please choice",menuItem);
        menu.printmenu(); // we call the method that we did in the menu class, and we call the printmenu.
        int choice= menu.readChoice();
        boolean checkchoice; // I need this boolean beacuse i will use it in the do while loop
        // If the user enter something that is not 1,2,3 or 9 have to aske the usr
        // to enter another to tray agin.

        do {
            switch (choice){
                case 1:
                    System.out.println("You choice one");
                    checkchoice=true;
                    break;
                case 2:
                    System.out.println("You choice two");
                    checkchoice=true;
                    break;
                case 3:
                    System.out.println("You choice three ");
                    checkchoice=true;
                    break;
                case 9:
                    System.out.println("Ypu choice quit");
                    checkchoice=true;
                    break;

                default:
                    System.out.println("\n has to be  bewteen the 1, 2, 3 or 9 ");
                    System.out.println("Tray agin");// write a nother massage that saying the user have to enter agin
                    menu.printmenu(); // this is the method that we used to make sure to print the menu agin.
                    choice= menu.readChoice(); // this is the other method that should to run the whole programme.
                    checkchoice=false;

            }

        } while (!checkchoice);


    }
}


