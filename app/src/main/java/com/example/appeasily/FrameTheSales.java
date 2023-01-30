package com.example.appeasily;

public class FrameTheSales {
    int sales_images ;
    String sales_text ;


    public FrameTheSales() {
    }

    public FrameTheSales(int sales_images, String sales_text) {
        this.sales_images = sales_images;
        this.sales_text = sales_text;
    }

    public int getSales_images() {
        return sales_images;
    }

    public void setSales_images(int sales_images) {
        this.sales_images = sales_images;
    }

    public String getSales_text() {
        return sales_text;
    }

    public void setSales_text(String sales_text) {
        this.sales_text = sales_text;
    }


}
