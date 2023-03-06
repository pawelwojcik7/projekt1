package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader1;
        int i=0;
        List<String> producents = new ArrayList<>();
        try {
            reader1 = new BufferedReader(new FileReader("src/main/resources/katalog.txt"));
            String line = reader1.readLine();
            System.out.println("Producent|Przekątna|Rozdzielczość|Rodzaj ekranu|Dotykowy|Procesor|Liczba rdzeni|MHz|RAM|Poj. dysku|Rodzaj dysku|Grafika|Pamięć graficzna|Nazwa systemu|Rodzaj napędu");
            System.out.println("\n");
            while (line != null) {
                i++;
                producents.add(Arrays.stream(line.split(";")).toList().get(0));
               String row = line.replace(';', '|');
                System.out.println(i+"|"+row);

                line = reader1.readLine();
            }

            reader1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n");

        System.out.println("Dell : " + Collections.frequency(producents, "Dell"));
        System.out.println("Asus : " + Collections.frequency(producents, "Asus"));
        System.out.println("Fujitsu : " + Collections.frequency(producents, "Fujitsu"));
        System.out.println("Huawei : " + Collections.frequency(producents, "Huawei"));
        System.out.println("MSI : " + Collections.frequency(producents, "MSI"));
        System.out.println("Samsung : " + Collections.frequency(producents, "Samsung"));
        System.out.println("Sony : " + Collections.frequency(producents, "Sony"));

    }
}