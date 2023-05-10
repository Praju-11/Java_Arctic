package Array;

/** 
 *<p>It uses a multidimensional array. The following program
creates a 3 by 4 by 5, three-dimensional array. It then loads each element with the product
of its indexes. Finally, it displays these products.</p>
 * */
public class ThreeDMatrix
{
	public static void main(String[] args)
	{
		int threeD[][][] = new int[3][4][5];
		int i,j,k;
		
		for(i=0; i<3; i++)
			for(j=0; j<4; j++)
				for(k=0; k<5; k++)
					threeD[i][j][k] = i * j * k;
		
		for(i=0; i<3; i++) {
			for(j=0; j<4; j++) {
				for(k=0; k<5; k++)
					System.out.print(threeD[i][j][k] + " ");
				System.out.println();
			}
			System.out.println();
		}
	}
}
