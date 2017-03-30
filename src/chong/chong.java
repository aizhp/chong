package chong;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class chong {
	public static void main(String[] args) throws IOException {
		for(int i=1;i<=2;i++){
		 Document	doc = Jsoup.connect("http://qiye.youboy.com/cd/#page="+i)
				.header("Accept","*/*")//Accept:*/*
				.header("Accept-Encoding","gzip, deflate, sdch")
				//Accept-Encoding:gzip, deflate, sdch
				.header("Accept-Language","zh-CN,zh;q=0.8")//Accept-Language:zh-CN,zh;q=0.8
				.header("Connection","keep-alive")//Connection:keep-alive	 		 
				.header("Cookie","JSESSIONID=1f4nk6u1snrod1e6lcurm6nrur")
				//Cookie:JSESSIONID=1f4nk6u1snrod1e6lcurm6nrur
				.header("Host","qiye.youboy.com")//Host:qiye.youboy.com
				.header("Referer","http://qiye.youboy.com/cd/")
				//Referer:http://qiye.youboy.com/cd/
				.header("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36")
				//User-Agent:Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36
				.header("X-Requested-With","XMLHttpRequest").get();
		 		//X-Requested-With:XMLHttpRequest
		Elements es = doc.select(".dqscontit a");
		for(Element ht:es){
			//System.out.println("http://qiye.youboy.com"+e.attr("href"));
			String detail = ht.attr("abs:href");
			//org.jsoup.nodes.Document doc1 = Jsoup.connect(detail).get();
			System.out.println(detail);
			//String gong = doc1.select(".licon_left").text();
			//String xing = doc1.select(".gslxr").text();
			//System.out.print("公司名称："+gong+"             ");
			//System.out.println("其他信息："+xing);
		}
		System.out.println("****************这是第"+i+"页****************");
		}
	}

}
