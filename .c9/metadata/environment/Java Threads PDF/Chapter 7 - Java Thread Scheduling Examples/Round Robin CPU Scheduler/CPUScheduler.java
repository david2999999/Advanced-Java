{"filter":false,"title":"CPUScheduler.java","tooltip":"/Java Threads PDF/Chapter 7 - Java Thread Scheduling Examples/Round Robin CPU Scheduler/CPUScheduler.java","ace":{"folds":[],"scrolltop":1020,"scrollleft":0,"selection":{"start":{"row":79,"column":1},"end":{"row":79,"column":1},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"hash":"ea8d6b4b312d76b5d3b7dc1b5bf715e12e6335a1","undoManager":{"mark":28,"position":28,"stack":[[{"start":{"row":5,"column":4},"end":{"row":17,"column":1},"action":"insert","lines":["private static boolean initialized = false;","private synchronized static boolean isInitialized() {","if (initialized)","return true;","initialized = true;","return false;","}","public CPUScheduler(int t) {","if (isInitialized())","throw new SecurityException(\"Already initialized\");","threads = new CircularList();","timeslice = t;","}"],"id":51}],[{"start":{"row":17,"column":1},"end":{"row":18,"column":0},"action":"insert","lines":["",""],"id":52}],[{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "],"id":53},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]},{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "]},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]},{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "]},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":5,"column":47},"end":{"row":6,"column":0},"action":"insert","lines":["",""],"id":54},{"start":{"row":6,"column":0},"end":{"row":6,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":8,"column":0},"end":{"row":8,"column":4},"action":"insert","lines":["    "],"id":55},{"start":{"row":9,"column":0},"end":{"row":9,"column":4},"action":"insert","lines":["    "]},{"start":{"row":10,"column":0},"end":{"row":10,"column":4},"action":"insert","lines":["    "]},{"start":{"row":11,"column":0},"end":{"row":11,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":9,"column":8},"end":{"row":9,"column":12},"action":"insert","lines":["    "],"id":56}],[{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "],"id":57},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":15,"column":8},"end":{"row":15,"column":12},"action":"insert","lines":["    "],"id":58}],[{"start":{"row":12,"column":5},"end":{"row":13,"column":0},"action":"insert","lines":["",""],"id":59},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":6,"column":4},"end":{"row":6,"column":32},"action":"insert","lines":["private boolean needThreads;"],"id":60}],[{"start":{"row":6,"column":32},"end":{"row":7,"column":0},"action":"insert","lines":["",""],"id":61},{"start":{"row":7,"column":0},"end":{"row":7,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":19,"column":22},"end":{"row":20,"column":0},"action":"insert","lines":["",""],"id":62},{"start":{"row":20,"column":0},"end":{"row":20,"column":8},"action":"insert","lines":["        "]}],[{"start":{"row":20,"column":8},"end":{"row":20,"column":24},"action":"insert","lines":["setDaemon(true);"],"id":63}],[{"start":{"row":22,"column":0},"end":{"row":26,"column":5},"action":"remove","lines":["","    public CPUScheduler(int t) {","        threads = new CircularList();","        timeslice = t;","    }"],"id":64},{"start":{"row":21,"column":5},"end":{"row":22,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":25,"column":25},"end":{"row":26,"column":0},"action":"insert","lines":["",""],"id":65},{"start":{"row":26,"column":0},"end":{"row":26,"column":8},"action":"insert","lines":["        "]},{"start":{"row":26,"column":8},"end":{"row":27,"column":0},"action":"insert","lines":["",""]},{"start":{"row":27,"column":0},"end":{"row":27,"column":8},"action":"insert","lines":["        "]}],[{"start":{"row":27,"column":8},"end":{"row":30,"column":1},"action":"insert","lines":["if (needThreads) {","needThreads = false;","notify();","}"],"id":66}],[{"start":{"row":28,"column":0},"end":{"row":28,"column":4},"action":"insert","lines":["    "],"id":67},{"start":{"row":29,"column":0},"end":{"row":29,"column":4},"action":"insert","lines":["    "]},{"start":{"row":30,"column":0},"end":{"row":30,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":28,"column":0},"end":{"row":28,"column":4},"action":"insert","lines":["    "],"id":68},{"start":{"row":29,"column":0},"end":{"row":29,"column":4},"action":"insert","lines":["    "]},{"start":{"row":30,"column":0},"end":{"row":30,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":28,"column":0},"end":{"row":28,"column":4},"action":"insert","lines":["    "],"id":69},{"start":{"row":29,"column":0},"end":{"row":29,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":45,"column":10},"end":{"row":45,"column":22},"action":"insert","lines":["synchronized"],"id":70}],[{"start":{"row":45,"column":10},"end":{"row":45,"column":11},"action":"insert","lines":[" "],"id":71}],[{"start":{"row":51,"column":0},"end":{"row":52,"column":23},"action":"remove","lines":["            if (current == null)","                return;"],"id":72},{"start":{"row":51,"column":0},"end":{"row":57,"column":1},"action":"insert","lines":["while (current == null) {","needThreads = true;","try {","wait();","} catch (Exception e) {}","current = (Thread) threads.getNext();","}"]}],[{"start":{"row":51,"column":0},"end":{"row":51,"column":4},"action":"insert","lines":["    "],"id":73},{"start":{"row":52,"column":0},"end":{"row":52,"column":4},"action":"insert","lines":["    "]},{"start":{"row":53,"column":0},"end":{"row":53,"column":4},"action":"insert","lines":["    "]},{"start":{"row":54,"column":0},"end":{"row":54,"column":4},"action":"insert","lines":["    "]},{"start":{"row":55,"column":0},"end":{"row":55,"column":4},"action":"insert","lines":["    "]},{"start":{"row":56,"column":0},"end":{"row":56,"column":4},"action":"insert","lines":["    "]},{"start":{"row":57,"column":0},"end":{"row":57,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":51,"column":0},"end":{"row":51,"column":4},"action":"insert","lines":["    "],"id":74},{"start":{"row":52,"column":0},"end":{"row":52,"column":4},"action":"insert","lines":["    "]},{"start":{"row":53,"column":0},"end":{"row":53,"column":4},"action":"insert","lines":["    "]},{"start":{"row":54,"column":0},"end":{"row":54,"column":4},"action":"insert","lines":["    "]},{"start":{"row":55,"column":0},"end":{"row":55,"column":4},"action":"insert","lines":["    "]},{"start":{"row":56,"column":0},"end":{"row":56,"column":4},"action":"insert","lines":["    "]},{"start":{"row":57,"column":0},"end":{"row":57,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":51,"column":0},"end":{"row":51,"column":4},"action":"insert","lines":["    "],"id":75},{"start":{"row":52,"column":0},"end":{"row":52,"column":4},"action":"insert","lines":["    "]},{"start":{"row":53,"column":0},"end":{"row":53,"column":4},"action":"insert","lines":["    "]},{"start":{"row":54,"column":0},"end":{"row":54,"column":4},"action":"insert","lines":["    "]},{"start":{"row":55,"column":0},"end":{"row":55,"column":4},"action":"insert","lines":["    "]},{"start":{"row":56,"column":0},"end":{"row":56,"column":4},"action":"insert","lines":["    "]},{"start":{"row":57,"column":0},"end":{"row":57,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":52,"column":0},"end":{"row":52,"column":4},"action":"insert","lines":["    "],"id":76},{"start":{"row":53,"column":0},"end":{"row":53,"column":4},"action":"insert","lines":["    "]},{"start":{"row":54,"column":0},"end":{"row":54,"column":4},"action":"insert","lines":["    "]},{"start":{"row":55,"column":0},"end":{"row":55,"column":4},"action":"insert","lines":["    "]},{"start":{"row":56,"column":0},"end":{"row":56,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":54,"column":16},"end":{"row":54,"column":20},"action":"insert","lines":["    "],"id":77}],[{"start":{"row":50,"column":49},"end":{"row":51,"column":0},"action":"insert","lines":["",""],"id":79},{"start":{"row":51,"column":0},"end":{"row":51,"column":12},"action":"insert","lines":["            "]}],[{"start":{"row":67,"column":16},"end":{"row":67,"column":40},"action":"remove","lines":["Thread.sleep(timeslice);"],"id":80},{"start":{"row":67,"column":16},"end":{"row":67,"column":32},"action":"insert","lines":["wait(timeslice);"]}]]},"timestamp":1557317790657}