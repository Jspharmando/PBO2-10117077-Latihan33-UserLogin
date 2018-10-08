package com.company;

/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 **/

import java.util.Scanner;

public class Latihan33Login {
    private String usName;
    private String passWord;

        public static void main(String[] args) {
            Scanner baca = new Scanner(System.in);

            Latihan33Login user1 = new Latihan33Login();

            System.out.print("Masukkan Username\t: ");
            user1.usName = baca.next();
            System.out.print("Masukkan Password\t: ");
            user1.passWord = baca.next();

            User login = new User();
            login.pengecekanLogin(user1.usName, user1.passWord);

            System.out.println("");
        }
}
