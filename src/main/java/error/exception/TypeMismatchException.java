package error.exception;

import error.exception.ParseException;
import type.typetype.Type;

public class TypeMismatchException extends ParseException {
    public TypeMismatchException(int[] position, Type type1, Type type2) {
        super(formatter.format(messageHeadFormat, position[0], position[1]) + "type mismatch: " + type1.visualInfo() + " " + type2.visualInfo());
    }

    public TypeMismatchException(int[] position, Type type, String shouldBeType) {
        super(formatter.format(messageHeadFormat, position[0], position[1]) + "type mismatch: " + type.visualInfo() + " should be " + shouldBeType);
    }
}
