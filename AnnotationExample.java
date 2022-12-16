import java.lang.annotation.*;          // Retention, Retention Policy
import java.lang.reflect.*;	     // Method

@Retention(RetentionPolicy.RUNTIME) 
@interface MyAnno {

	String str();
	int val();
}

class AnnotationExample {

	@MyAnno(str = "AnnotationsExp", val = 120)      // declaration 
	

	public static void myMeth() {
		AnnotationExample ob = new AnnotationExample();
		try {
			Class <?> c = ob.getClass();			// first we get Class through the object of annotation

			Method m = c.getMethod("myMeth");		// then Method

			MyAnno anno = m.getAnnotation(MyAnno.class);	// then we access Annotation

			System.out.println(anno.str() + "\n" + anno.val());
		}

		catch(NoSuchMethodException ec) {
			System.out.println("Method Not Found");
		}

	}

	public static void main(String args[]) {
		myMeth();
	}

}