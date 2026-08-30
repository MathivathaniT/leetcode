class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String>obstacleSet=new HashSet<>();
        for(int[] obs:obstacles){
            obstacleSet.add(obs[0]+","+obs[1]);
        }
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        int dir=0;
        int x=0;
        int y=0;
        int maxDistSquare=0;
        for(int cmd:commands){
            if(cmd==-1){
                dir=(dir+1)%4;
            }else if (cmd==-2){
                dir=(dir+3)%4;

            }else{
                for(int step=0;step<cmd;step++){
                    int nextX=x+directions[dir][0];
                    int nextY=y+directions[dir][1];
                    if(obstacleSet.contains(nextX+","+nextY)){
                        break;
                    }
                    x=nextX;
                    y=nextY;
                    maxDistSquare=Math.max(maxDistSquare,x*x+y*y);
                }
            }
        }
        return maxDistSquare;
        
    }
}