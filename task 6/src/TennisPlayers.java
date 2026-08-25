public class TennisPlayers {
    public static void main(String [] args){
        String [][] playerNames=new String [3][3];

        playerNames[0][0]="Player1";
        playerNames[0][1]="Player2";
        playerNames[0][2]="Player3";
        playerNames[1][0]="Player4";
        playerNames[1][1]="Player5";
        playerNames[1][2]="Player6";
        playerNames[2][0]="Player7";
        playerNames[2][1]="Player8";
        playerNames[2][2]="Player9";

        int [] rankingPoints={10000, 9000,8000,7000,6000,5000,4000,3000,2000};

        System.out.println("Rank | Player Name | Ranking Points");

        int rank=1;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("| %-5d | %-15s | %d     |\n", rank, playerNames[i][j], rankingPoints[rank-1]);
                rank++;
            }
        }
    }
}
