package address;

import java.util.ArrayList;

public class AddrBookDAO {
	// 자료 저장할 ArrayList
	private ArrayList<AddrBook> addrList = new ArrayList<>();
	
	// 자료 삽입
	public void add(AddrBook addrBook) {
		addrList.add(addrBook);
	}

	// 자료 목록 조회(출력)
	public ArrayList<AddrBook> getAddrList() {
		return addrList;
	}

	public void setAddrList(ArrayList<AddrBook> addrList) {
		this.addrList = addrList;
	}
	
	// 주소 상세보기
	public AddrBook getAddrBook(String username) {
		AddrBook addrBook = null;
		
		for(int i=0; i<addrList.size(); i++) {
			// 이미 저장된 이름 변수 할당
			String dbUserName = addrList.get(i).getUsername();
			
			if(dbUserName.equals(username)) {	// 외부 요청 이름과 저장되어 있는 이름과 일치하면
				addrBook = addrList.get(i);
				
				break;
			}
			
			// addrBook = addrList.get(i);	// 주소 1개 가져옴
		}
		
		return addrBook;	// 주소 반환
		
	}
	
	// 주소 삭제
	public void deleteAddrBook(String username) {
		AddrBook addrBook = null;
		
		for(int i=0; i<addrList.size(); i++) {
			String dbUserName = addrList.get(i).getUsername();
			
			if(dbUserName.equals(username)) {
				addrBook = addrList.get(i);
				addrList.remove(addrBook);
				
				break;
			}
		}
	}

}
