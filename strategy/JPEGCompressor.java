package strategy;

public class JPEGCompressor implements Compressor {

	@Override
    public void compress() {
      System.out.println("compressed -JPEG");
	}
}
