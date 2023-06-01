package objects;

public class Member {
	
	// field
	String id;
	
	Member(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member) obj;
			
			if(this.id == mem.id) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return id;
	}
	
}
