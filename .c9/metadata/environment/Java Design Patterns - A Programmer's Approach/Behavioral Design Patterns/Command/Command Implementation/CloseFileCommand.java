{"filter":false,"title":"CloseFileCommand.java","tooltip":"/Java Design Patterns - A Programmer's Approach/Behavioral Design Patterns/Command/Command Implementation/CloseFileCommand.java","undoManager":{"mark":9,"position":9,"stack":[[{"start":{"row":0,"column":0},"end":{"row":4,"column":19},"action":"insert","lines":["package com.journaldev.design.command;","public class CloseFileCommand implements Command {","private FileSystemReceiver fileSystem;","public CloseFileCommand(FileSystemReceiver fs){","this.fileSystem=fs;"],"id":1}],[{"start":{"row":4,"column":19},"end":{"row":5,"column":0},"action":"insert","lines":["",""],"id":2}],[{"start":{"row":5,"column":0},"end":{"row":9,"column":1},"action":"insert","lines":["}","@Override","public void execute() {","this.fileSystem.closeFile();","}"],"id":3}],[{"start":{"row":9,"column":1},"end":{"row":10,"column":0},"action":"insert","lines":["",""],"id":4},{"start":{"row":10,"column":0},"end":{"row":10,"column":1},"action":"insert","lines":["}"]}],[{"start":{"row":2,"column":0},"end":{"row":2,"column":4},"action":"insert","lines":["    "],"id":5},{"start":{"row":3,"column":0},"end":{"row":3,"column":4},"action":"insert","lines":["    "]},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "]},{"start":{"row":5,"column":0},"end":{"row":5,"column":4},"action":"insert","lines":["    "]},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":4,"column":4},"end":{"row":4,"column":8},"action":"insert","lines":["    "],"id":6}],[{"start":{"row":8,"column":4},"end":{"row":8,"column":8},"action":"insert","lines":["    "],"id":7}],[{"start":{"row":5,"column":5},"end":{"row":6,"column":0},"action":"insert","lines":["",""],"id":8},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":2,"column":42},"end":{"row":3,"column":0},"action":"insert","lines":["",""],"id":9},{"start":{"row":3,"column":0},"end":{"row":3,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":0,"column":38},"end":{"row":1,"column":0},"action":"insert","lines":["",""],"id":10}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":13,"column":1},"end":{"row":13,"column":1},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1559908484650,"hash":"8368594bbb1da4689d074939863f7eb102fbf1f1"}