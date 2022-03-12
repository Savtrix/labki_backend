package com.company;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) {
/*
        File file = new File("file");
        File write  = new File("write");
        int length = (int) file.length();

        try (
                FileInputStream stream = new FileInputStream(file);
                InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);
                FileWriter writer = new FileWriter(write)
        ){
            char[] data = new char[length];
            int readBytes = reader.read(data, 0, length);
            if(readBytes != length){
                throw new IOException("File reading Error");
            }
            String text = new String(data);
            System.out.println(text);



        }
        catch (IOException e) {
            e.printStackTrace();
        }

 */
        byte[] data;
        try{
            data = Files.readAllBytes(Paths.get("file"));
            String text = new String(data);
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        try (FileWriter writer = new FileWriter(write)){


            BufferedReader reader_two = new BufferedReader(
                    new InputStreamReader(System.in));
            String textWrite = reader_two.readLine();

            writer.write(textWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }

         */
    }


}

