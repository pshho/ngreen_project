package nestedclass.innerinterface;

public class MessageMain {

	public static void main(String[] args) {
		Message message = new Message();
		message.setListener(new CallListener2());
		message.touch();
	}

}
