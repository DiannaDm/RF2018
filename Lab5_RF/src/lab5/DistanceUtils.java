package lab5;


public class DistanceUtils {
/*	
	protected static Distances getDistances(double[] pattern1,double pattern2[], int nrOfPt)
	{
		Distances distances =new Distances();
		for(int feature=0;feature<pattern1.length;feature++) {
			
		}
		return distances;
	}
	*/
	protected static double EuclidianDistance(double[] pattern1, double pattern2[])
	{
		double distance= 0.0;
		for(int feature=0;feature<pattern1.length-1;feature++)
		{
			distance +=Math.pow((pattern1[feature]-pattern2[feature]),2);
		}
		return Math.floor(Math.sqrt(distance)*10000)/10000;
	}
	protected static double SimpleEuclidianDistance(double[] pattern1, double[] learningSet)
	{
		double distance= 0.0;
		for(int feature=0;feature<2;feature++) {
			distance+=Math.pow((pattern1[feature]-Double.valueOf(learningSet[feature])), 2);
		}
		return Math.sqrt(distance);
	}
	protected static double[][] DistanceMatrix(double[][] learningSet)
	{
		int numberOfPt= learningSet.length;
		double[][] distanceMatrix=new double[numberOfPt][numberOfPt];
		for(int i=0; i<numberOfPt;i++)
		{
			for(int j=i+1;j<numberOfPt;j++)
			{
				distanceMatrix[i][j]=SimpleEuclidianDistance(learningSet[i],learningSet[j]);
				distanceMatrix[j][i]=distanceMatrix[i][j];
			}
		}
			for(int i=0; i<=numberOfPt; i++)
			{
				for(int j=0; j<numberOfPt; j++)
				{
					System.out.print(distanceMatrix[i][j]+" ");
				}
				System.out.println();
			}
			return distanceMatrix;
	}
}
