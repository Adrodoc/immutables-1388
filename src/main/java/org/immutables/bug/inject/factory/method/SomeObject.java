package org.immutables.bug.inject.factory.method;

import org.immutables.value.Value;

@Value.Immutable
@MyStyle
public interface SomeObject {
  String name();
}
