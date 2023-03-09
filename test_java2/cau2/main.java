package test_java2.cau2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        menu[] menus = new menu[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter title for menu " + (i + 1) + ": ");
            String title = scanner.nextLine();

            System.out.print("Enter URL for menu " + (i + 1) + ": ");
            String url = scanner.nextLine();

            menu menu = new menu(title, url);
            menus[i] = menu;
        }

        System.out.println("List of menus:");
        for (menu menu : menus) {
            menu.displayInfo();
            System.out.println();
        }

        }
    }

