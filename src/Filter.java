import java.util.*;

public class Filter {
    public static void main(String[] args) {

        ArrayList<Laptop> list = new ArrayList<Laptop>();
        list.add(new Laptop(1, 2, 128, "Windows 10", "Сиреневый"));
        list.add(new Laptop(2, 4, 256, "Windows 11", "Красный"));
        list.add(new Laptop(3, 32, 512, "Windows 10", "Серый"));
        list.add(new Laptop(4, 16, 256, "Windows 11", "Черный"));

        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по OS");
        
        Scanner sc = new Scanner(System.in,"ibm866");
        Integer choice = sc.nextInt();
        if(choice == 1){

            System.out.printf("Введите значение ОЗУ: ");
            Integer ram = sc.nextInt();
            for (Laptop item: list)
            {
                if (item.ram>=ram)
                {System.out.println(item.toString());}
            }


        }
        if(choice == 2){

            System.out.printf("Введите значение SSD: ");
            Integer ssd = sc.nextInt();
                        for (Laptop item: list)
            {
                if (item.ssd>=ssd)
                {System.out.println(item.toString());}
            }

        } if(choice == 3){

            System.out.println("Введите название OS: \n Windows 10 \n Windows 11 ");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            for (Laptop item: list)
            {
                if ((item.os).equals(os))
                {System.out.println(item.toString());}
            }
        }

        sc.close();
    }

}
