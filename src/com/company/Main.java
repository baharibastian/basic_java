package com.company;

public class Main {

    public static int tambah(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Project a = new Project("Sistem Informasi Perizinan",8);
        a.setProjectManager("Bahari Bastian");
        System.out.println("Nama Project : "+ a.getProjectName());
        System.out.println("Durasi Waktu : "+ a.getDurationProject() + " Bulan");
        System.out.println("Project Manager : "+ a.project_manager);
    }
}
