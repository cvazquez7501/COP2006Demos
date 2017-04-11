// Christian Vazquez - Charles
public class ListDataTypes {

  public static void showData() {

    System.out.println(
        "byte: The byte data type is an 8-bit signed two's complement integer. "
            + "It has a minimum value of -128 and "
            + "a maximum value of 127 (inclusive). "
            + "The byte data type can be ");
    System.out.println("useful for saving memory in large arrays, "
        + "where the memory savings actually matters.");
    System.out.println("short: The short data type is a 16-bit signed t"
        + "wo's complement integer. "
        + "It has a minimum value of -32,768 and a maximum"
        + " value of 32,767 (inclusive).");
    System.out.println("int: By default, the int data type is a 32-bit "
        + "signed two's complement integer, "
        + "which has a minimum value of -231 and a"
        + " maximum value of 231-1.");
    System.out.println(
        "long: The long data type is a 64-bit two's " + "complement integer. "
            + "The signed long has a minimum value of -263 "
            + "and a maximum value of 263-1.");
    System.out.println("float: The float data type is a single-precision "
        + "32-bit IEEE 754 floating point.");
    System.out.println("double: The double data type is a double-precision "
        + "64-bit IEEE 754 floating point.");
    System.out.println("boolean: The boolean data type has only two "
        + "possible values: true and false. "
        + "Use this data type for simple flags that track "
        + "true/false conditions.");
    System.out.println("char: The char data type is a single 16-bit Unicode "
        + "character. It has a minimum "
        + "value of '\u0000' (or 0) and a maximum value "
        + "of '\uffff' (or 65,535 inclusive).");
  }
}
