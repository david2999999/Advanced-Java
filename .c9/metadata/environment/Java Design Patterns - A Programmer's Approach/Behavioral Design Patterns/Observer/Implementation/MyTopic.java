{"filter":false,"title":"MyTopic.java","tooltip":"/Java Design Patterns - A Programmer's Approach/Behavioral Design Patterns/Observer/Implementation/MyTopic.java","ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":57,"column":5},"end":{"row":57,"column":5},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"hash":"81024726534e9c52fa52aad917c1f439e017d06c","undoManager":{"mark":30,"position":30,"stack":[[{"start":{"row":0,"column":0},"end":{"row":35,"column":1},"action":"insert","lines":["package com.journaldev.design.observer;","import java.util.ArrayList;","import java.util.List;","public class MyTopic implements Subject {","private List<Observer> observers;","private String message;","private boolean changed;","private final Object MUTEX= new Object();","public MyTopic(){","this.observers=new ArrayList<>();","}","@Override","public void register(Observer obj) {","if(obj == null) throw new NullPointerException(\"Null","Observer\");","synchronized (MUTEX) {","if(!observers.contains(obj)) observers.add(obj);","}","}","@Override","public void unregister(Observer obj) {","synchronized (MUTEX) {","observers.remove(obj);","}","}","@Override","public void notifyObservers() {","List<Observer> observersLocal = null;","//synchronization is used to make sure any observer registered","after message is received is not notified","synchronized (MUTEX) {","if (!changed)","return;","observersLocal = new ArrayList<>(this.observers);","this.changed=false;","}"],"id":1}],[{"start":{"row":35,"column":1},"end":{"row":36,"column":0},"action":"insert","lines":["",""],"id":2}],[{"start":{"row":36,"column":0},"end":{"row":51,"column":1},"action":"insert","lines":["for (Observer obj : observersLocal) {","obj.update();","}","}","@Override","public Object getUpdate(Observer obj) {","return this.message;","}","//method to post message to the topic","public void postMessage(String msg){","System.out.println(\"Message Posted to Topic:\"+msg);","this.message=msg;","this.changed=true;","notifyObservers();","}","}"],"id":3}],[{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "],"id":4},{"start":{"row":5,"column":0},"end":{"row":5,"column":4},"action":"insert","lines":["    "]},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":4},"action":"insert","lines":["    "]},{"start":{"row":19,"column":0},"end":{"row":19,"column":4},"action":"insert","lines":["    "]},{"start":{"row":20,"column":0},"end":{"row":20,"column":4},"action":"insert","lines":["    "]},{"start":{"row":21,"column":0},"end":{"row":21,"column":4},"action":"insert","lines":["    "]},{"start":{"row":22,"column":0},"end":{"row":22,"column":4},"action":"insert","lines":["    "]},{"start":{"row":23,"column":0},"end":{"row":23,"column":4},"action":"insert","lines":["    "]},{"start":{"row":24,"column":0},"end":{"row":24,"column":4},"action":"insert","lines":["    "]},{"start":{"row":25,"column":0},"end":{"row":25,"column":4},"action":"insert","lines":["    "]},{"start":{"row":26,"column":0},"end":{"row":26,"column":4},"action":"insert","lines":["    "]},{"start":{"row":27,"column":0},"end":{"row":27,"column":4},"action":"insert","lines":["    "]},{"start":{"row":28,"column":0},"end":{"row":28,"column":4},"action":"insert","lines":["    "]},{"start":{"row":29,"column":0},"end":{"row":29,"column":4},"action":"insert","lines":["    "]},{"start":{"row":30,"column":0},"end":{"row":30,"column":4},"action":"insert","lines":["    "]},{"start":{"row":31,"column":0},"end":{"row":31,"column":4},"action":"insert","lines":["    "]},{"start":{"row":32,"column":0},"end":{"row":32,"column":4},"action":"insert","lines":["    "]},{"start":{"row":33,"column":0},"end":{"row":33,"column":4},"action":"insert","lines":["    "]},{"start":{"row":34,"column":0},"end":{"row":34,"column":4},"action":"insert","lines":["    "]},{"start":{"row":35,"column":0},"end":{"row":35,"column":4},"action":"insert","lines":["    "]},{"start":{"row":36,"column":0},"end":{"row":36,"column":4},"action":"insert","lines":["    "]},{"start":{"row":37,"column":0},"end":{"row":37,"column":4},"action":"insert","lines":["    "]},{"start":{"row":38,"column":0},"end":{"row":38,"column":4},"action":"insert","lines":["    "]},{"start":{"row":39,"column":0},"end":{"row":39,"column":4},"action":"insert","lines":["    "]},{"start":{"row":40,"column":0},"end":{"row":40,"column":4},"action":"insert","lines":["    "]},{"start":{"row":41,"column":0},"end":{"row":41,"column":4},"action":"insert","lines":["    "]},{"start":{"row":42,"column":0},"end":{"row":42,"column":4},"action":"insert","lines":["    "]},{"start":{"row":43,"column":0},"end":{"row":43,"column":4},"action":"insert","lines":["    "]},{"start":{"row":44,"column":0},"end":{"row":44,"column":4},"action":"insert","lines":["    "]},{"start":{"row":45,"column":0},"end":{"row":45,"column":4},"action":"insert","lines":["    "]},{"start":{"row":46,"column":0},"end":{"row":46,"column":4},"action":"insert","lines":["    "]},{"start":{"row":47,"column":0},"end":{"row":47,"column":4},"action":"insert","lines":["    "]},{"start":{"row":48,"column":0},"end":{"row":48,"column":4},"action":"insert","lines":["    "]},{"start":{"row":49,"column":0},"end":{"row":49,"column":4},"action":"insert","lines":["    "]},{"start":{"row":50,"column":0},"end":{"row":50,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":2,"column":22},"end":{"row":3,"column":0},"action":"insert","lines":["",""],"id":5}],[{"start":{"row":7,"column":28},"end":{"row":8,"column":0},"action":"insert","lines":["",""],"id":6},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"remove","lines":["    "],"id":7},{"start":{"row":7,"column":28},"end":{"row":8,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":7,"column":28},"end":{"row":8,"column":0},"action":"insert","lines":["",""],"id":8},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"remove","lines":["    "],"id":9},{"start":{"row":7,"column":28},"end":{"row":8,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":8,"column":45},"end":{"row":9,"column":0},"action":"insert","lines":["",""],"id":10},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":11,"column":4},"end":{"row":11,"column":8},"action":"insert","lines":["    "],"id":11}],[{"start":{"row":12,"column":5},"end":{"row":13,"column":0},"action":"insert","lines":["",""],"id":12},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"remove","lines":["    "],"id":13},{"start":{"row":16,"column":56},"end":{"row":17,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":16,"column":56},"end":{"row":16,"column":57},"action":"insert","lines":[" "],"id":14}],[{"start":{"row":18,"column":0},"end":{"row":18,"column":4},"action":"insert","lines":["    "],"id":15},{"start":{"row":19,"column":0},"end":{"row":19,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":17,"column":4},"end":{"row":17,"column":8},"action":"insert","lines":["    "],"id":16}],[{"start":{"row":18,"column":8},"end":{"row":18,"column":12},"action":"insert","lines":["    "],"id":17}],[{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "],"id":18},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":4},"action":"insert","lines":["    "]},{"start":{"row":19,"column":0},"end":{"row":19,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":20,"column":5},"end":{"row":21,"column":0},"action":"insert","lines":["",""],"id":19},{"start":{"row":21,"column":0},"end":{"row":21,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":24,"column":0},"end":{"row":24,"column":4},"action":"insert","lines":["    "],"id":20},{"start":{"row":25,"column":0},"end":{"row":25,"column":4},"action":"insert","lines":["    "]},{"start":{"row":26,"column":0},"end":{"row":26,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":25,"column":8},"end":{"row":25,"column":12},"action":"insert","lines":["    "],"id":21}],[{"start":{"row":27,"column":5},"end":{"row":28,"column":0},"action":"insert","lines":["",""],"id":22},{"start":{"row":28,"column":0},"end":{"row":28,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":31,"column":0},"end":{"row":31,"column":4},"action":"insert","lines":["    "],"id":23},{"start":{"row":32,"column":0},"end":{"row":32,"column":4},"action":"insert","lines":["    "]},{"start":{"row":33,"column":0},"end":{"row":33,"column":4},"action":"insert","lines":["    "]},{"start":{"row":34,"column":0},"end":{"row":34,"column":4},"action":"insert","lines":["    "]},{"start":{"row":35,"column":0},"end":{"row":35,"column":4},"action":"insert","lines":["    "]},{"start":{"row":36,"column":0},"end":{"row":36,"column":4},"action":"insert","lines":["    "]},{"start":{"row":37,"column":0},"end":{"row":37,"column":4},"action":"insert","lines":["    "]},{"start":{"row":38,"column":0},"end":{"row":38,"column":4},"action":"insert","lines":["    "]},{"start":{"row":39,"column":0},"end":{"row":39,"column":4},"action":"insert","lines":["    "]},{"start":{"row":40,"column":0},"end":{"row":40,"column":4},"action":"insert","lines":["    "]},{"start":{"row":41,"column":0},"end":{"row":41,"column":4},"action":"insert","lines":["    "]},{"start":{"row":42,"column":0},"end":{"row":42,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":35,"column":0},"end":{"row":35,"column":4},"action":"insert","lines":["    "],"id":24},{"start":{"row":36,"column":0},"end":{"row":36,"column":4},"action":"insert","lines":["    "]},{"start":{"row":37,"column":0},"end":{"row":37,"column":4},"action":"insert","lines":["    "]},{"start":{"row":38,"column":0},"end":{"row":38,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":36,"column":12},"end":{"row":36,"column":16},"action":"insert","lines":["    "],"id":25}],[{"start":{"row":36,"column":23},"end":{"row":37,"column":0},"action":"insert","lines":["",""],"id":26},{"start":{"row":37,"column":0},"end":{"row":37,"column":16},"action":"insert","lines":["                "]}],[{"start":{"row":42,"column":8},"end":{"row":42,"column":12},"action":"insert","lines":["    "],"id":27}],[{"start":{"row":44,"column":5},"end":{"row":45,"column":0},"action":"insert","lines":["",""],"id":28},{"start":{"row":45,"column":0},"end":{"row":45,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":48,"column":4},"end":{"row":48,"column":8},"action":"insert","lines":["    "],"id":29}],[{"start":{"row":49,"column":5},"end":{"row":50,"column":0},"action":"insert","lines":["",""],"id":30},{"start":{"row":50,"column":0},"end":{"row":50,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":53,"column":0},"end":{"row":53,"column":4},"action":"insert","lines":["    "],"id":31},{"start":{"row":54,"column":0},"end":{"row":54,"column":4},"action":"insert","lines":["    "]},{"start":{"row":55,"column":0},"end":{"row":55,"column":4},"action":"insert","lines":["    "]},{"start":{"row":56,"column":0},"end":{"row":56,"column":4},"action":"insert","lines":["    "]}]]},"timestamp":1559821901287}