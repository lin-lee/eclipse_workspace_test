package concurency;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class TaskWithResult implements Callable<String>{
	private int id;
	
	public TaskWithResult(int id){
		this.id = id;
	}
	@Override
	public String call(){
		return "result: " + id;
	}
}
class TaskWithResult2 implements Callable<String>{
	private int id;
	
	public TaskWithResult2(int id){
		this.id = id;
	}
	@Override
	public String call(){
		return "result2: " + id;
	}
}
public class CallableDemo {
	public static void main(String [] args){
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results =
				new ArrayList<Future<String>>();
		for(int i=0; i<10; i++){
			results.add(exec.submit(new TaskWithResult(i)));
			results.add(exec.submit(new TaskWithResult2(i)));
		}
		for(Future<String> fs : results)
			try{
				System.out.println(fs.get(5, TimeUnit.SECONDS));
			}catch(Exception e){
				System.out.println(e);
			}finally{
				
			}
		exec.shutdown();
	}

}
