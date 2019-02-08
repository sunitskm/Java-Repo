
public class Test1 {
	public static int[] prisonAfterNDays(int[] cells, int N) {
		
        for(int i=0;i<N;i++){
        	
            for(int j=1;j<cells.length-1;j++) {
            	
            	if((cells[j-1]==1&&cells[j+1]==1)||(cells[j-1]==0&&cells[j+1]==0)) {
            		cells[j]=1;
            	}
            	else {
            		cells[j]=0;
            	}
            	
            	for(int k=0;k<cells.length;k++) {
                	System.out.print(cells[k]);
                }
            	System.out.println();
            }
            cells[0]=0;
            cells[cells.length-1]=0;
        }
        for(int i=0;i<cells.length;i++) {
        	System.out.print(cells[i]);
        }
        return cells;
    }
	public static void main(String[] args) {
		int[] cells = {0,0,1,1,0,0,0,0};
		prisonAfterNDays( cells, 7);
	}
}
