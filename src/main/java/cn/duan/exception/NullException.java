package cn.duan.exception;

public class NullException extends MyPhoneException {
    public NullException() {
    }

    public NullException(String message) {
        super(message);
    }
}
