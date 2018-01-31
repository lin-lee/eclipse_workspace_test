package three.fourteen;

class Foo{
	
}
public class Test {
	
	void doSomething(){
		
	}
	
	void onlyMe(Foo f) {
		synchronized (f) {
			doSomething();
		}
	}

}
