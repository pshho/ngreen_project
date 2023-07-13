package nestedclass.innerinterface;

public class Message {
	private OnClickListener listener;	// 내부 인터페이스 필드
	
	interface OnClickListener{
		public void onClick();
	}
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 버튼이 touch하는 method
	public void touch() {
		listener.onClick();
	}
}
