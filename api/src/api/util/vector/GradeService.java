package api.util.vector;

import java.util.Vector;

public interface GradeService {
	void input(GradeVO vo);
	void print();
	String searchGradeByHak(String hak);
	Vector<String> searchGradeByName(String name);
	void descGradeTotal();
	void ascGradeTotal();
}
