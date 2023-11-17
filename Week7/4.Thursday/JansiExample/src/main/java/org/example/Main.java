package org.example;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;

public class Main {
    public static void main(String[] args) {
        System.setProperty("jansi.passthrough", "true");
        AnsiConsole.systemInstall();

        System.out.println(ansi().fg(Ansi.Color.CYAN).a("**************************************").reset());

        AnsiConsole.systemUninstall();
    }
}