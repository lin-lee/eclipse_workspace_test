package three.nine;

public class Test {
	
	void createBuffer() {
		int buffer[];
		int bufsz = 100;
		int value = 12;
		buffer = new int[bufsz];
		buffer[10] = value;
		value = buffer[11];
	}
	
	void createThreadArray() {
		Thread threads[];
		int count = 10;
		threads = new Thread[count];
		threads[0] = new Thread();
	}
	
	int[][][] create3DArray() {
		int grid[][][];
		grid = new int[10][5][];
		return grid;
	}

}
