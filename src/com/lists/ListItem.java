package com.lists;

/**
 * Created by RENT on 2017-05-23.
 */
public class ListItem {
    private ListItem previous;
    private Object data;

    public ListItem getPrevious() {
        return previous;
    }

    public Object getData() {
        return data;
    }

    public ListItem(ListItem previous, Object data) {
        this.previous = previous;
        this.data = data;
    }


}




