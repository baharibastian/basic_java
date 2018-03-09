package com.company;

public class Parkir {
    public static String tujuan;

    public static void parkirMana(int total_roda) {
        if (total_roda <= 2) {
            Parkir.tujuan = "Parkir Sebelah Kiri Bang";
        } else if (total_roda > 2 && total_roda <= 4) {
            Parkir.tujuan = "Parkir Sebelah Kanan Bang";
        } else if (total_roda > 4) {
            Parkir.tujuan = "Parkir Di Bawah Bang";
        } else {
            Parkir.tujuan = "Parkir Gak Tersedia Bang";
        }
    }

    public String getTujuan() {
        return tujuan;
    }

    public static void main(String[] args) {
        parkirMana(5);

        System.out.println("Tempat " +tujuan);
    }
}
