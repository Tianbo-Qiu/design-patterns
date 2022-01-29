package strategy;

public class BWFilter implements Filter {
	@Override
    public void filter() {
      System.out.println("filtered by the black & white filter");
	}
}
