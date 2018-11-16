package baekjoon;

//점수의 최대값, 합, 평균, 조작한 점수를 반환하는 유틸리티 클래스
public class Score {

	private Score() {}

	public static Double bigNum(Double[] arr) {
		Double big = arr[0];
		for(int i=1; i<arr.length; i++) {
			big = arr[i] > big ? arr[i] : big;
		}
		return big;
	}

	public static Double sum(Double[] arr) {
		Double sum = 0.0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static Double avg(Double[] arr) {
		return sum(arr)/arr.length;
	}

	public static Double[] upgradeScore(Double[] arr) {
		Double[] upArr = new Double[arr.length];
		Double bigNum = bigNum(arr);
		for(int i=0; i<arr.length; i++) {
			upArr[i] = arr[i]/bigNum*100;
		}
		return upArr;
	}

}
