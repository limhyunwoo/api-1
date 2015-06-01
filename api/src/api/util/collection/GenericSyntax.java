package api.util.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 제네릭(generics)
 - 컬렉션을 구현한 기법
 - 모든 종류의 데이터 타입을 다룰 수 있도록 일반화한 타입
 - 매개변수로 클래스나 메소드를 작성하는 기법
 	컬렉션 클래스에서 파라미터로 사용되는 문자는 다른 변수와
 	혼동을 피하기 위해 일반적으로 다음과 같이 표현함.
	E : Element Set<E> set
	T : Type Set<T> set
	V : value;
	K : Key Map<K, V>
 */

/*
 제네릭은 참조데이터 타입에 대해서만 사용할 수 있다. 
 기본 데이터 타입에서는 사용할 수 없다.
 클래스를 정의할 때는 데이터 타입을 정의하지 않고
 인스턴스를 생성할 때 데이터 타입을 지정하는 기능
 */
public class GenericSyntax{
	public <E> Object test(Set<E> map){
		return null;
	}
	
	public <K,V> void test2(){
		Map<K,V> map = new HashMap<K,V>();
	}
}
