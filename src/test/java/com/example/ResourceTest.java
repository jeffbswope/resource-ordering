package com.example;

import org.junit.Test;

/**
 * User: jeff.swope
 * Date: 11/16/2014
 * Time: 2:49 PM
 */
public class ResourceTest {
    @Test
    public void testReadResource() {
        final ResourceReader resourceReader = new ResourceReader();
        System.out.println("Test run read: " + resourceReader.readTextResource());
    }
}
