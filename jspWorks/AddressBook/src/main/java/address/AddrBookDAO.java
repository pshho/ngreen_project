package address;

import java.util.ArrayList;

public class AddrBookDAO {
	// 자료 저장할 ArrayList
	private ArrayList<AddrBook> addrList = new ArrayList<>();
	
	// 자료 삽입
	public void add(AddrBook addrBook) {
		addrList.add(addrBook);
	}

	public ArrayList<AddrBook> getAddrList() {
		return addrList;
	}

	public void setAddrList(ArrayList<AddrBook> addrList) {
		this.addrList = addrList;
	}

}
