package org.example;

import java.awt.image.BufferedImage;
import java.io.*;


public class SavePng {

    public void saveImg(File dir, BufferedImage img) throws FileNotFoundException {
        File outputfile = new File(dir + File.separator + System.currentTimeMillis()+".png");
        System.out.println("Saving image to dir " + dir.getAbsolutePath());

        try {
            Encryption encryption = new Encryption();
            encryption.enc(outputfile,img);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
