package com.github.alexeyzausalin.springguides.gsconsumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URL;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    private String id;
    private URL url;
    private String title;
    private String publisher;
    private String country;

    public Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", url=" + url +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
