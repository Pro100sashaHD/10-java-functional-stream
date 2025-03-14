package com.example.task05;

import jdk.vm.ci.meta.Constant;

import java.util.*;
import java.util.function.Consumer;

public class MailService<E> implements Consumer<Mail<E>> {
    private final Map<String, List<E>> mailBox = new HashMap<String, List<E>>(){
        public List<E> get(Object key){
            return this.getOrDefault(key, Collections.EMPTY_LIST);
        }
    };
    @Override
    public void accept(Mail<E> mail) {
        mailBox.computeIfAbsent(mail.getTo(), m -> new ArrayList<>()).add(mail.getContent());
    }
    public Map<String,List<E>> getMailBox(){
        return this.mailBox;
    }
}
