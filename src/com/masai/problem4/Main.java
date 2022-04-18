package com.masai.problem4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the denomination to get size");

        int denom = input.nextInt();

        Size s = Currency.getSize(denom);

        s.getSize();

    }

}
