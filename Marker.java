import java.lang.annotation.*;                     // Retention, Retention Policy
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {}

class Marker {

	@MyMarker()

	public static void myFunc() {
		Marker ob = new Marker();

		try {
			Method m = ob.getClass().getMethod("myFunc");
			if(m.isAnnotationPresent(MyMarker.class))
				System.out.println("My Marker is Present");
			else
				System.out.println("Marker is Not Present");
		}
		catch(NoSuchMethodException ce) {
			System.out.println("Method not found");
		}
	
	}
		public static void main(String args[]) {
			myFunc();	
		}

	}