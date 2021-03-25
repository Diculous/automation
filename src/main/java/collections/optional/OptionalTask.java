package collections.optional;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OptionalTask {
    public static void main(String[] args) {
       // 1
        List<String> stringList = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/collections/optional/files/in.txt"));
            stringList = bufferedReader.lines().collect(Collectors.toList());
            Collections.reverse(stringList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/collections/optional/files/out.txt"));
            if (stringList != null) {
                for (String s : stringList) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //4
        List<String> poem = new ArrayList<>();
        poem.add("Зима!.. Крестьянин, торжествуя,");
        poem.add("На дровнях обновляет путь;");
        poem.add("Его лошадка, снег почуя,");
        poem.add("Плетется рысью как-нибудь;");
        poem.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        //5
        if (stringList != null) {
            ArrayList<String> arrayList = new ArrayList<>(stringList);
            Collections.sort(arrayList);
            arrayList.forEach(System.out::println);
        }
    }
}
