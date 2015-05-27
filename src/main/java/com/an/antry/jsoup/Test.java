package com.an.antry.jsoup;

import java.io.IOException;
import java.util.ListIterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {
    public static void main(String[] args) {
        Document doc;
        try {
            doc = Jsoup.connect("http://sina.com").get();
            String title = doc.title();
            Elements allElements = doc.getAllElements();
            ListIterator<Element> iter = allElements.listIterator();
            while (iter.hasNext()) {
                System.out.println(iter.next().nodeName());
            }
            System.out.println(title);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
