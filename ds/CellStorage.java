package ds;

public class CellStorage {
	static int SIZE = 100; // ��ά�����±귶Χ��[0, SIZE]
	private Boolean[][] status = null; // ÿ����Ԫ��Ĵ��״̬
	private int[][] neighbors = null; // ÿ����Ԫ��ǰ״̬���ھӸ���
	
	CellStorage(){
		// ��ʼ��
		status = new Boolean[SIZE + 1][SIZE + 1];
		neighbors = new int[SIZE +1][SIZE + 1];
		for(int i=0; i<=SIZE; i++) {
			for(int j=0; j<=SIZE; j++) {
				status[i][j] = false;
				neighbors[i][j] = 0;
			}
		}
	}
	
	public Boolean[][] getWorld(){
		return status;
	}
	
	public int getSize() {
		return SIZE;
	}
	
	public int[][] getNeighbor(){
		return neighbors;
	}
	
	public boolean nextStatus(int row, int col) {
		int cntNeighbor = neighbors[row][col];
		if(cntNeighbor == 3) {
			return true;
		}
		else if(cntNeighbor != 2) {
			return false;
		}
		else { // cntNeighbor == 2
			return status[row][col]; // ����
		}
	}
	
	public void update(CellStorage tempCells) {
		status = tempCells.getWorld();
		neighbors = tempCells.getNeighbor();
	}
	
	public void calcNeighbors() {
		int row, col;
		// ��������ڲ������е�Ԫ��
		for(row = 1; row <= SIZE-1; row++) {
			for(col = 1; col <= SIZE-1; col++) {
				if(status[row-1][col-1] == true) neighbors[row][col]++;
				if(status[row-1][col] == true) neighbors[row][col]++;
				if(status[row-1][col+1] == true) neighbors[row][col]++;
				if(status[row][col-1] == true) neighbors[row][col]++;
				if(status[row][col+1] == true) neighbors[row][col]++;
				if(status[row+1][col-1] == true) neighbors[row][col]++;
				if(status[row+1][col] == true) neighbors[row][col]++;
				if(status[row+1][col+1] == true) neighbors[row][col]++;
			}
		}
		// �����к����һ�зǽ��䴦�ĵ�Ԫ��
		for(col = 1; col <= SIZE-1; col++) {
			row = 0; // ����
			if(status[row][col-1] == true) neighbors[row][col]++;
			if(status[row][col+1] == true) neighbors[row][col]++;
			if(status[row+1][col-1] == true) neighbors[row][col]++;
			if(status[row+1][col] == true) neighbors[row][col]++;
			if(status[row+1][col+1] == true) neighbors[row][col]++;
			row = SIZE; // ���һ��
			if(status[row-1][col-1] == true) neighbors[row][col]++;
			if(status[row-1][col] == true) neighbors[row][col]++;
			if(status[row-1][col+1] == true) neighbors[row][col]++;
			if(status[row][col-1] == true) neighbors[row][col]++;
			if(status[row][col+1] == true) neighbors[row][col]++;
		}
		// �����к����һ�зǽ��䴦�ĵ�Ԫ��
		for(row = 1; row <= SIZE-1; row++) {
			col = 0; // ����
			if(status[row-1][col] == true) neighbors[row][col]++;
			if(status[row-1][col+1] == true) neighbors[row][col]++;
			if(status[row][col+1] == true) neighbors[row][col]++;
			if(status[row+1][col] == true) neighbors[row][col]++;
			if(status[row+1][col+1] == true) neighbors[row][col]++;
			col = SIZE; // ���һ��
			if(status[row-1][col-1] == true) neighbors[row][col]++;
			if(status[row-1][col] == true) neighbors[row][col]++;
			if(status[row][col-1] == true) neighbors[row][col]++;
			if(status[row+1][col-1] == true) neighbors[row][col]++;
			if(status[row+1][col] == true) neighbors[row][col]++;
		}
		// ���Ͻ�
		row = 0;
		col = 0;
		if(status[row][col+1] == true) neighbors[row][col]++;
		if(status[row+1][col] == true) neighbors[row][col]++;
		if(status[row+1][col+1] == true) neighbors[row][col]++;
		// ���Ͻ�
		row = 0;
		col = SIZE;
		if(status[row][col-1] == true) neighbors[row][col]++;
		if(status[row+1][col-1] == true) neighbors[row][col]++;
		if(status[row+1][col] == true) neighbors[row][col]++;
		// ���½�
		row = SIZE;
		col = 0;
		if(status[row-1][col] == true) neighbors[row][col]++;
		if(status[row-1][col+1] == true) neighbors[row][col]++;
		if(status[row][col+1] == true) neighbors[row][col]++;
		// ���½�
		row = SIZE;
		col = SIZE;
		if(status[row-1][col-1] == true) neighbors[row][col]++;
		if(status[row-1][col] == true) neighbors[row][col]++;
		if(status[row][col-1] == true) neighbors[row][col]++;
	}
	
	public void nextStatus() {
		int row, col;
		for(row = 0; row <= SIZE; row++) {
			for(col = 0; col <= SIZE; col++) {
				if(neighbors[row][col] == 3) 
					status[row][col] = true; // ��
				else if(neighbors[row][col] != 2)
					status[row][col] = false; //����
				// else neighbors[row][col] == 2 ����
			}
		}
	}
}
