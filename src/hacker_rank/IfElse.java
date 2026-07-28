package hacker_rank;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        canVoteIf();
    }

    public static void simpleIf() {
        if (2 > 1) {
            System.out.println("Yes");
        }
    }

    public static void simpleVariable() {
        int age = 80;
        if (age >= 70) {
            System.out.println("yes");
        }
    }

    public static void canVote() {
        int age = 40;
        if (age > 60) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Can Not Vote");
        }
    }

    public static void AndTwoCondition() {
        int age = 12;
        boolean citizen = true;
        if (age >= 18 && citizen == true) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Can Not Vote");
        }
    }

    public static void orTwoCondition() {
        int marks = 60;
        boolean sportQuota = true;
        if (marks <= 50 || sportQuota != false) {
            System.out.println("Can Participate");
        } else {
            System.out.println("Participation Cancelled");
        }
    }

    public static void comboCondition() {
        int age = 30;
        boolean India = false;
        boolean Nepal = false;

        if (age >= 20 && (India || Nepal)) {
            System.out.println("Allowed");
        } else {
            System.out.println("Not Allowed");

        }
    }

    public static void scholarshipEligibility() {
        int marks = 95;
        int attendance = 70;
        boolean sportsQuota = false;
        boolean banned = false;

        if (marks >= 85 && (attendance >= 75 || sportsQuota) && !banned) {
            System.out.println("Scholarship Approved");
        } else {
            System.out.println("Rejected");

        }
    }

    public static void canVoteIf() {
        Scanner pc = new Scanner(System.in);

        System.out.println("Tell Your Age");
        int age = pc.nextInt();

        if (age >= 18) {
            System.out.println("Can Vote");
        } else {
            System.out.println("can not Vote");
        }
    }


    public static void stdinStdOutIfElseMultipleCondition() {
        Scanner pt = new Scanner(System.in);

        System.out.println("Enter Your Age");
        int age = pt.nextInt();

        System.out.println("Enter Your Attendance ");
        int attendance = pt.nextInt();

        System.out.println("SportQuota - true/false");
        boolean sportQuota = pt.nextBoolean();

        System.out.println("Banned - true/false");
        boolean banned = pt.nextBoolean();

        if (age >= 18 && (attendance > 75 || sportQuota) && !banned) {
            System.out.println("Approved");

        } else {

            System.out.println("Unapproved");

        }
    }

    public static void nestedIf() {
        Scanner kk = new Scanner(System.in);

        System.out.println("Enter Your Age");
        int age = kk.nextInt();

        System.out.println("licence- true/false");
        boolean licence = kk.nextBoolean();

        if (age >= 18) {
            System.out.println("Adult");

            if (licence) {
                System.out.println("Can Drive");
            } else {
                System.out.println("Can not Drive");
            }

        } else {
            System.out.println("Minor");

        }
    }

    public static void elseIf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell Me Your Marks");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade 'A'");
        } else if (marks >= 70) {
            System.out.println("Grade 'A'");

        } else if (marks >= 50) {
            System.out.println("'C'");
        } else {
            System.out.println("Fail");
        }
    }
}







