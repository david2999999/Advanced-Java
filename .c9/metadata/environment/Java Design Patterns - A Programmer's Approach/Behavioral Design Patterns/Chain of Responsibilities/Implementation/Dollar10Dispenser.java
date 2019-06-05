{"filter":false,"title":"Dollar10Dispenser.java","tooltip":"/Java Design Patterns - A Programmer's Approach/Behavioral Design Patterns/Chain of Responsibilities/Implementation/Dollar10Dispenser.java","undoManager":{"mark":10,"position":10,"stack":[[{"start":{"row":0,"column":0},"end":{"row":4,"column":51},"action":"insert","lines":["package com.journaldev.design.chainofresponsibility;","public class Dollar10Dispenser implements DispenseChain {","private DispenseChain chain;","@Override","public void setNextChain(DispenseChain nextChain) {"],"id":1}],[{"start":{"row":4,"column":51},"end":{"row":5,"column":0},"action":"insert","lines":["",""],"id":2},{"start":{"row":5,"column":0},"end":{"row":5,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":5,"column":4},"end":{"row":19,"column":1},"action":"insert","lines":["this.chain=nextChain;","}","@Override","public void dispense(Currency cur) {","if(cur.getAmount() >= 10){","int num = cur.getAmount()/10;","int remainder = cur.getAmount() % 10;","System.out.println(\"Dispensing \"+num+\" 10$ note\");","if(remainder !=0) this.chain.dispense(new","Currency(remainder));","}else{","this.chain.dispense(cur);","}","}","}"],"id":3}],[{"start":{"row":2,"column":0},"end":{"row":2,"column":4},"action":"insert","lines":["    "],"id":4},{"start":{"row":3,"column":0},"end":{"row":3,"column":4},"action":"insert","lines":["    "]},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "]},{"start":{"row":5,"column":0},"end":{"row":5,"column":4},"action":"insert","lines":["    "]},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":0,"column":52},"end":{"row":1,"column":0},"action":"insert","lines":["",""],"id":5}],[{"start":{"row":3,"column":32},"end":{"row":4,"column":0},"action":"insert","lines":["",""],"id":6},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "],"id":7},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":4},"action":"insert","lines":["    "]},{"start":{"row":19,"column":0},"end":{"row":19,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "],"id":8},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":16,"column":12},"end":{"row":16,"column":16},"action":"insert","lines":["    "],"id":9}],[{"start":{"row":18,"column":8},"end":{"row":18,"column":12},"action":"insert","lines":["    "],"id":10}],[{"start":{"row":14,"column":62},"end":{"row":15,"column":0},"action":"insert","lines":["",""],"id":11},{"start":{"row":15,"column":0},"end":{"row":15,"column":12},"action":"insert","lines":["            "]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":22,"column":1},"end":{"row":22,"column":1},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1559739165866,"hash":"cd1d5e5596e4ea5fb568e1b9cf7c80054a413a78"}