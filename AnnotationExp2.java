import java.lang.annotation.*;           // Retention, Retention Policy
import java.lang.reflect.*;                  // Method

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

	String str();
	int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {

	String description();
}

@What(description = "An annotation test Class")              // declaration is imp. as without declaration it would 
@MyAnno(str = "Meta2" , val = 98)		         // generate NullPointerException	

class AnnotationExp2 {

	@What(description = "An annotation test method")
	@MyAnno(str = "Testing", val = 99)

	public static void myFunc() {

	AnnotationExp2 ob = new AnnotationExp2();

		try {
			Annotation annos[] = ob.getClass().getAnnotations();                                      // For all Annotations in the class
			
			System.out.println("All annotations for AnnotationExp2 : ");
				for(Annotation a : annos)
					System.out.println(a);
				System.out.println();
			
			Method m = ob.getClass().getMethod("myFunc");
				annos = m.getAnnotations();
			System.out.println("All annotations for my Meth :");
				for(Annotation b : annos)
					System.out.println(b);	
		}

		catch(NoSuchMethodException ce) {
			System.out.println("Method not found");
		}
	}

	public static void main(String args[]) {
		myFunc();
	}
}