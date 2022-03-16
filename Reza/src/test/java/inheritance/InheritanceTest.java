package inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		Singer singer=new Singer();
		Doctor doctor=new Doctor();
		
		
		doctor.howToLoseFat();
		singer.singAsong();
		teacher.giveUsAlesson();
		singer.eat();
	}
	

}
