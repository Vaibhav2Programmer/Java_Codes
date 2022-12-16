import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
	
	int value();           // the benefit of writing the value() here is that we dont need to write x = 100 or val = 100
}

class Single {

	@MySingle(100)
	public static void myMeth() {

		Single ob = new Single();
		try {
			Method m = ob.getClass().getMethod("myMeth");
			MySingle anno = m.getAnnotation(MySingle.class);
			System.out.println(anno.value());
		}
		catch(NoSuchMethodException ce) {
			System.out.println("No such Method");
		}
	
	}

	public static void main(String args[]) {
		myMeth();
	}
}
