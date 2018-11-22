package com.company.lab9.api;

/**
 * Interface for the ability to send messages
 */
public interface MessageSender {

    /**
     * Send message.
     *
     * @param message message text.
     */
    void sendMessage(String message);

    default String quote(String message) {
        return ("\""+message+"\"");
    }
}
