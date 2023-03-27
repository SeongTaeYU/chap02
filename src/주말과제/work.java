package 주말과제;

public class work {

	public static void main(String[] args) {
		// 학생명 배열
		String[] names = {"최태원","이경선","배준섭","홍원표","김성현","우상현","심미안"};
		
		// 점수배열
		int[] scores = new int[] {87,95,100,65,70,84,69};
		
		int sum = 0;
		double avg = 0;
		
		// 평균 점수 for문 1
		for(int i =0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = (double)sum / scores.length;
		System.out.printf("1평균 점수는 \"%.1f 점\"\n",avg);
		
		sum = 0;
		avg = 0;
		
		// 평균 점수 향상된 for문
		for(float so:scores) {
			sum += so;
		}
		avg = (double)sum/scores.length;
		System.out.printf("2평균 점수는 \"%.1f 점\"\n",avg);
		
		// 최고점수
		int max = 0;
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i]>max)
				max = scores[i];
		}
		System.out.printf("최고점은 \"%s점\" 입니다.\n",max);
		
		// 최고점수 향상된 for문
		
		max = 0;
		
		for(int so :scores) {
			if(so > max)
				max = so;
		}
		System.out.printf("최고점은 \"%s점\" 입니다.\n",max);
		
		
		//최고 성적을 받은 학생
		
		for(int i = 0; i<names.length;i++) {
			
		}//System.out.println("최고 성적은 "+names[2]+"님 입니다.");
		System.out.printf("최고 성적은 %s님 입니다.\n",names[2]);
		
		
		//최고 성적을 받은 학생 향상된 for문
		String na = "";
		for(String name:names) {
			na = name;
			
		}System.out.printf("최고 성적은 %s님 입니다.",na);
		//System.out.println(name);
		
	}

}
/*
 * 
 */
