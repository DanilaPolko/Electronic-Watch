package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hoursClock = seconds / 3600;
        int minutesClock = seconds / 60 - hoursClock * 60;
        int secondsClock = seconds - hoursClock * 3600 - minutesClock * 60;
        int hoursClockNext = (hoursClock >= 24) ? hoursClock - 24 * (seconds / 86400) : hoursClock;
        String secondsClockText = (secondsClock >= 10 ? "" : "0") + secondsClock;
        String minutesClockText = (minutesClock >= 10 ? "" : "0") + minutesClock;
        System.out.println(hoursClockNext + ":" + minutesClockText + ":" + secondsClockText);
    }
}

