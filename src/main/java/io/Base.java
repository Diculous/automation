package io;

import java.io.*;

public class Base {
    String level = "-";

    public void processFilesFromFolder(String path, BufferedWriter bufferedWriter) throws IOException {

            File mainFolder = new File(path);
            File[] fileList = mainFolder.listFiles();

            for (File file : fileList)
            {

                if (file.isDirectory())
                {
                    System.out.println("(folder)" + level + file.getName());
                    bufferedWriter.write("(folder)" + level + file.getName() + "\n");
                    level = level + "-";
                    processFilesFromFolder(file.getAbsolutePath(), bufferedWriter);
                    continue;
                }

                System.out.println("( file )" + level + file.getName());
                bufferedWriter.write("( file )" + level + file.getName() + "\n");
            }
            level = level.substring(0, level.length() - 1);

    }

    public void checkProcedure(String path) {
        if (path.endsWith(".txt")) {

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
                long count = bufferedReader.lines().count();
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(path));
                long files = bufferedReader2.lines().filter(s -> s.startsWith("( file )")).count();
                long folders = count - files;
                BufferedReader bufferedReader3 = new BufferedReader(new FileReader(path));
                double fullLength = 0;
                fullLength += bufferedReader3.lines().filter(s -> s.startsWith("( file )")).map(s -> s.substring(7)).mapToDouble(String::length).sum();

                System.out.println("All amount is " + count);
                System.out.println("Folders amount is " + folders);
                System.out.println("Files amount is " + files);
                System.out.println("Average amount of files in folder is " + (double) files / folders);
                System.out.println("Average string length is " + fullLength / files);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
        else {
            try {
                BufferedWriter sortedBufferedWriter = new BufferedWriter(new FileWriter("h://out3.txt"));
                sortedBufferedWriter.write(path + "\n");
                processFilesFromFolder(path, sortedBufferedWriter);
                sortedBufferedWriter.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        Base base = new Base();
        base.checkProcedure("h:\\Auto");
        base.checkProcedure("h:\\out3.txt");
    }
}