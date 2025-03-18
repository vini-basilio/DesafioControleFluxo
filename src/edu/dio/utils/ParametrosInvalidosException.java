package edu.dio.utils;

public class ParametrosInvalidosException extends Exception {
    private String code;

    public ParametrosInvalidosException(String code, String message) {
        super(message);
        this.setCode(code);
    }

    public ParametrosInvalidosException(String code, String message, Throwable cause) {
        super(message, cause);
        this.setCode(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
