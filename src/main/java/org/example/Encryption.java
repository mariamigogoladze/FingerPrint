package org.example;

import java.awt.image.BufferedImage;
import java.io.*;

public class Encryption {
  public void enc(File dir, BufferedImage img) throws FileNotFoundException, IOException {
    byte[] probeImage = Utils.getBytesFromBufferedImage(img);
    int key = 1;
    int i = 0;
    for (byte b : probeImage) {
      probeImage[i] = (byte) (b ^ key);
      i++;
    }
    try(FileOutputStream fos = new FileOutputStream(dir)){
      fos.write(probeImage);
      System.out.println("Encryption done");
    }
  }
}
