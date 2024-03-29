import java.util.Scanner;

public class FinalGrade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] FScores = new float[3];
        float[] Ftotalscores = new float[3];

        float[] MScores = new float[4];
        float[] MtotalScores = new float[4];

        float[] CScores = new float[1];
        float[] CtotalScores = new float[1];
        
        float FTotal = 0;
        float FweightedTotal = 0;
        float MTotal = 0;
        float MweightedTotal = 0;
        
        System.out.println("//FOUNDATIONAL");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter score for F" + (i + 1) + ": ");
            FScores[i] = scanner.nextFloat();
            System.out.print("Enter total score for F" + (i + 1) + ": ");
            Ftotalscores[i] = scanner.nextFloat();
        }

        for (int i = 0; i < 3; i++) {
            float percentage = (FScores[i] / Ftotalscores[i]);
            FTotal += percentage;
            FweightedTotal += percentage * 0.20;
        }

        float FAverage = FTotal / 3 * 100;
        System.out.println("==============================================");

        System.out.println("//MEDIATING");
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter score for M" + (i + 1) + ": ");
            MScores[i] = scanner.nextFloat();
            System.out.print("Enter total score for M" + (i + 1) + ": ");
            MtotalScores[i] = scanner.nextFloat();
        }


        for (int i = 0; i < 4; i++) {
            double percentage = (MScores[i] / MtotalScores[i]) * 100;
            MTotal += percentage;
            MweightedTotal += percentage * 0.30;
        }

        float MAverage = MTotal / 4;
        System.out.println("==============================================");

        System.out.println("//CULMINATING");
        for (int i = 0; i < 1; i++) {
            System.out.print("Enter score for C1: ");
            CScores[i] = scanner.nextFloat();
            System.out.print("Enter total score for C1: ");
            CtotalScores[i] = scanner.nextFloat();
        }

        float CTotal = 0;
        float CweightedTotal = 0;

        for (int i = 0; i < 1; i++) {
            double percentage = (CScores[i] / CtotalScores[i]) * 100;
            CTotal += percentage;
            CweightedTotal += percentage * 0.50 ;
            
        }
        System.out.println("==============================================");

        
        float OverallGrade = (FAverage + MAverage + CTotal) / 3;
        

        String equivalentGrade;
        if (OverallGrade >= 99) {
            equivalentGrade = "1.0";
        } else if (OverallGrade >= 96) {
            equivalentGrade = "1.25";
        } else if (OverallGrade >= 93) {
            equivalentGrade = "1.50";
        } else if (OverallGrade >= 90) {
            equivalentGrade = "1.75";
        } else if (OverallGrade >= 87) {
            equivalentGrade = "2.0";
        } else if (OverallGrade >= 84) {
            equivalentGrade = "2.25";
        } else if (OverallGrade >= 81) {
            equivalentGrade = "2.50";
        } else if (OverallGrade >= 78) {
            equivalentGrade = "2.75";
        } else if (OverallGrade >= 75) {
            equivalentGrade = "3.0";
        } else {
            equivalentGrade = "5.0";
        }

        System.out.println("| FOUNDATIONAL   | MEDIATING   | CULMINATING  |");
        System.out.println("-----------------------------------------------");
        System.out.println("| F1: " + FScores[0] + " |  M1: " + MScores[0] + " |   C1: " + CScores[0] + " |");
        System.out.println("| F2: " + FScores[1] + " |  M2: " + MScores[1] + " |            |");
        System.out.println("| F3: " + FScores[2] + " |  M3: " + MScores[2] + " |            |");
        System.out.println("|"+"\t"+"   |  M4: " + MScores[3] + " |            |");

        System.out.println("----------------------------------------------------------------------");
        System.out.println("| Foundational Avg: " + FAverage + "% | Mediating Avg: " + MAverage + " | C1: " + CTotal + "% |");
        System.out.println("| GWA:" + OverallGrade+"\t\t"+"\t| EQUIVALENT TO: " + equivalentGrade + " |" +"\t\t"+" |");
        System.out.println("----------------------------------------------------------------------");

        scanner.close();
    }
}
