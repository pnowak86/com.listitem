package com.lists;

/**
 * Created by RENT on 2017-05-23.
 */
public class ListItemPlus {
    private ListItemPlus previous;
    private ListItemPlus next;
    private Object data;

    public ListItemPlus getPrevious() {
        return previous;
    }

    public ListItemPlus getNext() {
        return next;
    }

    public Object getData() {
        return data;
    }

    public ListItemPlus(ListItemPlus previous, ListItemPlus next, Object data) {
        this.previous = previous;
        this.next = next;
        this.data = data;
    }
}
