package com.sonata;

import java.lang.annotation.*;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

	@interface SmartPhone {
		String os() default "Android";
		int version() default 1;
	}
	 @SmartPhone (os="mac",version=9)
	 class Redmi{
		 String model;
		 int size;
		 
		 Redmi(String m,int s){
			 this.model = m;
			 this.size = s;
		 }
	 }
	 
	 public class CustomAnno {
		 public static void main(String args[]) {
			 Redmi obj = new Redmi("Note8",8);
			 
			 Class c = obj.getClass();
			 Annotation an = c.getAnnotation(SmartPhone.class);
			 SmartPhone s = (SmartPhone)an;
			 System.out.println(s.os());
			 
			 
		 }

}

