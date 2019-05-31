class FeaturePhone implements MobilePhoneInterface{
	public void sendCall() { }
	public void receiveCall() { }
	public void sendSMS() { }
	public void receiveSMS() { }

	// 다른 메소드 추가 가능
	public int getButtons() {
		return 0; }
}

interface PhoneInterface{
	int BUTTONS = 20;
	void sendCall();
	void receiveCall();
}

interface MobilePhoneInterface extends PhoneInterface {
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	public void sendCall() {System.out.println("전화걸기");	}
	public void receiveCall() {System.out.println("전화받기");}
	public void sendSMS() {System.out.println("SMS보대기");}
	public void receiveSMS() {System.out.println("SMS받기");}
	
	public void play() {System.out.println("음악재생");}
	public void stop() {System.out.println("재생 중지");}
	
	public void schedule() {System.out.println("일정관리");	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3, 5));
		p.schedule();

	}

}
