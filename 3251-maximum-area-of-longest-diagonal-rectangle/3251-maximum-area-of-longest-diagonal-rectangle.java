class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxarea=0;
        double maxd=0;

        for(int i=0; i<dimensions.length; i++){
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            double d = Math.sqrt((l*l)+(w*w));
            int area = l*w;
            if(d>maxd){
                maxd=d;
                maxarea=area;
            }
            else if (d==maxd && area>maxarea){
                maxarea=area;
            }

        }

        return maxarea;
    }
}