package org.example;

import java.io.*;
import java.util.Arrays;

public class Decryption {
  public void dec(File dir) throws FileNotFoundException, IOException {
    // Note : Encryption Key act as Password to Decrypt the same Image,otherwise it will corrupt the Image

    int key = 1;

    String[] directories = dir.list(
            new FilenameFilter() {
              @Override
              public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory();
              }
            });
    System.out.println(Arrays.toString(directories));

    for (int i = 0; i < directories.length; ++i) {
      File originalDir = new File(String.valueOf(dir));
      dir = new File(dir + "/" +directories[i]);

      for (File child : dir.listFiles()) {

        FileInputStream fis = new FileInputStream(child);

        byte data[] = new byte[fis.available()];

        fis.read(data);
        int j = 0;

        for (byte b : data) {
          data[j] = (byte) (b ^ key);
          j++;
        }

        FileOutputStream fos = new FileOutputStream(child);

        fos.write(data);

        fos.close();
        fis.close();
      }
      dir = new File(String.valueOf(originalDir));
    }
  }
}
