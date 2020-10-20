package hospital;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue <Patient> line = new LinkedList<>();
        System.out.print("Enter the number of patients: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String name;
        String sex;

        for(int i = 1; i <= n; i++)
        {
            System.out.println("["+"#"+i+"]");
            System.out.print("Enter the name of patient: ");
            name = scanner.next();
            System.out.print("Enter the sex of patient: ");
            sex = scanner.next();
            line.add(new Patient(name, sex));
        }

        List <Patient> doctor = new ArrayList<>();

        int counter = 0;
        int counter_man = 0;
        int counter_woman = 0;

        while (!line.isEmpty())
        {
            doctor.add(line.remove());
            System.out.println(doctor.get(counter).getName());

            if(doctor.get(counter).getSex().equals("male"))
            {
                counter_man++;
            }
            else
            {
                counter_woman++;
            }

            counter++;
        }

        System.out.println("Man: " + counter_man);
        System.out.println("Woman: " + counter_woman);
    }
}
/*
В начале использовал Queue так как данный коллекция начинает возвращать первый елемет (то есть первый, который попал в очередь).
Потом использовал List, так как добавление просходит быстро, а операции происходят с текущим элементом и поиск делать не нужно.
 */