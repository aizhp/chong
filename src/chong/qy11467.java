//http://m.11467.com/chengdu/dir/g-p1.htm

package chong;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class qy11467 {
	public static void main (String[] args) throws IOException {  
        try {
			
		
		for(int i=2;i<=3;i++){
        Document doc=Jsoup.connect("http://m.11467.com/chengdu/dir/g-p"+i+".htm")
        		.header("Accept-Encoding", "gzip, deflate")  
        	    .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:23.0) Gecko/20100101 Firefox/23.0")  
        	    .maxBodySize(0)  
        	    .timeout(600000)  
        	    .get();
        Elements es = doc.select("h4");
//        Elements es1 = es.select("li.sup-name");
        for(Element ht:es){
        	Element link = ht.select("a").first();
        	String htt=link.attr("abs:href");
        	Document htm = Jsoup.connect(htt)
        			.header("Accept-Encoding", "gzip, deflate")  
        		    .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:23.0) Gecko/20100101 Firefox/23.0")  
        		    .maxBodySize(0)  
        		    .timeout(600000)  
        		    .get();
        	Elements htc = htm.select("dl.codl");
        	Elements links = htm.getElementsByTag("dd");
        	System.out.print(link.text()+" ");//公司名称
        	System.out.println(links.text());
        	
        	
             
//        	String mc = htb.select("ul").text();
//        	System.out.println(mc);
//        	System.out.println("类别"+kind.text());
//        	String nr = htm.select("div.company-info-item-text").text();      	
//        	System.out.println(nr);
//        	
        	
        		}
        System.out.println("****************这是第"+i+"页****************");
			}
        } catch (Exception e) {
        		e.printStackTrace();
        }
		} 	
    }   
