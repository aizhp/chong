package chong;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Joke {

	public static void main(String[] args) throws IOException {
		int x = 24511;
		int y = 1;
		for(int i=818;i<=1000;i++){
			Document doc = Jsoup.connect("http://xhkong.com/mobile/list-1-"+i+".html").timeout(15000).get();
			Elements doc1 = doc.select("article.xhk-list");
			for(Element doc2 : doc1){
				Elements bt = doc2.select("header.title");
				Elements nr = doc2.select("div.con");
				//System.out.println(bt.text());
				System.out.print(y+++".");
//				System.out.println(nr.text());
				
				System.out.println();
				
				//写入TXT文件
				FileWriter fw = null;
				try {

					//如果文件存在，则追加内容；如果文件不存在，则创建文件
				File f=new File("G:\\1-1000ye.txt");
				fw = new FileWriter(f, true);
				} catch (IOException e) {
				e.printStackTrace();
				}
				PrintWriter pw = new PrintWriter(fw);
				pw.println(x+++"."+bt.text()+"\r\n"+nr.text()+"\r\n");
				pw.flush();
				try {
				fw.flush();
				pw.close();
				fw.close();
				} catch (IOException e) {
				e.printStackTrace();
				}
				
				
			}
			
	}
	}
	
	

}
