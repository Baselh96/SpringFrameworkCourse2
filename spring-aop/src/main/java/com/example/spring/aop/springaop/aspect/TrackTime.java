package com.example.spring.aop.springaop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD) // D. h. dass wir diese Annotationen auf Methoden schreiben sollen.
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime {

}
