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

        System.out.println("/n === Branching ===");
        System.out.println(" 1. create a branch ");
        System.out.println(" - git branch [branch name]");
        System.out.println(" 2. switch to branch ");
        System.out.println(" - git checkout [branch name]");
        System.out.println("              OR         ");
        System.out.println(" - git switch [branch name]");
        System.out.println("--- Steps 1 & 2 can be done with one command: ");
        System.out.println(" - git checkout -b [branch name] ");
        System.out.println(" - git switch -c [branch name]");
        
    }
}
