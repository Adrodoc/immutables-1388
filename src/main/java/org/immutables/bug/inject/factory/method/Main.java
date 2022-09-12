package org.immutables.bug.inject.factory.method;

public class Main {
  public static void main(String[] args) {
    ImmutableSomeObject object = ImmutableSomeObject.of("Hello World!");
    ImmutableSomeObjectBuilder builder = new ImmutableSomeObjectBuilder();
  }
}
