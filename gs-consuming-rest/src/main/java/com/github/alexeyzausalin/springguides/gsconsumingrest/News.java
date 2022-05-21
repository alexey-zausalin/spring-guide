package com.github.alexeyzausalin.springguides.gsconsumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class News {

    private int totalItems;
    private int endIndex;
    private int startIndex;
    private int itemsPerPage;
    private Item[] items;

    public News() {
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "News{" +
                "totalItems=" + totalItems +
                ", endIndex=" + endIndex +
                ", startIndex=" + startIndex +
                ", itemsPerPage=" + itemsPerPage +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
