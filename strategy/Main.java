package strategy;

public class Main {
  public static void main(String[] args) {
    var imageStorage1 = new ImageStorage(new JPEGCompressor(), new BWFilter());
    imageStorage1.store("image1.jpeg");
    var imageStorage2 = new ImageStorage(new PNGCompressor(), new RGBFilter());
    imageStorage2.store("image2.png");
  }
}
