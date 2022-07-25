//package org.example;
//
//import sun.misc.BASE64Encoder;
//
//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
//import java.io.*;
//
//public class Encryption {
//  public void enc(File dir, BufferedImage img) throws FileNotFoundException, IOException {
//    ByteArrayOutputStream bos = new ByteArrayOutputStream();
//    String ret = null;
//    File outputfile = new File(dir + File.separator + System.currentTimeMillis() + ".png");
//
//    try {
//      byte[] bytes = bos.toByteArray();
//      BASE64Encoder encoder = new BASE64Encoder();
//      FileOutputStream.write(img, "png", outputfile);
//      ret = encoder.encode(bytes);
//      ret = ret.replace(System.lineSeparator(), "");
//    } catch (IOException e) {
//      throw new RuntimeException();
//    }
//  }
//}
