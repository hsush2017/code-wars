package org.example;

import java.util.List;

public class PaginationHelper<I> {
    private final List<I> collection;
    private final int itemsPerPage;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    public int itemCount() {
        return collection.size();
    }

    public int pageCount() {
        return (itemCount() / itemsPerPage) + (itemCount() % itemsPerPage > 0 ? 1 : 0);
    }

    public int pageItemCount(int pageIndex) {
        int index = pageIndex + 1;

        if (index <= 0 || index > pageCount()) {
            return -1;
        }

        return Math.min(itemsPerPage * index, itemCount()) - itemsPerPage * pageIndex;
    }

    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemCount() == 0) {
            return -1;
        }

        return itemIndex >= itemCount() ? -1 : itemIndex / itemsPerPage;
    }
}
