{"filter":false,"title":"ShoppingCartClient.java","tooltip":"/Java Design Patterns - A Programmer's Approach/Behavioral Design Patterns/Visitor/ShoppingCartClient.java","undoManager":{"mark":11,"position":11,"stack":[[{"start":{"row":0,"column":0},"end":{"row":17,"column":1},"action":"insert","lines":["package com.journaldev.design.visitor;","public class ShoppingCartClient {","public static void main(String[] args) {","ItemElement[] items = new ItemElement[]{new Book(20,","\"1234\"),new Book(100, \"5678\"),","new Fruit(10, 2, \"Banana\"), new Fruit(5, 5, \"Apple\")};","int total = calculatePrice(items);","System.out.println(\"Total Cost = \"+total);","}","private static int calculatePrice(ItemElement[] items) {","ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();","int sum=0;","for(ItemElement item : items){","sum = sum + item.accept(visitor);","}","return sum;","}","}"],"id":1}],[{"start":{"row":2,"column":0},"end":{"row":2,"column":4},"action":"insert","lines":["    "],"id":2},{"start":{"row":3,"column":0},"end":{"row":3,"column":4},"action":"insert","lines":["    "]},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "]},{"start":{"row":5,"column":0},"end":{"row":5,"column":4},"action":"insert","lines":["    "]},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":3,"column":0},"end":{"row":3,"column":4},"action":"insert","lines":["    "],"id":3},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "]},{"start":{"row":5,"column":0},"end":{"row":5,"column":4},"action":"insert","lines":["    "]},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":3,"column":0},"end":{"row":3,"column":4},"action":"insert","lines":["    "],"id":4},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "]},{"start":{"row":5,"column":0},"end":{"row":5,"column":4},"action":"insert","lines":["    "]},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":4,"column":8},"end":{"row":4,"column":12},"action":"remove","lines":["    "],"id":5},{"start":{"row":4,"column":4},"end":{"row":4,"column":8},"action":"remove","lines":["    "]},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"remove","lines":["    "]},{"start":{"row":3,"column":64},"end":{"row":4,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":3,"column":64},"end":{"row":3,"column":65},"action":"insert","lines":[" "],"id":6}],[{"start":{"row":8,"column":4},"end":{"row":8,"column":8},"action":"remove","lines":["    "],"id":7}],[{"start":{"row":7,"column":4},"end":{"row":7,"column":8},"action":"remove","lines":["    "],"id":8}],[{"start":{"row":7,"column":5},"end":{"row":8,"column":0},"action":"insert","lines":["",""],"id":9},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":3,"column":0},"end":{"row":3,"column":4},"action":"remove","lines":["    "],"id":10},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"remove","lines":["    "]},{"start":{"row":5,"column":0},"end":{"row":5,"column":4},"action":"remove","lines":["    "]},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"remove","lines":["    "]}],[{"start":{"row":0,"column":38},"end":{"row":1,"column":0},"action":"insert","lines":["",""],"id":11}],[{"start":{"row":14,"column":8},"end":{"row":14,"column":12},"action":"insert","lines":["    "],"id":13}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":14,"column":12},"end":{"row":14,"column":12},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1559911297178,"hash":"fb9a4bfd24d89976efeb9ed74b8713fe4d503827"}