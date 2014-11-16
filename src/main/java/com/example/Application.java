package com.example;

/**
 * User: jeff.swope
 * Date: 11/16/2014
 * Time: 2:42 PM
 */
public class Application {
    public static void main(String[] args) {
        final ResourceReader resourceReader = new ResourceReader();
        System.out.println("Main application read: " + resourceReader.readTextResource());
    }
}
