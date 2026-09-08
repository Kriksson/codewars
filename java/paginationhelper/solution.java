package codewars.java.paginationhelper;

import java.util.List;


public class PaginationHelper<I> {
  private List<I> collection;
  private int itemsPerPage;

  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
  }

  public int itemCount() {
    return collection.size();
  }

  public int pageCount() {
    return (int) Math.ceil(((double) collection.size() / (double) itemsPerPage));
  }
  

  public int pageItemCount(int pageIndex) {
    if (!(pageIndex >= 0 && pageIndex < pageCount())) return -1;
    if (pageIndex == pageCount() - 1) {
      if (collection.size() % itemsPerPage == 0) {
        return itemsPerPage;
      } else return collection.size() % itemsPerPage;
    } else return itemsPerPage;
  }

  public int pageIndex(int itemIndex) {
    if (itemIndex >= itemCount() || itemIndex < 0) {
      return -1;
    } else {
      return itemIndex / itemsPerPage;
    }
  }
}