package jreframeworker.annotations.fields;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//this annotation is valid for types
@Target({ ElementType.TYPE })

// annotation will be recorded in the class file by the compiler,
// but won't be retained by the VM at run time (invisible annotation)
@Retention(RetentionPolicy.CLASS)

/**
 * Removes the final modifier from a defined field
 * 
 * target should be the field name (not qualified)
 * the target is qualified based on the super type
 * of the type it is placed on
 * 
 * @author Ben Holland
 */
public @interface NotFinalField {
	String target();
}
