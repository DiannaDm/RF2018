package lab5;

public class MainClass {
//raspunsuri: suceava, valcea, brasov
	
	public static void main(String[] args) {
		String[][] learningSet;
		try {
			learningSet = FileUtils.readLearningSetFromFile("data.csv");
			int numberOfPatterns = learningSet.length;
			int numberOfFeatures = learningSet[0].length;
			
			System.out.println(String.format("The learning set has %s patters and %s features", numberOfPatterns, numberOfFeatures));
		} catch (USVInputFileCustomException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finished learning set operations");
		}
		private static double[] initPatt(double[][] pattern) {
			double[][] newPatt=new double[3][2];
			newPatt[0][0]=25.89;
			newPatt[0][1]=47.56;
			newPatt[1][0]=24;
			newPatt[1][1]=45.15;
			newPatt[2][0]=25.33;
			newPatt[2][1]=45.44;
			return nrePatt;
		}
	}

}
