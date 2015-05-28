package api.lang.object;

public class InstanceOfDemo {
	public static void main(String[] args) {
		FireCar fireCar = new FireCar();
		Ambulance ambulance = new Ambulance();
		
		InstanceOfDemo test = new InstanceOfDemo();
		test.doWork(fireCar);
		test.doWork(ambulance);
	}
	
	public void doWork(Car c){
		
		if(c instanceof FireCar){
			/*
			 * 소방차가 FireCar 타입인지 확인 후 
			 * 맞다면 (FireCar)로 객체 캐스팅을 하라
			 */
			FireCar f = (FireCar)c;
			f.driver();
			f.stop();
			f.shootWater();
			
			
		}else if(c instanceof Ambulance){
			/*
			 * 파라미터로 넘어온 C가 Ambulance 타입인지 확인 후 
			 * 맞다면 (FireCar)로 객체 캐스팅을 하라
			 */
			Ambulance a = (Ambulance)c;
			a.driver();
			a.siren();
			a.stop();
		}
	}
}

class Car{
	String color;
	int door;
	
	void driver(){System.out.println("운전중..");}
	void stop(){System.out.println("스톱 !!");}
}

class FireCar extends Car{ // Car 클래스를 상속받은 소방차
	void shootWater(){
		System.out.println("물뿌려 불끄는 중...");
	}
}

class Ambulance extends Car{ // Car 클래스를 상속받은 앰블런스
	void siren(){
		System.out.println("사이렌을 울리고 가는 중...");
	}
}