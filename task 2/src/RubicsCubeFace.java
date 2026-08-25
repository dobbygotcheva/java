public class RubicsCubeFace{
    public static void main(String [] args){
        int size=3;
        char [] stikers={'R', 'W','B','Y','G'};
        char [][] cubeFace=new char[size][size];
        int stikNum=0;

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                cubeFace[i][j]=stikers[stikNum];
                stikNum=(stikNum+1)%stikers.length;
            }
        }

        for(int i=0;i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print("____");
            }
            System.out.println();

            for(int j=0; j<size; j++){
                System.out.print("|"+cubeFace[i][j]+"|");
            }
            System.out.println();
        }

        for(int j=0; j<size; j++){
            System.out.print("____");
        }
        System.out.println();

        System.out.println("Legend: ");
        System.out.println("r-red");
        System.out.println("y-yellow");
        System.out.println("g-green");
        System.out.println("w-white");
        System.out.println("b-blau");
    }
}