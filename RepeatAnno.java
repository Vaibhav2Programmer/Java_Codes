import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {

	String str() default "Testing";
	int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
	MyAnno[] value();
}

class RepeatAnno {

	@MyAnno(str = "First annotation", val = -1)
	@MyAnno(str = "Second annotation", val = 100)

	public static void myMeth(String str, int i) {                                                         // Here we can also pass String and int as parameters in myMeth function,

	RepeatAnno ob = new RepeatAnno();

	try {
	//	Class<?> c = ob.getClass();

		Method m = ob.getClass().getMethod("myMeth", String.class, int.class);

		Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);

		System.out.println(anno);

} 	catch (NoSuchMethodException exc) {
	System.out.println("Method Not Found.");
	}	
}

	public static void main(String args[]) {
		myMeth("Yo", 90);
	}
}