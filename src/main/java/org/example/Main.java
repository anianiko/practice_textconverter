package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            try{
                File file = new File("text.txt");
                Scanner scanner = new Scanner(file);
                String fileContent = "";

                while (scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    fileContent += line + "\n";
                }
                char[] charString = fileContent.toCharArray();

                for (int i = charString.length - 1; i >= 0; i--) {
                    char character = charString[i];

                    if (Character.isUpperCase(character)) {
                        charString[i] = Character.toLowerCase(character);
                    } else {
                        charString[i] = Character.toUpperCase(character);
                    }
                    System.out.print(charString[i]);
                }

                System.out.println(fileContent);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

    }
}