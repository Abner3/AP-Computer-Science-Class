import static java.lang.System.*;

public class MonsterRunner2
{
   public static void main( String args[] )
   {
		Monster2 zero = new Monster2();
		Monster2 one = new Monster2(8);
		Monster2 sue = new Monster2(9, 4);
		Monster2 harry = new Monster2(1, 2, 3);
		System.out.println("\nzero Monster :: " + zero);		
		System.out.println("\none Monster :: " + one);
		System.out.println("\nsue Monster :: " + sue);
		System.out.println("\nharry Monster :: " + harry);

		System.out.println("\nchanging harry's properties ");				
		harry.setHeight(7);
		harry.setWeight(6);
		harry.setAge(5);
		System.out.println("\nharry Monster :: " + harry);

		System.out.println("\ncloning harry");	
		sue = harry.clone();
		System.out.println("\nsue Monster :: " + sue);

		Monster2 mOne = new Monster2(33,33,11);
		Monster2 mTwo = new Monster2(55,33,11);

		System.out.println("\nMonster 1 :: " + mOne);
		System.out.println("\nMonster 2 :: " + mTwo);

		System.out.print("\nmOne.equals(mTwo) == ");
		System.out.println(mOne.equals(mTwo));

		System.out.print("\nmOne.compareTo(mTwo) == ");
		System.out.println(mOne.compareTo(mTwo));
		System.out.print("\nmTwo.compareTo(mOne) == ");
		System.out.println(mTwo.compareTo(mOne));
	}
}
