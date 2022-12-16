import java.lang.annotation.*;                  // Retention, Retention Policy
import java.lang.reflect.*;                           // Method

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

	String str();
	int val();
}

class AnnotationExp1 {

	@MyAnno(str = "Two Parameters", val = 27)

	public static void myFunc(String str, int num) {                          // Pasing parameters to the function

		AnnotationExp1 ob = new AnnotationExp1();      // Creating object of class to fetch the class then method then annnotation
		try {
			Class <?> c = ob.getClass();

			Method me = c.getMethod("myFunc", String.class, int.class);

			MyAnno on = me.getAnnotation(MyAnno.class);

			System.out.println(on.str() + "\n" + on.val());                                            // We fetch annotations functions through annotation object

		}

		catch(NoSuchMethodException xc) {
			System.out.println("Method not Found");
		}
	
	}
		public static void main(String args[]) {
			myFunc("test", 15);
			
		}
	}
