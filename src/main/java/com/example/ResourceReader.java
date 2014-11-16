package com.example;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * User: jeff.swope
 * Date: 11/16/2014
 * Time: 2:28 PM
 */
public class ResourceReader {
    public String readTextResource() {
        final InputStream inputStream = this.getClass().getResourceAsStream("/textresource.txt");
        if (inputStream != null) {
            try {
                return IOUtils.toString(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Could not find resource.");
            return null;
        }
    }
}
