package lesson3;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({TYPE})
public @interface MyAnnotation /*extends java.lang.Annotation*/{
	int value();
	int count() default 100;
	String text() default "djksfhjksdfhjksdhf";
}
