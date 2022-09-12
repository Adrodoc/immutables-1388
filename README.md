Reproducer for <https://github.com/immutables/immutables/issues/1388>

1. Run `gradlew compileJava`
2. Locate generated code under `build/generated/sources/annotationProcessor/java/main/org/immutables/bug/inject/factory/method/ImmutableSomeObject.java`:
```java
package org.immutables.bug.inject.factory.method;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link SomeObject}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSomeObject.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableSomeObject.of()}.
 */
@Generated(from = "SomeObject", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableSomeObject implements SomeObject {
  private final String name;

  private ImmutableSomeObject(String name) {
    this.name = Objects.requireNonNull(name, "name");
  }

  private ImmutableSomeObject(ImmutableSomeObject original, String name) {
    this.name = name;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SomeObject#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSomeObject withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableSomeObject(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSomeObject} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSomeObject
        && equalTo(0, (ImmutableSomeObject) another);
  }

  private boolean equalTo(int synthetic, ImmutableSomeObject another) {
    return name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SomeObject} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SomeObject{"
        + "name=" + name
        + "}";
  }

  /**
   * Construct a new immutable {@code SomeObject} instance.
   * @param name The value for the {@code name} attribute
   * @return An immutable SomeObject instance
   */
  public static ImmutableSomeObject of(String name) {
    return new ImmutableSomeObject(name);
  }

  /**
   * Creates an immutable copy of a {@link SomeObject} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SomeObject instance
   */
  public static ImmutableSomeObject copyOf(SomeObject instance) {
    if (instance instanceof ImmutableSomeObject) {
      return (ImmutableSomeObject) instance;
    }
    return ImmutableSomeObject.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSomeObject ImmutableSomeObject}.
   * <pre>
   * ImmutableSomeObject.builder()
   *    .name(String) // required {@link SomeObject#name() name}
   *    .build();
   * </pre>
   * @return A new ImmutableSomeObject builder
   */
  public static ImmutableSomeObject.Builder builder() {
    return new ImmutableSomeObject.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSomeObject ImmutableSomeObject}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SomeObject", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private long initBits = 0x1L;

    private String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SomeObject} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SomeObject instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      return this;
    }

    /**
     * Initializes the value for the {@link SomeObject#name() name} attribute.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSomeObject ImmutableSomeObject}.
     * @return An immutable instance of SomeObject
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSomeObject build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSomeObject(null, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build SomeObject, some of required attributes are not set " + attributes;
    }
  }
}
```
