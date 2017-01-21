class LargestPrimeFactor {

    public static void main(String[] args) {
        long start, end, totalTime;
        long num = 600851666647522143L;   // odd value is not divided by any even
        long pFactor = 1L;

        start = System.currentTimeMillis();

        for(long i = 3L; i <= num / i; ) 
        {
            if( num % i == 0 ) {
                pFactor = i;
                num = num / i;
            }
            else {
                i += 2;
            }
        }
        if( pFactor < num ) { pFactor = num; }

        end = System.currentTimeMillis();
        totalTime = end - start;
        System.out.println( pFactor + " Time: " + totalTime);
    }
}