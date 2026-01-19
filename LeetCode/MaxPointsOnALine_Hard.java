// https://leetcode.com/problems/max-points-on-a-line/description/?envType=problem-list-v2&envId=maths-m5-geometry

class Solution {
    public int maxPoints(int[][] points) {
        if(points.length<=2) return points.length;
        int result=0;
        for(int i=0;i<points.length;i++){
            Map<String,Integer> map=new HashMap<>();
            int overlap=0,max=0;

            for(int j=i+1;j<points.length;j++){
                int dx=points[j][0]-points[i][0];
                int dy=points[j][1]-points[i][1];
                if(dx==0 && dy==0){
                    overlap++;
                    continue;
                }
                int gcd=gcd(dx,dy);
                dx/=gcd;
                dy/=gcd;
                String slope=dx+"/"+dy;
                map.put(slope,map.getOrDefault(slope,0)+1);
                max=Math.max(max,map.get(slope));
            }
            result=Math.max(result,max+overlap+1);
        }
        return result;
    }

    private int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
