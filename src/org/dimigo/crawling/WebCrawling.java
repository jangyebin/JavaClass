package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrawling {
    public static void main(String[] args) {
        try {
            Document Doc = Jsoup.connect("https://youtu.be/p9amSmxx4sQ").get();
            Elements result = Doc.select("title");
            List<String> list = result.eachText();

            int i = 0;
            for(String title : list){
                    System.out.printf("%d. %s\n", i++, title);
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
