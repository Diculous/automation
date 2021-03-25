package fundamentals;

import java.time.Month;
import java.util.*;

public class GreetingsUser {

    public static void main(String[] args) {

        // MAIN TASK

       System.out.println("Enter your name");
       Scanner scanner = new Scanner(System.in);           // First subtask
       String name = scanner.nextLine();
       System.out.println("Hello " + name + "!");

       String[] temp = args.clone();                        // Second subtask
       Collections.reverse(Arrays.asList(temp));
       Arrays.stream(temp).forEach(System.out::println);

       System.out.println("Enter number of elements");          // Third subtask
       Scanner secondScanner = new Scanner(System.in);
       int numberOfElements = Integer.parseInt(secondScanner.nextLine());

       for (int i = 0; i < numberOfElements; i++) {
           System.out.println(Math.random());
       }
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(Math.random() + " ");
        }

        System.out.println( "Args summ is - " + Arrays.stream(args).mapToInt(Integer::parseInt).sum());         // Forth subtask

        System.out.println(" Enter the month number ");                             // Fifth subtask
        try {
            Scanner scanner3 = new Scanner(System.in);
            int month = Integer.parseInt(scanner3.nextLine());
            if (1 <= month && month <= 12) {
                System.out.println(Month.of(month));
            } else {
                System.out.println("Wrong month number!");
            }
        }
        catch (NumberFormatException e ) {
            System.out.println("Incorrect data, try to enter int value from 1 to 12");
        }

        //OPTIONAL FIRST

        List<String> list = new ArrayList<>();
        System.out.println("Matrix scale");
        Scanner optionalScanner = new Scanner(System.in);
        String length = optionalScanner.nextLine();
        System.out.println("Numbers");
        for (int i = 0; i < Integer.parseInt(length); i++) {
           list.add(optionalScanner.nextLine());
        }
        list.sort(Comparator.comparing(String::length));
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));

        list.forEach(System.out::println);
        System.out.println();
        list.sort(Comparator.comparing(String::length).reversed());
        list.forEach(System.out::println);
        System.out.println();

        double summ = list.stream().mapToDouble(String::length).sum()/list.size();
        System.out.println(summ);
        System.out.println();
        list.stream().filter(s -> s.length() < summ).forEach(ss -> System.out.println(ss + " " + ss.length()));
        System.out.println();
        list.stream().filter(s -> s.length() > summ).forEach(ss -> System.out.println(ss + " " + ss.length()));

        //OPTIONAL SECOND

        System.out.println("Matrix scale");
        Scanner secondOptionalScanner = new Scanner(System.in);
        Random random = new Random();
        int scale = Integer.parseInt(secondOptionalScanner.nextLine());
        int bound = Integer.parseInt(secondOptionalScanner.nextLine());

        int[][] matrix = new int[scale][scale];
        for (int i = 0; i < scale; i++) {
            for (int j = 0; j < scale; j++) {
                matrix[i][j] = -bound + random.nextInt(2*bound + 1);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Arrays.stream(matrix).forEach(System.out::println);

        int max = matrix[0][0];
        for (int i = 0; i < scale; i++) {
            for (int j = 0; j < scale; j++) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.println("MAX - " + max);

        ArrayList<Integer> remove = new ArrayList<>();
        for (int i = 0; i < scale; i++) {
            for (int j = 0; j < scale; j++) {
                if (matrix[i][j] == max) {
                    remove.add(i);
                }
            }
        }

        ArrayList<int[]> newMatrixList = new ArrayList<>();
        for (int i = 0; i < scale; i++) {
            if (!remove.contains(i)) {
                newMatrixList.add(matrix[i]);
            }
        }
        System.out.println("Remove");
        System.out.println(remove.toString());
        System.out.println("New Array");
        System.out.println(newMatrixList.toString());

    }
}