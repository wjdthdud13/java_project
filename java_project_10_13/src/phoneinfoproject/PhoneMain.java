package phoneinfoproject;

import java.util.Scanner;
public class PhoneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneInfoUI ui = new PhoneInfoUI();
        int menu =0;

        while(true) {
            ui.intro();
            try {
                menu = sc.nextInt();
                sc.nextLine();

                if(menu<Menu.INSERT_PHONE_INFO || menu > Menu.QUIT_PROGRAM) {
                    throw new MenuChoiceException(menu);
                }

                switch(menu) {
                    case Menu.INSERT_PHONE_INFO :
                        ui.insert();
                        break;
                    case Menu.SEARCH_PHONE_INFO :
                        ui.search();
                        break;
                    case Menu.DELETE_PHONE_INFO :
                        ui.delete();
                        break;
                    case Menu.SHOW_ALL_PHONE_INFO :
                        ui.showAllPhoneInfo();
                        break;
                    case Menu.QUIT_PROGRAM :
                        ui.quitProgram();
                        return;
                }
            } catch(MenuChoiceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}