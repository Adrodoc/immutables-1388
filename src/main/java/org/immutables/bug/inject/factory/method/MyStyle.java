package org.immutables.bug.inject.factory.method;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import org.immutables.annotate.InjectAnnotation;
import org.immutables.annotate.InjectAnnotation.Where;
import org.immutables.value.Value;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@Retention(SOURCE)
@Target(TYPE)
@Value.Style(allParameters = true)
@InjectAnnotation(type = GeneratePojoBuilder.class, target = Where.CONSTRUCTOR)
public @interface MyStyle {
}
