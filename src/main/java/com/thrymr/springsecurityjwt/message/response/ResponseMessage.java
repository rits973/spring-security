package com.thrymr.springsecurityjwt.message.response;

/**
 * @author Ritesh
 * @Created On 9/11/18
 */
public class ResponseMessage {

    private String message;

    public ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
