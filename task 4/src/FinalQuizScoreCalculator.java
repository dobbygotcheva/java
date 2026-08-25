public class FinalQuizScoreCalculator{
    public static double calculateFinalScore(double [] gradeScore){
        double minScore=gradeScore[0];
        double finalScore=gradeScore[0];

        for(int i=0; i<gradeScore.length; i++){
            double currentScore=gradeScore[i];
            if(currentScore<minScore){
                minScore=currentScore;
            }
            finalScore+=currentScore;
        }

        finalScore-=minScore;

        return finalScore;
    }

    public static void main(String [] args){
        double [] scores={8.9, 5.6, 3.2, 7.8, 5.5, 10, 7.9, 4.6};
        double finalScore=calculateFinalScore(scores);
        System.out.println("Your final score is: "+ finalScore);
    }
}