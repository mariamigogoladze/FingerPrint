package org.example;

import java.io.*;

public class Decryption {
  public void dec(File dir) throws FileNotFoundException, IOException {
    System.out.println("Note : Encryption Key act as Password to Decrypt the same Image,otherwise it will corrupt the Image.");

    int key = 1;

    for (File child : dir.listFiles()) {

      FileInputStream fis = new FileInputStream(child);

      byte data[] = new byte[fis.available()];

      fis.read(data);
      int i = 0;

      for (byte b : data) {
        data[i] = (byte) (b ^ key);
        i++;
      }

      FileOutputStream fos = new FileOutputStream(child);

      fos.write(data);

      fos.close();
      fis.close();
      System.out.println("Encryption Done...");
    }
  }
}
