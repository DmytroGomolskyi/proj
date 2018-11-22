package com.company.lab9.service;


import com.company.lab9.api.MessageSender;

/**
 * Some forum for some discussion
 */
public class Forum implements MessageSender {

    String theme;
    String author;
    String text;

    public static void main(String[] args) {
        Forum forum=new Forum();
        forum.text = forum.quote("Dima");
        System.out.println(forum.text);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message+text);
    }
}
