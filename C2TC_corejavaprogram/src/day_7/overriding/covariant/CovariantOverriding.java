package day_7.overriding.covariant;
//Program to demonstrate covariant overriding
//base class
public class CovariantOverriding {
	// method getcolor returns an object of type color
		protected CovariantOverriding getColor() {
			CovariantOverriding s = new CovariantOverriding();
			return s;
		}
	}

	//this class will inherit from the class color and will override the getcolor() method returning the object of the type red class
	class Red extends CovariantOverriding {
		@Override
		public Red getColor() {
			Red s = new Red();
			return s;
		}
	}

	public class CovariantOverriding {
		public static void main(String[] args) {
			CovariantOverriding c1 = new CovariantOverriding();
			CovariantOverriding c2 = c1.getColor();
			System.out.println(c2);

			Red r1 = new Red();
			Red r2 = r1.getColor();
			System.out.println(r2);
		}
}
