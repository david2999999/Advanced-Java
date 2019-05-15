public class SinTable extends LoopHandler {
    private float lookupValues[];
    
    public SinTable() {
        super(0, 360*100, 12);
        lookupValues = new float [360 * 100];
    }
    public void loopDoRange(int start, int end) {
        for (int i = start; i < end; i++) {
            float sinValue = (float)Math.sin((i % 360)*Math.PI/180.0);
            lookupValues[i] = sinValue * (float)i / 180.0f;
        }
    }
    
    public float[] getValues() {
        loopProcess();
        return lookupValues;
    }
}