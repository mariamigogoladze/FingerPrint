package org.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    SavePng savePng = new SavePng();
    File dir = new File("/home/mariami/Documents/untitled1/src/main/resources/pngs");
    BufferedImage image = ImageIO.read(new File("/home/mariami/Downloads/1658496338833.png"));
    savePng.saveImg(dir, image);

    Decryption decryption = new Decryption();
   // decryption.dec(dir);
    System.out.println("Hello world!");
  }
}
