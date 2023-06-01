package shelf;

public class BookShelf extends Shelf implements Queue {
	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);	// 처음 항목 삭제
		
	}

	@Override
	public int getSize() {
		return shelf.size();
		
	}

}
