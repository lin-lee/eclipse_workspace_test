package lin;

public class Test {
	public static void main(String [] args){
		boolean a = (1==1) &&( (2==3) || (3==3) );
		System.out.println(a);
		
		if( (23==23) || (100/0==0) ){  
            System.out.println("运算没有问题。");  
        }  
	}
}
