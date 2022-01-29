package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory implements Iterable<String> {
  private List<String> urls = new ArrayList<>();

  public void push(String url) {
    urls.add(url);
  }

  public String pop() {
    return urls.remove(urls.size() - 1);
  }

  @Override
  public Iterator<String> createIterator() {
    return new ListIterator(this);
  }

  /**
   * An inner class so we can access private properties of {@link BrowseHistory}
   */
  private class ListIterator implements Iterator<String> {
    private BrowseHistory browseHistory;
    private int index;

    public ListIterator(BrowseHistory browseHistory) {
      this.browseHistory = browseHistory;
    }

    @Override
    public boolean hasNext() {
      return index < browseHistory.urls.size();
    }

    @Override
    public String current() {
      return browseHistory.urls.get(index);
    }

    @Override
    public void next() {
      index++;
    }

  }
}
