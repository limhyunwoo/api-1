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
			 * �ҹ����� FireCar Ÿ������ Ȯ�� �� 
			 * �´ٸ� (FireCar)�� ��ü ĳ������ �϶�
			 */
			FireCar f = (FireCar)c;
			f.driver();
			f.stop();
			f.shootWater();
			
			
		}else if(c instanceof Ambulance){
			/*
			 * �Ķ���ͷ� �Ѿ�� C�� Ambulance Ÿ������ Ȯ�� �� 
			 * �´ٸ� (FireCar)�� ��ü ĳ������ �϶�
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
	
	void driver(){System.out.println("������..");}
	void stop(){System.out.println("���� !!");}
}

class FireCar extends Car{ // Car Ŭ������ ��ӹ��� �ҹ���
	void shootWater(){
		System.out.println("���ѷ� �Ҳ��� ��...");
	}
}

class Ambulance extends Car{ // Car Ŭ������ ��ӹ��� �ں���
	void siren(){
		System.out.println("���̷��� �︮�� ���� ��...");
	}
}