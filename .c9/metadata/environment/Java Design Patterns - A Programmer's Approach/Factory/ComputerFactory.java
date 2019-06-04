{"filter":false,"title":"ComputerFactory.java","tooltip":"/Java Design Patterns - A Programmer's Approach/Factory/ComputerFactory.java","undoManager":{"mark":10,"position":10,"stack":[[{"start":{"row":0,"column":0},"end":{"row":12,"column":1},"action":"insert","lines":["package com.journaldev.design.factory;","import com.journaldev.design.model.Computer;","import com.journaldev.design.model.PC;","import com.journaldev.design.model.Server;","public class ComputerFactory {","public static Computer getComputer(String type, String ram, String","hdd, String cpu){","if(\"PC\".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);","else if(\"Server\".equalsIgnoreCase(type)) return new Server(ram,","hdd, cpu);","return null;","}","}"],"id":1}],[{"start":{"row":3,"column":42},"end":{"row":4,"column":0},"action":"insert","lines":["",""],"id":2}],[{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "],"id":3},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"remove","lines":["    "],"id":4},{"start":{"row":6,"column":70},"end":{"row":7,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":6,"column":70},"end":{"row":6,"column":71},"action":"insert","lines":[" "],"id":5}],[{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"remove","lines":["    "],"id":6},{"start":{"row":8,"column":67},"end":{"row":9,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "],"id":7},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":7,"column":40},"end":{"row":8,"column":0},"action":"insert","lines":["",""],"id":8},{"start":{"row":8,"column":0},"end":{"row":8,"column":8},"action":"insert","lines":["        "]}],[{"start":{"row":8,"column":8},"end":{"row":8,"column":12},"action":"insert","lines":["    "],"id":9}],[{"start":{"row":9,"column":49},"end":{"row":10,"column":0},"action":"insert","lines":["",""],"id":10},{"start":{"row":10,"column":0},"end":{"row":10,"column":8},"action":"insert","lines":["        "]}],[{"start":{"row":10,"column":8},"end":{"row":10,"column":12},"action":"insert","lines":["    "],"id":11}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":13,"column":1},"end":{"row":13,"column":1},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1559574761558,"hash":"bf11dbe979968298465117726c9b2b811387b78f"}