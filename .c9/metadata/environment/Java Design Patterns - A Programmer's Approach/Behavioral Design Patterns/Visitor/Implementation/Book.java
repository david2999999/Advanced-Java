{"filter":false,"title":"Book.java","tooltip":"/Java Design Patterns - A Programmer's Approach/Behavioral Design Patterns/Visitor/Implementation/Book.java","undoManager":{"mark":12,"position":12,"stack":[[{"start":{"row":0,"column":0},"end":{"row":7,"column":1},"action":"insert","lines":["package com.journaldev.design.visitor;","public class Book implements ItemElement {","private int price;","private String isbnNumber;","public Book(int cost, String isbn){","this.price=cost;","this.isbnNumber=isbn;","}"],"id":1}],[{"start":{"row":7,"column":1},"end":{"row":8,"column":0},"action":"insert","lines":["",""],"id":2}],[{"start":{"row":8,"column":0},"end":{"row":18,"column":1},"action":"insert","lines":["public int getPrice() {","return price;","}","public String getIsbnNumber() {","return isbnNumber;","}","@Override","public int accept(ShoppingCartVisitor visitor) {","return visitor.visit(this);","}","}"],"id":3}],[{"start":{"row":2,"column":0},"end":{"row":2,"column":4},"action":"insert","lines":["    "],"id":4},{"start":{"row":3,"column":0},"end":{"row":3,"column":4},"action":"insert","lines":["    "]},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "]},{"start":{"row":5,"column":0},"end":{"row":5,"column":4},"action":"insert","lines":["    "]},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":3,"column":30},"end":{"row":4,"column":0},"action":"insert","lines":["",""],"id":5},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "],"id":6},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":8,"column":5},"end":{"row":9,"column":0},"action":"insert","lines":["",""],"id":7},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":11,"column":4},"end":{"row":11,"column":8},"action":"insert","lines":["    "],"id":9}],[{"start":{"row":12,"column":5},"end":{"row":13,"column":0},"action":"insert","lines":["",""],"id":10},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":15,"column":4},"end":{"row":15,"column":8},"action":"insert","lines":["    "],"id":11}],[{"start":{"row":16,"column":5},"end":{"row":17,"column":0},"action":"insert","lines":["",""],"id":12},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":20,"column":4},"end":{"row":20,"column":8},"action":"insert","lines":["    "],"id":13}],[{"start":{"row":0,"column":38},"end":{"row":1,"column":0},"action":"insert","lines":["",""],"id":14}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":1,"column":0},"end":{"row":1,"column":0},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1559910744787,"hash":"4875ea5dd7135b453c9c2cb0f3c96e372c820f58"}