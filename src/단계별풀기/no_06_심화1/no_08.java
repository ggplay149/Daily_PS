package 단계별풀기.no_06_심화1;

import java.io.IOException;

public class no_08 {
    public static void main(String[] args) throws IOException {
        String text = "ObjectOrientedProgramming1 3.0 A+\n" +
                "IntroductiontoComputerEngineering 3.0 A+\n" +
                "ObjectOrientedProgramming2 3.0 A0\n" +
                "CreativeComputerEngineeringDesign 3.0 A+\n" +
                "AssemblyLanguage 3.0 A+\n" +
                "InternetProgramming 3.0 B0\n" +
                "ApplicationProgramminginJava 3.0 A0\n" +
                "SystemProgramming 3.0 B0\n" +
                "OperatingSystem 3.0 B0\n" +
                "WirelessCommunicationsandNetworking 3.0 C+\n" +
                "LogicCircuits 3.0 B0\n" +
                "DataStructure 4.0 A+\n" +
                "MicroprocessorApplication 3.0 B+\n" +
                "EmbeddedSoftware 3.0 C0\n" +
                "ComputerSecurity 3.0 D+\n" +
                "Database 3.0 C+\n" +
                "Algorithm 3.0 B0\n" +
                "CapstoneDesigninCSE 3.0 B+\n" +
                "CompilerDesign 3.0 D0\n" +
                "ProblemSolving 4.0 P";
        String[] arr = text.split("\n");
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum=0.0,sumSubject=0.0;
        double b = 0.0;
        for(int i =0 ; i<20;i++){
            //String[] a = br.readLine().split(" ");
            String[] a = arr[i].split(" ");
            System.out.println(arr[i]);
            if(!a[2].equals("P")){
                if(a[2].equals("A+")) b = 4.5;
                else if(a[2].equals("A0")) b = 4.0;
                else if(a[2].equals("B+")) b = 3.5;
                else if(a[2].equals("B0")) b = 3.0;
                else if(a[2].equals("C+")) b = 2.5;
                else if(a[2].equals("C0")) b = 2.0;
                else if(a[2].equals("D+")) b = 1.5;
                else if(a[2].equals("D0")) b = 1.0;
                else if(a[2].equals("F"))b = 0.0;
                sum += (Double.parseDouble(a[1]) * b);
                sumSubject += Double.parseDouble(a[1]);
                System.out.println("학점x과목평점 >>"+(Double.parseDouble(a[1]) * b));
                System.out.println("학점x과목평점 누적 >>"+sum);
                System.out.println("학점 >>"+a[1]);
                System.out.println("학점의 총합 >>"+sumSubject);
            }
        }
        System.out.print(sum/sumSubject);
    }
}
