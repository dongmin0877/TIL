public class DogLauncher {
	public static void main(String[] args) {
		Dog d1 = new Dog(51);

		Dog d2 = new Dog(100);
		
		// Dog bigger = Dog.maxDog(d1, d2);

		Dog bigger = d1.maxDog(d2);
		bigger.makeNoise();
		// d.makeNoise();

		System.out.println(d1.familyName);
		/** 
			Accessing a static variable using on Instance name is bad style 
			so, we should use a static variables using on Class name
		*/ 
		System.out.println(Dog.familyName);

	}
}

