package com.width;

import java.util.Set;

public class MyCrawler {
	
	private void initCrawlerWithSeeds(String [] seeds){
		for(int i=0; i<seeds.length; i++)
			LinkQueue.addUnVisitedUrl(seeds[i]);
	}
	
	public void crawling(String [] seeds){
		LinkFilter filter = new LinkFilter(){
			@Override
			public boolean accept(String url) {
//				if(url.startsWith("lvmama.com"))
					return true;
//				else
//					return false;
			}
			
		};
		initCrawlerWithSeeds(seeds);
		
		while(!LinkQueue.unVisitedUrlsEmpty() && LinkQueue.getVisitedUrlNum() <=1000){
			String visitUrl = (String) LinkQueue.unVisitedUrlDeQueue();
			if(visitUrl == null)
				continue;
			DownLoadFile downLoader = new DownLoadFile();
			downLoader.downLoadFile(visitUrl);
			
			LinkQueue.addVisitedUrl(visitUrl);
			
			Set<String> links = HtmlParserTool.extracLinks(visitUrl, filter);
			
			for(String link : links){
				LinkQueue.addUnVisitedUrl(link);
			}
		}
	}
	
	public static void main(String [] args){
		MyCrawler crawler = new MyCrawler();
		crawler.crawling(new String[]{"http://www.lvmama.com"});
	}

}
