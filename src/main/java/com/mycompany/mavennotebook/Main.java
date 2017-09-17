package com.mycompany.mavennotebook;

import java.io.IOException;
import asg.cliche.ShellFactory;

public class Main {
    public static void main(String[]args) throws IOException{
        Notebook commands = new Notebook();
        ShellFactory.createConsoleShell("Command", "Beginning", commands)
                .commandLoop();      
    }
}
    