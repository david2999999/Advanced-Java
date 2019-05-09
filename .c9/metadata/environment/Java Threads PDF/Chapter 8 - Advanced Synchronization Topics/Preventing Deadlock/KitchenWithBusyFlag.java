{"filter":false,"title":"KitchenWithBusyFlag.java","tooltip":"/Java Threads PDF/Chapter 8 - Advanced Synchronization Topics/Preventing Deadlock/KitchenWithBusyFlag.java","undoManager":{"mark":9,"position":9,"stack":[[{"start":{"row":0,"column":0},"end":{"row":13,"column":1},"action":"insert","lines":["public class","Kitchen {","static MeasuringCup theCup;","static Bowl theBowl;","static BusyFlag theCupFlag, theBowlFlag;","public void makeCookie() {","theCupFlag.getBusyFlag();","theCup.measureOut(1, theFlour);","theBowlFlag.getBusyFlag();","theBowl.putIngredients(theCup);","theBowl.mix();","theBowlFlag.freeBusyFlag();","theCupFlag.freeBusyFlag();","}"],"id":1}],[{"start":{"row":13,"column":1},"end":{"row":14,"column":0},"action":"insert","lines":["",""],"id":2}],[{"start":{"row":14,"column":0},"end":{"row":24,"column":1},"action":"insert","lines":["public void makeOmelette() {","theBowlFlag.getBusyFlag();","Eggs e[] = getBrokenEggs();","theBowl.putIngredients(e);","theBowl.mix();","theCupFlag.getBusyFlag();","theCup.measureOut(theBowl);","theCupFlag.freeBusyFlag();","theBowlFlag.freeBusyFlag();","}","}"],"id":3}],[{"start":{"row":0,"column":12},"end":{"row":1,"column":0},"action":"remove","lines":["",""],"id":4}],[{"start":{"row":0,"column":12},"end":{"row":0,"column":13},"action":"insert","lines":[" "],"id":5}],[{"start":{"row":1,"column":0},"end":{"row":1,"column":4},"action":"insert","lines":["    "],"id":6},{"start":{"row":2,"column":0},"end":{"row":2,"column":4},"action":"insert","lines":["    "]},{"start":{"row":3,"column":0},"end":{"row":3,"column":4},"action":"insert","lines":["    "]},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "]},{"start":{"row":5,"column":0},"end":{"row":5,"column":4},"action":"insert","lines":["    "]},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":4},"action":"insert","lines":["    "]},{"start":{"row":19,"column":0},"end":{"row":19,"column":4},"action":"insert","lines":["    "]},{"start":{"row":20,"column":0},"end":{"row":20,"column":4},"action":"insert","lines":["    "]},{"start":{"row":21,"column":0},"end":{"row":21,"column":4},"action":"insert","lines":["    "]},{"start":{"row":22,"column":0},"end":{"row":22,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":3,"column":44},"end":{"row":4,"column":0},"action":"insert","lines":["",""],"id":7},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "],"id":8},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":13,"column":5},"end":{"row":14,"column":0},"action":"insert","lines":["",""],"id":9},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "],"id":10},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":4},"action":"insert","lines":["    "]},{"start":{"row":19,"column":0},"end":{"row":19,"column":4},"action":"insert","lines":["    "]},{"start":{"row":20,"column":0},"end":{"row":20,"column":4},"action":"insert","lines":["    "]},{"start":{"row":21,"column":0},"end":{"row":21,"column":4},"action":"insert","lines":["    "]},{"start":{"row":22,"column":0},"end":{"row":22,"column":4},"action":"insert","lines":["    "]},{"start":{"row":23,"column":0},"end":{"row":23,"column":4},"action":"insert","lines":["    "]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":20,"column":33},"end":{"row":20,"column":33},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1557434908129,"hash":"bc27d2234424a01aab2f906d2d13a2799b04472d"}