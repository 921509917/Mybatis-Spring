package cn.duan.exception;

public class MyUserException extends Exception{
    public MyUserException() {
        super();
    }

    public MyUserException(String message) {
        super(message);
    }
}
