package exam;

public class IPTVEx extends ColorTV {
	String ip;
	
	public IPTVEx(String ip, int size, int s) {
		super(size, s);
		this.ip = ip;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는" + ip + " 주소의 ");
		super.printProperty();
	}
	
	public static void main(String[] args) {
		IPTVEx iptv = new IPTVEx("192.1.1.2", 32, 2048);
		iptv.printProperty();

	}
}
