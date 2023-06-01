package shelf;

public interface Queue {
	// 자료구조 - 선입선출 방식(FIFO: First-In First-Out)
	// 리스트에 맨 마지막에 추가(책 제목을)
	void enQueue(String title);
	
	// 리스트 맨 처음을 반환(0번 인덱스)
	String deQueue();
	
	// 현재 Queue에 남은 자료 개수
	int getSize();
	
}
