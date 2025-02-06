class Solution {
    public boolean isBoomerang(int[][] points) {
        //different slope
        if( (points[0][0]==points[1][0]) || (points[0][0]==points[2][0]) ){
            if( (points[0][0]==points[1][0]) && (points[0][0]==points[2][0]) ){
                return false;
            }
            //y1=y2 or y1=y3    any one is repeting point
            if( ((points[0][0]==points[1][0]) && (points[0][1]==points[1][1])) || ((points[0][0]==points[2][0]) && (points[0][1]==points[2][1])) ) return false;
            return true;
        }
        double slopeAB = (double) (points[0][1]-points[1][1]) / (points[0][0]-points[1][0]);
        double slopeAC = (double) (points[0][1]-points[2][1]) / (points[0][0]-points[2][0]);
        if ( slopeAB == slopeAC ){
            return false;
        }
        return true;
    }
}