package strategy;

public class ImageStorage {
  private Compressor compressor;
  private Filter filter;

  public ImageStorage(Compressor compressor, Filter filter) {
    this.compressor = compressor;
    this.filter = filter;
  }

  public void store(String filename) {
    System.out.println("Compressing " + filename);
    compressor.compress();
    filter.filter();
  }
}
