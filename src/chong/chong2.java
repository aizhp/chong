package chong;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class chong2 {
	public static void main (String[] args) throws IOException {  
        
		for(int i=1;i<=3;i++){
        Document doc=Jsoup.connect("http://www.haha365.com/zz_joke/index_"+i+".htm").get();  
        Elements es = doc.select("div.left");
        Elements es1= es.select("h3>*");
        for(Element ht:es){
        	String htt=ht.attr("abs:href");
        	Document htm = Jsoup.connect(htt).get();
        	
        	String mc = htm.select("h1").text();
        	System.out.println("Ц�����ƣ�"+mc);
        	
        	String nr = htm.select("div#endtext").text();
        	System.out.println("Ц�����ݣ�"+nr);
        	
        	
        		}
        System.out.println("****************���ǵ�"+i+"ҳ****************");
			}
		} 	
    }   



//Document htm = Jsoup.connect("http://qiye.youboy.com"+htt).get();
//��˾����
//String mc = htm.select(".gsinfocon span").text();
//System.out.print(mc);
//gslxr
//String lx = htm.select(".gslxr").text();
//System.out.println(lx);
