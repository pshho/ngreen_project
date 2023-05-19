package arrays;

import java.util.Scanner;
// import java.awt.event;

// public static void keyPressed(KeyEvent e) {}

public class CalcScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;	// 상태변수
		double[] scores = null;
		
		while(run) {
			System.out.println("=================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("=================================================");
			
			System.out.print("선택> ");
			
			String selectNo = sc.nextLine();
			
			if(scores != null) {
				if(selectNo.equals("1")) {
					System.out.println("이미 학생 리스트가 저장되어있습니다. 다른 기능을 이용해주세요.");
					continue;
				}
			}
			
			if(selectNo.equals("1")) {
				try {
					System.out.print("학생수> ");
					int studentNum = Integer.parseInt(sc.nextLine());
					
					scores = new double[studentNum];
					
					for(int i=0; i<scores.length; i++) {
						scores[i] = -1;
					}
				}catch(NumberFormatException e) {
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				
				
			}else if(selectNo.equals("2")) {
				if(scores == null) {
					System.out.println("학생수를 먼저 선택해주세요.");
					continue;
				}
				
				for(int i=0; i<scores.length; i++) {
					System.out.print("학생 "+(i+1)+"번> ");
					
					try {
						// int score = Integer.parseInt(sc.nextLine());
						double score = Double.parseDouble(sc.nextLine());
						
						if(!(score <= 100 && score >= 0)) {
							System.out.println("점수는 0점부터 100점까지 입니다. 다시 입력해주세요.");
							i--;
							continue;
							
						}else if(score <= 100 && score >=0) {
							System.out.print("전단계 재입력 Z, 이어서 입력 엔터, 전체 재입력 T> ");
							String text = sc.nextLine();
							
							if(text.equalsIgnoreCase("Z")) {
								i--;
								continue;
								
							}else if(text.equalsIgnoreCase("T")) {
								i = -1;
								continue;
								
							}else if(text.equals("")) {
								scores[i] = score;
								continue;
								
							}else {
								System.out.println("다시 입력해주세요.");
								i--;
								continue;
								
							}
							
						}
						
					}catch(NumberFormatException e) {
						i--;
						System.out.println("다시 입력해주세요.");
					}
					
				}
				
			}else if(selectNo.equals("3")) {
				if(scores == null) {
					System.out.println("학생수를 먼저 선택해주세요.");
					continue;
				}else if(scores[0] == -1) {
					System.out.println("점수입력을 해주세요.");
					continue;
				}
				
				for(int i=0; i<scores.length; i++) {
					// System.out.println("학생 "+(i+1)+"번: " + (int)Math.round(scores[i]) + "점");
					System.out.printf("학생 %d번: %.2f점\n", (i+1), scores[i]);
				}
				
			}else if(selectNo.equals("4")) {
				if(scores == null) {
					System.out.println("학생수를 먼저 선택해주세요.");
					continue;
				}else if(scores[0] == -1) {
					System.out.println("점수입력을 해주세요.");
					continue;
				}
				
				System.out.print("어떤 결과를 원하십니까?(1. 합계, 2. 평균, 3. 등수 4. 최고 점수 5. 최저 점수)> ");
				String selectNo2 = sc.nextLine();
				
				if(selectNo2.equals("1")) {
					double sumV = 0;
					
					for(int i=0; i<scores.length; i++) {
						sumV += scores[i];
					}
					
					// System.out.println("합계: " + sumV);
					System.out.printf("합계: %.2f점\n", sumV);
					
				}else if(selectNo2.equals("2")) {
					double sumV = 0;
					double avg = 0;
					
					for(int i=0; i<scores.length; i++) {
						sumV += scores[i];
					}
					
					avg = (double)sumV / scores.length;
					
					// System.out.println("평균: " + avg);
					System.out.printf("평균: %.2f점\n", avg);
					
					
				}else if(selectNo2.equals("3")) {
					int[] rank = new int[scores.length];
					
					for(int i=0; i<scores.length; i++) {
						for(int j=0; j<scores.length; j++) {
							if(scores[i] < scores[j]) {
								rank[i] += 1;
							}
						}
						System.out.println("학생 "+(i+1)+"번: " + (rank[i] + 1) + "등");
					}
					
				}else if(selectNo2.equals("4")) {
					double max = scores[0];
					int max2 = 0;
					
					for(int i=0; i<scores.length; i++) {
						if(max < scores[i]) {
							max = scores[i];
							max2 = i;
						}
					}
					
					// System.out.println("최고 점수: " + max + "점, 학생 "+(max2 + 1)+"번");
					System.out.printf("최고 점수: %.2f점, 학생 %d번\n", max, (max2 + 1));
					
				}else if(selectNo2.equals("5")) {
					double min = scores[0];
					int min2 = 0;
					
					for(int i=0; i<scores.length; i++) {
						if(min > scores[i]) {
							min = scores[i];
							min2 = i;
						}
					}
					
					// System.out.println("최저 점수: " + min + "점, 학생 "+(min2 + 1)+"번");
					System.out.printf("최저 점수: %.2f점, 학생 %d번\n", min, (min2 + 1));
					
				}else {
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				
			}else if(selectNo.equals("5")) {
				run = false;
				System.out.println("프로그램 종료");
				
			}else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
		}
		
	}

}
