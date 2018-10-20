package br.edu.ifpb;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {

    public static Formatter output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException se) {
            se.printStackTrace();
            System.exit(1);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            System.exit(1);
        }
    }

    public static void  addRecords () {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");
        while (input.hasNext()) {

            try {
                output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
            } catch (FormatterClosedException fce) {
                fce.printStackTrace();
            } catch (NoSuchElementException nsee) {
                nsee.printStackTrace();
                input.nextLine();
            }
            System.out.print("? ");
        }
    }

    public static void closeFile()
    {
        if (output != null)
            output.close();
    }
}
