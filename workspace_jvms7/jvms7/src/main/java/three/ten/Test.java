package three.ten;

public class Test {
	
	int chooseNear(int i) {
		switch (i) {
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			return 2;
		default:
			return -1;
		}
	}
	
	int chooseFar(int i) {
		switch (i) {
		case -100: return -1;
		case 0: return 0;
		case 100: return 1;
		default: return -1;
		}
	}
	
	short chooseNearShort(short i) {
		switch (i) {
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			return 2;
		default:
			return -1;
		}
	}
	
	int chooseIf(int i){
		if(i==0){
			return 0;
		}else if(i==1){
			return 1;
		}else if(i==2){
			return 2;
		}else{
			return -1;
		}
	}

}
