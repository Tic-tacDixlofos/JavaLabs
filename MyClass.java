import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        BufferedReader box = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Heads or Tails");
        String mon = "";
        try {
            mon = box.readLine();
        } catch (Exception e) {
            System.out.println("Reading error! " + e);
        }


        System.out.println("U choose |" + mon + '|');


        String[] card = {"Heads", "Tails"};
        String randomSide = new String(card[(new Random()).nextInt(2)]);

        if (randomSide.equals(mon)) {
            System.out.println("U win");
        } else {
            System.out.println("U loose");
        }
    }
}