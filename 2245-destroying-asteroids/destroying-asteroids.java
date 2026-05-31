class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for(int i=0; i<asteroids.length; i++){
            if(mass>100000) return true;
            if( mass >= asteroids[i]){
                mass += asteroids[i];
                continue;
            }
            return false;
        }
        return true;
    }
}