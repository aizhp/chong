package chong;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class jsoup {
	public static void main (String[] args) throws IOException {  
        
        Document doc=Jsoup.connect("http://chengdu.baixing.com/search/?category=gongzuo&page=1").get();  
        
        Elements es = doc.select("div.table-view-body a");
        Elements ess=es.select("a.ad-title");
    	//System.out.println(ht);  //ȡֵ Ϊ ����  a��ǩ class  Ϊ ad-title' �� <a ----</a>
        for(Element ht:ess){
        	String htt=ht.attr("href");
        	Document htm = Jsoup.connect(htt).get();
        	System.out.println(htm); 
        	
        }
        
    		
    }   
}
