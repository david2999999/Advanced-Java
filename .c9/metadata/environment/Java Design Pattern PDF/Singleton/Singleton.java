{"filter":false,"title":"Singleton.java","tooltip":"/Java Design Pattern PDF/Singleton/Singleton.java","ace":{"folds":[],"scrolltop":410.4375,"scrollleft":0,"selection":{"start":{"row":35,"column":1},"end":{"row":35,"column":1},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"hash":"aa50361db0ae397a95a4fe3035d29206b3edb15c","undoManager":{"mark":20,"position":20,"stack":[[{"start":{"row":0,"column":0},"end":{"row":5,"column":20},"action":"insert","lines":["import java.io.ObjectStreamException;","import java.io.Serializable;","public class Singleton implements Serializable{","private static final long serialVersionUID = -1093810940935189395L;","private static Singleton sc = new Singleton();","private Singleton(){"],"id":1}],[{"start":{"row":5,"column":20},"end":{"row":6,"column":0},"action":"insert","lines":["",""],"id":2},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":6,"column":4},"end":{"row":28,"column":1},"action":"insert","lines":["if(sc!=null){","throw new IllegalStateException(\"Already created.\");","}","}","public static Singleton getInstance(){","return sc;","}","private Object readResolve() throws ObjectStreamException{","return sc;","}","private Object writeReplace() throws ObjectStreamException{","return sc;","}","public Object clone() throws CloneNotSupportedException{","throw new CloneNotSupportedException(\"Singleton, cannot be clonned\");","}","private static Class getClass(String classname) throws ClassNotFoundException {","ClassLoader classLoader = Thread.currentThread().getContextClassLoader();","if(classLoader == null)","classLoader = Singleton.class.getClassLoader();","return (classLoader.loadClass(classname));","}","}"],"id":3}],[{"start":{"row":3,"column":0},"end":{"row":3,"column":4},"action":"insert","lines":["    "],"id":4},{"start":{"row":4,"column":0},"end":{"row":4,"column":4},"action":"insert","lines":["    "]},{"start":{"row":5,"column":0},"end":{"row":5,"column":4},"action":"insert","lines":["    "]},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":4},"action":"insert","lines":["    "]},{"start":{"row":19,"column":0},"end":{"row":19,"column":4},"action":"insert","lines":["    "]},{"start":{"row":20,"column":0},"end":{"row":20,"column":4},"action":"insert","lines":["    "]},{"start":{"row":21,"column":0},"end":{"row":21,"column":4},"action":"insert","lines":["    "]},{"start":{"row":22,"column":0},"end":{"row":22,"column":4},"action":"insert","lines":["    "]},{"start":{"row":23,"column":0},"end":{"row":23,"column":4},"action":"insert","lines":["    "]},{"start":{"row":24,"column":0},"end":{"row":24,"column":4},"action":"insert","lines":["    "]},{"start":{"row":25,"column":0},"end":{"row":25,"column":4},"action":"insert","lines":["    "]},{"start":{"row":26,"column":0},"end":{"row":26,"column":4},"action":"insert","lines":["    "]},{"start":{"row":27,"column":0},"end":{"row":27,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":1,"column":28},"end":{"row":2,"column":0},"action":"insert","lines":["",""],"id":5}],[{"start":{"row":5,"column":50},"end":{"row":6,"column":0},"action":"insert","lines":["",""],"id":6},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "],"id":7},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":9,"column":8},"end":{"row":9,"column":12},"action":"insert","lines":["    "],"id":8}],[{"start":{"row":11,"column":5},"end":{"row":12,"column":0},"action":"insert","lines":["",""],"id":9},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":15,"column":5},"end":{"row":16,"column":0},"action":"insert","lines":["",""],"id":10},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":18,"column":4},"end":{"row":18,"column":8},"action":"insert","lines":["    "],"id":11}],[{"start":{"row":14,"column":4},"end":{"row":14,"column":8},"action":"insert","lines":["    "],"id":12}],[{"start":{"row":19,"column":5},"end":{"row":19,"column":7},"action":"insert","lines":["''"],"id":13}],[{"start":{"row":19,"column":5},"end":{"row":19,"column":7},"action":"remove","lines":["''"],"id":14}],[{"start":{"row":19,"column":5},"end":{"row":20,"column":0},"action":"insert","lines":["",""],"id":15},{"start":{"row":20,"column":0},"end":{"row":20,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":22,"column":4},"end":{"row":22,"column":8},"action":"insert","lines":["    "],"id":16}],[{"start":{"row":23,"column":5},"end":{"row":24,"column":0},"action":"insert","lines":["",""],"id":17},{"start":{"row":24,"column":0},"end":{"row":24,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":26,"column":4},"end":{"row":26,"column":8},"action":"insert","lines":["    "],"id":18}],[{"start":{"row":27,"column":5},"end":{"row":28,"column":0},"action":"insert","lines":["",""],"id":19},{"start":{"row":28,"column":0},"end":{"row":28,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":30,"column":0},"end":{"row":30,"column":4},"action":"insert","lines":["    "],"id":20},{"start":{"row":31,"column":0},"end":{"row":31,"column":4},"action":"insert","lines":["    "]},{"start":{"row":32,"column":0},"end":{"row":32,"column":4},"action":"insert","lines":["    "]},{"start":{"row":33,"column":0},"end":{"row":33,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":32,"column":8},"end":{"row":32,"column":12},"action":"insert","lines":["    "],"id":21}]]},"timestamp":1557164980884}