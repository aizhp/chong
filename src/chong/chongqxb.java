package chong;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * qixin.com
 * 启信宝爬虫 抓取公司名称和电话号码
 * @author Administrator
 *
 */
public class chongqxb {
	public static void main (String[] args) throws IOException {  
        
		for(int i=1;i<=20;i++){
        Document doc=Jsoup.connect("http://www.qixin.com/search/prov/SC_5101?page="+i).get();  
        Elements es = doc.select("div.search-result-desc");
        Elements es1 = es.select("a.search-result-title");
        for(Element ht:es1){
        	String htt=ht.attr("abs:href");
        	Document htm = Jsoup.connect(htt).get();
//        	System.out.println(htm);
        	String mc = htm.select("h2").text();
        	System.out.print(mc+"+");
//        	
        	String nr = htm.select("div.company-info-item-text").text();
        	
        	System.out.println(nr);
        	
        	
        		}
        System.out.println("****************这是第"+i+"页****************");
			}
		} 	
   }   
