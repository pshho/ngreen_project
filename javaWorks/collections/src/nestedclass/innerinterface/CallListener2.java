package nestedclass.innerinterface;

public class CallListener2 implements Message.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다.");
	}

}
