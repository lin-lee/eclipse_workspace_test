package com.examples;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FileCrawler implements Runnable{
	private final BlockingQueue<File> fileQueue = new LinkedBlockingQueue<File>(6);
	private final FileFilter fileFilter = new FileFilter(){
			public boolean accept(File pathname) {
				return false;
			}
		};
	private final File root = new File("m");
	
	public void run() {
		try{
			crawl(root);
		}catch(InterruptedException e){
			Thread.currentThread().interrupt();
		}
		
	}
	private void crawl(File root) throws InterruptedException{
		File[] entries = root.listFiles(fileFilter);
		if(entries != null){
			for(File entry : entries)
				if(entry.isDirectory())
					crawl(entry);
				else if(!alreadyIndexed(entry))
					fileQueue.put(entry);
		}
	}
	private boolean alreadyIndexed(File file){
		return false;
	}

}
