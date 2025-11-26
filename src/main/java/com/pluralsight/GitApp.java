package com.pluralsight;

public class GitApp {
    public static void main(String[] args) {
        System.out.println("Let's Practice Git Bash Terminal Usage");
        System.out.println("/n ==== Set Up Project ====");
        System.out.println(" - git init");
        System.out.println(" - git add . ");
        System.out.println(" - git commit -m 'commit message inside double quotes' ");
        System.out.println(" - git remote add origin [url]");
        System.out.println(" - git push origin main");

        System.out.println("/n === Ongoing Workflow === ");
        System.out.println("update (edit, add, or delete) code");
        System.out.println(" - git add . ");
        System.out.println(" - git commit -m 'commit message inside double quotes' ");
        System.out.println(" - git push origin main");

        System.out.println("/n === Verification ===");
        System.out.println(" - git status");
        System.out.println(" - git log --oneline ");
    }
}
