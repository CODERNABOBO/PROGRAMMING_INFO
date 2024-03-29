import java.util.*;
import static java.lang.System.out;


class FinalGrade{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int total=0;  
     byte num;
  float fsum =0, Msum = 0, Csum=0;
     
  float Fave=0, Mave=0,Cave=0,gen=0;
  float fscore1 = 0,fscore2 = 0,fscore3 = 0,fscore4 = 0,fscore5 = 0,fscore6 = 0;
  float mscore1 = 0,mscore2 =0,mscore3 = 0,mscore4 = 0,mscore5 = 0,mscore6 = 0;
  float cscore1 = 0,cscore2 = 0,cscore3 = 0;
   
     
 float point = 0;
     //foundational
       out.print("===============================================================\n");
       out.print("\n\n");
     out.print("How Many Foundational? ");
       num = sc.nextByte();
       for(byte f = 1; f<=num;f++){
             out.print("===============================================================\n");
       out.print("Total Score of F"+f+" :");
       total = sc.nextInt();
       out.print("\n");
       out.print("Enter your Score of F"+f+" :");
       
       float fscore = sc.nextFloat();
       out.print("\n");
       
         fscore=(fscore/total)*100;
         
         if(f==1){
               fscore1= fscore;
         }else if (f==2){
                 fscore2= fscore;
         }else if (f==3){
                 fscore3= fscore;
         }else if (f==4){
                 fscore4= fscore;
         }else if (f==5){
                 fscore5= fscore;
         }else{
                 fscore6= fscore;
         }
         
       Fave= (fsum += fscore)/num;
         
     }
     //Mediating  
       out.print("===============================================================\n");
       out.print("\n\n");
     out.print("How Many Mediating? ");
       num = sc.nextByte();
      
       for(byte m = 1; m<=num;m++){
             out.print("===============================================================\n");
       out.print("Total Score of F"+m+" :");
       total = sc.nextInt();
       out.print("\n");
       out.print("Enter your Score of F"+m+" :");
       
       float mscore = sc.nextFloat();
       out.print("\n");
       
         mscore=(mscore/total)*100;
         
          if(m==1){
               mscore1= mscore;
         }else if (m==2){
                 mscore2= mscore;
         }else if (m==3){
                 mscore3= mscore;
         }else if (m==4){
                 mscore4= mscore;
         }else if (m==5){
                 mscore5= mscore;
       
       } else{
              mscore6= mscore;
         }
       Mave= (Msum += mscore)/num;
         
     }
     //CULMINATING  
    out.print("===============================================================\n");
    out.print("\n\n");
    out.print("How Many Culminating? ");
       num = sc.nextByte();
       for(byte c = 1; c<=num;c++){
    out.print("===============================================================\n");
       out.print("Total Score of F"+c+" :");
       total = sc.nextInt();
       out.print("\n");
       out.print("Enter your Score of F"+c+" :");
       
       float cscore = sc.nextFloat();
       out.print("\n");
       
         cscore=(cscore/total)*100;
         
          if(c==1){
               cscore1= cscore;
         }else if (c==2){
                 cscore2= cscore;
       
         }else {
                 cscore3= cscore;
         }
      Cave= (Csum += cscore)/num;
         
   
           
       }
   Fave *= 0.20;
   Mave *= 0.30;
   Cave *= 0.50;
   
 gen =Fave+Mave+Cave;

// equivalent
//gen = 90f;
if(gen<75f) {point = 5.0f;}
else if (gen>=75f && gen<=77f){ point = 3.0f;}
else if (gen>=78f && gen<=80f){ point = 2.75f;}
else if (gen>=81f && gen<=83f){ point = 2.50f;}
else if (gen>=84f && gen<=86f){ point = 2.25f;}
else if (gen>=87f && gen<=89f){ point = 2.0f;}
else if (gen>=90f && gen<=92f){ point = 1.75f;}
else if (gen>=93f && gen<=95f){ point = 1.50f;}
else if (gen>=96f && gen<=98f){ point = 1.75f;}
else{point=1.0f;}

 //output
     out.print("==================================================================\n");
     out.print("|| FOUNDATIONAL   |  MEDIATING \t\t| CULMINATING  \t\t||\n");
    out.print("==================================================================\n");
     out.printf("|| fscore1: %.2f  ",fscore1);
     out.printf("| Mscore1: %.2f  ",mscore1);  
     out.printf("\t| Cscore1: %.2f  ",cscore1);  
     out.println("\t||");
     out.printf("|| fscore2: %.2f  ",fscore2);
     out.printf("| Mscore2: %.2f  ",mscore2);
     out.printf("\t| Cscore2: %.2f  ",cscore2);
     out.println("\t||");
     out.printf("|| fscore3: %.2f  ",fscore3);
     out.printf("| Mscore3: %.2f  ",mscore3);  
     out.printf("\t| Cscore3: %.2f  ",cscore3);  
     out.println("\t||");
     out.printf("|| fscore4: %.2f  ",fscore4);
     out.printf("| Mscore4: %.2f  ",mscore4);
     out.println("\t| \t\t\t|| ");
      out.printf("|| fscore5: %.2f  ",fscore5);
     out.printf("| Mscore5: %.2f  ",mscore5);
     out.println("\t| \t\t\t|| ");
    
     
    out.print("==================================================================\n");
     out.print("|| GWA : "+gen+ "\t| EQUIVALENT TO: "+point+"\t\t\t\t||\n");
     out.print("==================================================================\n");
   
       
 }
}
