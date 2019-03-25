import java.util.*;
import java.io.*;
import java.net.*;

class StockObservable extends Observable {
    String lastTick;
    
    void setTick(String s) {
        lastTick = s;
        setChanged();
        notifyObservers();
    }
}