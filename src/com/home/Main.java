package com.home;

public class Main {

    public static void main(String[] args) {

        double myFirstValue = 20d;
        double mySecondValue = 80d;
        double myTotalValue = (myFirstValue + mySecondValue) * 100d;
        System.out.println("myTotalValue=" + myTotalValue);
        double myRemindValue = myTotalValue % 40d;
        System.out.println("myRemindValue=" + myRemindValue);
        boolean isReminder = (myRemindValue == 0) ? true : false;
        System.out.println("Boolean Reminder Value is " + isReminder);
        if (!isReminder) {
            System.out.println("Got Some Reminder");
        }
    }
}
