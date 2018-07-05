/**
 * 2018/5/24
 */

package com.cxing.iot.model.book;

/**
 * @author (changxu.xcx)
 * @version 1.0.0
 * @since 1.0.0
 */
public class Book {
    private String name;
    private int price;
    private String publish;

    public Book(String name, int price, String publish) {
        this.name = name;
        this.price = price;
        this.publish = publish;
    }

    public Book() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }
}
