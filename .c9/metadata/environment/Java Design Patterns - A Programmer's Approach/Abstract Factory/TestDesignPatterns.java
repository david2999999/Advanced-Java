{"filter":false,"title":"TestDesignPatterns.java","tooltip":"/Java Design Patterns - A Programmer's Approach/Abstract Factory/TestDesignPatterns.java","undoManager":{"mark":14,"position":14,"stack":[[{"start":{"row":0,"column":0},"end":{"row":19,"column":1},"action":"insert","lines":["package com.journaldev.design.test;","import com.journaldev.design.abstractfactory.PCFactory;","import com.journaldev.design.abstractfactory.ServerFactory;","import com.journaldev.design.factory.ComputerFactory;","import com.journaldev.design.model.Computer;","public class TestDesignPatterns {","public static void main(String[] args) {","testAbstractFactory();","}","private static void testAbstractFactory() {","Computer pc =","com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new","PCFactory(\"2 GB\",\"500 GB\",\"2.4 GHz\"));","Computer server =","com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new","ServerFactory(\"16 GB\",\"1 TB\",\"2.9 GHz\"));","System.out.println(\"AbstractFactory PC Config::\"+pc);","System.out.println(\"AbstractFactory Server Config::\"+server);","}","}"],"id":1}],[{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "],"id":2},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":7,"column":4},"end":{"row":7,"column":8},"action":"insert","lines":["    "],"id":3}],[{"start":{"row":8,"column":5},"end":{"row":9,"column":0},"action":"insert","lines":["",""],"id":4},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "],"id":5},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":12,"column":4},"end":{"row":12,"column":8},"action":"remove","lines":["    "],"id":6},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"remove","lines":["    "]},{"start":{"row":11,"column":21},"end":{"row":12,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":11,"column":21},"end":{"row":11,"column":22},"action":"insert","lines":[" "],"id":7}],[{"start":{"row":14,"column":4},"end":{"row":14,"column":8},"action":"remove","lines":["    "],"id":8},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"remove","lines":["    "]},{"start":{"row":13,"column":25},"end":{"row":14,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":13,"column":25},"end":{"row":13,"column":26},"action":"insert","lines":[" "],"id":9}],[{"start":{"row":12,"column":4},"end":{"row":12,"column":8},"action":"remove","lines":["    "],"id":10},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"remove","lines":["    "]},{"start":{"row":11,"column":91},"end":{"row":12,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":11,"column":91},"end":{"row":11,"column":92},"action":"insert","lines":[" "],"id":11}],[{"start":{"row":13,"column":4},"end":{"row":13,"column":8},"action":"remove","lines":["    "],"id":12},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"remove","lines":["    "]},{"start":{"row":12,"column":95},"end":{"row":13,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":12,"column":95},"end":{"row":12,"column":96},"action":"insert","lines":[" "],"id":13}],[{"start":{"row":12,"column":137},"end":{"row":13,"column":0},"action":"insert","lines":["",""],"id":14},{"start":{"row":13,"column":0},"end":{"row":13,"column":8},"action":"insert","lines":["        "]}],[{"start":{"row":4,"column":44},"end":{"row":5,"column":0},"action":"insert","lines":["",""],"id":15}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":13,"column":61},"end":{"row":13,"column":61},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1559648762401,"hash":"c3511985f2b151b8667e9875187d2d9b6ec64bef"}