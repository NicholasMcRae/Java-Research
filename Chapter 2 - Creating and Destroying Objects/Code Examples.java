//Item 1: Consider static factory methods instead of constructors

public static Boolean valueOf(boolean b) {
	return b ? Boolean.TRUE : Boolean.FALSE
}