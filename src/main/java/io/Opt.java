package io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Opt {

    public static void main(String[] args) {

        //Optional 1


        try {
            boolean file = new File("h://out.txt").createNewFile();
            FileWriter fileWriter = new FileWriter("h://out.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < 10; i++) {
                bufferedWriter.write(String.valueOf((int) (Math.random()*1000)));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("h://out.txt"));
            int[] array = bufferedReader.lines().mapToInt(Integer::parseInt).sorted().toArray();
            BufferedWriter sortedBufferedWriter = new BufferedWriter(new FileWriter("h://out.txt"));
            Arrays.stream(array).forEach(i -> {
                try {
                    sortedBufferedWriter.write(String.valueOf(i));
                    sortedBufferedWriter.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            sortedBufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Optional 2

        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("src//Base.java"));
            BufferedWriter sortedBufferedWriter2 = new BufferedWriter(new FileWriter("h://out2.java"));
            bufferedReader2.lines().forEach(s -> {
                if (!s.contains("class")) {
                    String replace = s.replace("public", "private");
                    try {
                        sortedBufferedWriter2.write(replace);
                        sortedBufferedWriter2.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    try {
                        sortedBufferedWriter2.write(s);
                        sortedBufferedWriter2.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });

            sortedBufferedWriter2.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Optional 3

        try {
            BufferedReader bufferedReader3 = new BufferedReader(new FileReader("src//Base.java"));
            BufferedWriter sortedBufferedWriter3 = new BufferedWriter(new FileWriter("h://out3.java"));
            List<StringBuilder> stringBuilderList = new ArrayList<>();
            bufferedReader3.lines().forEach(s -> stringBuilderList.add(new StringBuilder(s).reverse()));
            stringBuilderList.forEach(s -> {
                try {
                    sortedBufferedWriter3.write(s.toString());
                    sortedBufferedWriter3.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            sortedBufferedWriter3.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
