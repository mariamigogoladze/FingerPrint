package org.example;


import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;


public class SavePng {

    public void saveImg(File dir, BufferedImage img) throws FileNotFoundException {
        File outputfile = new File(dir + File.separator + System.currentTimeMillis()+".png");
        System.out.println("Saving image to dir " + dir.getAbsolutePath());

        try {
            ImageIO.write(img, "png", outputfile);
            Decryption decryption = new Decryption();
            decryption.dec(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
