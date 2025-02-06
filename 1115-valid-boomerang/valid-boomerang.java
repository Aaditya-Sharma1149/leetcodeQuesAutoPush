class Solution {
    public boolean isBoomerang(int[][] points) {
        // //different slope
        // if( (points[0][0]==points[1][0]) || (points[0][0]==points[2][0]) ){
        //     if( (points[0][0]==points[1][0]) && (points[0][0]==points[2][0]) ){
        //         return false;
        //     }
        //     //y1=y2 or y1=y3    any one is repeting point
        //     if( ((points[0][0]==points[1][0]) && (points[0][1]==points[1][1])) || ((points[0][0]==points[2][0]) && (points[0][1]==points[2][1])) ) return false;
        //     return true;
        // }
        // double slopeAB = (double) (points[0][1]-points[1][1]) / (points[0][0]-points[1][0]);
        // double slopeAC = (double) (points[0][1]-points[2][1]) / (points[0][0]-points[2][0]);
        // if ( slopeAB == slopeAC ){
        //     return false;
        // }
        // return true;

        //property of traingle sum of two side is greater than other
        int x1 = points[0][0];
        int x2 = points[1][0];
        int x3 = points[2][0];
        int y1 = points[0][1];
        int y2 = points[1][1];
        int y3 = points[2][1];
        double d1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double d2 = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
        double d3 = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
        //chatgpted floating point number last digit precission
        final double EPSILON = 1e-9;  // Small tolerance to avoid precision errors

        if (Math.abs(d1 - (d2 + d3)) < EPSILON || 
            Math.abs(d2 - (d1 + d3)) < EPSILON || 
            Math.abs(d3 - (d1 + d2)) < EPSILON) {
        return false;  // The points are collinear or degenerate
        }
        return true;
    }
}