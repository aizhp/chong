package chong;

import java.io.IOException;

import com.uu.http.client.HttpClient;
import com.uu.http.html.HTMLParser;
import com.uu.http.html.dom.Document;
import com.uu.http.html.dom.Element;
import com.uu.http.html.parser.Elements;

public class chong {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HttpClient hc = new HttpClient();
		for(int i=1;i<=5;i++){
		String list=hc.get("http://qiye.youboy.com/cd/#page="+i,"utf-8");
		Document doc = HTMLParser.parse(list);
		Elements es = doc.select(".dqscontit a");
		for(Element e:es){
			//System.out.println("http://qiye.youboy.com"+e.attr("href"));
			String detail = hc.get("http://qiye.youboy.com"+e.attr("href"),"utf-8");
			Document doc1 = HTMLParser.parse(detail);
			String gong = doc1.select(".licon_left").text();
			String xing = doc1.select(".gslxr").text();
			System.out.print("公司名称："+gong+"             ");
			System.out.println("其他信息："+xing);
		}
		
		System.out.println("****************这是第"+i+"页****************");
		}
	}

}
