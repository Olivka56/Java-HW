import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Notebook n1 = new Notebook("acer", "silver", "windows 11", 8, 256, "intel core i7");
        Notebook n2 = new Notebook("acer", "pink", "windows 10", 8, 256, "intel core i5");
        Notebook n3 = new Notebook("lenovo", "black", "windows 11", 16, 528, "intel core i5");
        Notebook n4 = new Notebook("macbook", "silver", "macOS monterey", 16, 256, "m1");
        Notebook n5 = new Notebook("asus", "gold", "windows 7", 8, 128, "intel core i3");

        Set<Notebook> catalog = new HashSet<>();
        catalog.add(n1);
        catalog.add(n2);
        catalog.add(n3);
        catalog.add(n4);
        catalog.add(n5);

        System.out.println("Welcome to laptop store :)");
        System.out.println("Choose a parameter to find laptop: ");
        System.out.println("1. Brand");
        System.out.println("2. Color");
        System.out.println("3. OS");
        System.out.println("4. RAM");
        System.out.println("5. Disk size");
        System.out.println("6. CPU");
        System.out.print("> ");

        Scanner input = new Scanner(System.in);
        int param = input.nextInt();

        switch (param) {
            case 1:
                System.out.print("Enter brand: ");
                String brand = input.next().toLowerCase();
                for (Notebook notebook : catalog) {
                    if (brand.equals(notebook.getBrand())) {
                        notebook.print();
                    }
                }
                break;
            case 2:
                System.out.print("Enter color: ");
                String color = input.next().toLowerCase();
                for (Notebook notebook : catalog) {
                    if (color.equals(notebook.getColor())) {
                        notebook.print();
                    }
                }
                break;
            case 3:
                System.out.print("Enter OS: ");
                String os = input.next().toLowerCase();
                for (Notebook notebook : catalog) {
                    if (notebook.getOs().contains(os)) {
                        notebook.print();
                    }
                }
                break;
            case 4:
                System.out.print("Enter RAM: ");
                int ram = input.nextInt();
                for (Notebook notebook : catalog) {
                    if (ram == notebook.getRam()) {
                        notebook.print();
                    }
                }
                break;
            case 5:
                System.out.print("Enter disk size: ");
                int diskSize = input.nextInt();
                for (Notebook notebook : catalog) {
                    if (diskSize == notebook.getDiskSize()) {
                        notebook.print();
                    }
                }
                break;
            case 6:
                System.out.print("Enter CPU: ");
                String cpu = input.next().toLowerCase();
                for (Notebook notebook : catalog) {
                    if (notebook.getCpu().contains(cpu)) {
                        notebook.print();
                    }
                }
                break;
            default:
                System.out.println("Incorrect parameter");
                break;
        }
    }
}
