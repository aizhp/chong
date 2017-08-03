package chong;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class qiye56 {
	public static void main (String[] args) throws IOException {  
        
		for(int i=1;i<=2;i++){
        Document doc=Jsoup.connect("http://qiye.56ye.net/search.php?kw=&vip=0&type=0&catid=0&mode=0&areaid=284&size=0&mincapital=&maxcapital=&x=65&y=18&page="+i).get();  
        Elements es = doc.select("dd.show-info");
//        Elements es1 = es.select("li.sup-name");
        for(Element ht:es){
        	Element link = ht.select("a").first();
        	String htt=link.attr("abs:href");
        	Document htm = Jsoup.connect(htt).get();
        	Elements htc = htm.select("div.si-wrap");
        	Elements htb = htc.select("ul:contains(联系人)"); 
        	System.out.print(link.text()+" ");
        	System.out.println(htb.text());
//        	System.out.println(htb);
//        	String mc = htb.select("ul").text();
//        	System.out.println(mc);
//        	System.out.println("类别"+kind.text());
//        	String nr = htm.select("div.company-info-item-text").text();      	
//        	System.out.println(nr);
//        	
        	
        		}
        System.out.println("****************这是第"+i+"页****************");
			}
		} 	
    }   
