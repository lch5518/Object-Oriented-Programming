
public class ScoreAverage {
	public static void main(String[] args) {
		double score[][] = {{3.3, 3.5, 3.7, 2.5},
							{2.7, 3.0, 2.8, 3.5}};
		double sum = 0;
		
		for(int i = 0; i<score.length;i++)
			for(int j=0;j<score[i].length;j++)
				sum += score[i][j];
		
		int n = score.length;
		int m = score[0].length;
		
		System.out.print("4년 전체 평균평점은 " + sum/(n*m));
		System.out.println();

	}
}

