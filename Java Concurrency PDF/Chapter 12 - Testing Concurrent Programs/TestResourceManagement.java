class Big { double[] data = new double[100000]; }

void testLeak() throws InterruptedException {
    BoundedBuffer<Big> bb = new BoundedBuffer<Big>(CAPACITY);
    int heapSize1 = /* snapshot heap */ ;
    
    for (int i = 0; i < CAPACITY; i++)
        bb.put(new Big());
        
    for (int i = 0; i < CAPACITY; i++)
        bb.take();
        
    int heapSize2 = /* snapshot heap */ ;
    assertTrue(Math.abs(heapSize1-heapSize2) < THRESHOLD);
}