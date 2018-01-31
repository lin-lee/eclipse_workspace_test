package one.three;

import java.io.FileNotFoundException;
import java.util.Map.Entry;
import java.util.Set;

import com.sleepycat.bind.EntryBinding;
import com.sleepycat.bind.serial.SerialBinding;
import com.sleepycat.collections.StoredMap;
import com.sleepycat.je.DatabaseException;

public class BDBFrontier extends AbstractFrontier implements Frontier {

	private StoredMap pendingUrisDB = null;
	//使用默认的路径和缓存大小构造函数
	public BDBFrontier(String homeDirectory) throws DatabaseException, FileNotFoundException{
		super(homeDirectory);
		EntryBinding keyBinding = new SerialBinding(javaCatalog, String.class);
		EntryBinding valueBinding = new SerialBinding(javaCatalog, CrawlUrl.class);
		pendingUrisDB = new StoredMap(database, keyBinding, valueBinding, true);
	}
	@Override
	public CrawlUrl getNext() throws Exception {
		CrawlUrl result = null;
		if(!pendingUrisDB.isEmpty()){
			Set entrys = pendingUrisDB.entrySet();
			System.out.println(entrys);
			Entry<String, CrawlUrl> entry =
					(Entry<String, CrawlUrl>)pendingUrisDB.entrySet().iterator().next();
			result = entry.getValue();
			delete(entry.getKey());
		}
		return result;
	}

	@Override
	public boolean putUrl(CrawlUrl url) throws Exception {
		put(url.getOriUrl(), url);
		return true;
	}
	//存入数据库的方法
	@Override
	protected void put(Object key, Object value) {
		pendingUrisDB.put(key, value);
	}
	//取出
	@Override
	protected Object get(Object key) {
		return pendingUrisDB.get(key);
	}
	//删除
	@Override
	protected Object delete(Object key) {
		return pendingUrisDB.remove(key);
	}
	
	//根据URL计算键值，可以使用各种压缩算法，包括MD5等压缩算法
	private String caculateUrl(String url){
		return url;
	}
	
	//测试函数
	public static void main(String [] args){
		try{
			BDBFrontier bBDBFrontier = new BDBFrontier("d:\\bdb");
			CrawlUrl url = new CrawlUrl();
			url.setOriUrl("http://www.163.com");
			bBDBFrontier.putUrl(url);
			
			System.out.println(bBDBFrontier.getNext().getOriUrl());
			bBDBFrontier.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
	}

}
