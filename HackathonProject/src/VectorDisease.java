import java.io.*;
import java.util.Scanner;
public class VectorDisease {
    public static void main(String[] args)
    {
        System.out.println("Please enter the state for which you want to check the data for");
        Scanner inputState = new Scanner(System.in);
        String state = inputState.nextLine();

        System.out.println("Please choose between Dengue, Malaria or Chikungunya");
        Scanner inputDisease = new Scanner(System.in);
        String disease = inputDisease.nextLine();

        if(disease.equals("Dengue")) {
            String dengue = "./src/Sheets/Dengue.csv";
            BufferedReader br = null;
            String line = "";
            String csvSplitBy = ",";

            try {
                br = new BufferedReader(new FileReader(dengue));
                line = br.readLine();

                while (line != null) {
                    String[] currentLine = line.split(csvSplitBy);
                    String stateName = currentLine[0];
                    String diseaseProb = currentLine[1];

                    if (state.equals(stateName)) {
                        System.out.println("There have been " + diseaseProb + " cases\n");

                        break;
                    }
                    line = br.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
          System.out.println("Symptoms include:\n"+
                  "Pain areas: in the abdomen, back, back of the eyes, bones, joints, or muscles\n" +
                  "Whole body: chills, fatigue, fever, or loss of appetite\n" +
                  "Gastrointestinal: nausea or vomiting\n" +
                  "Skin: rashes or red spots\n" +
                  "Also common: easy bruising or headache\n");


            System.out.println("Precautions include: \n" +
                    "Protect yourself against mosquito bites.\n" +
                    "Prevent mosquito breeding inside and outside your home.\n" +
                    "Avoid visiting areas prone to mosquitoes.\n");
        }
        else if(disease.equals("Malaria")){
            String malaria = "./src/Sheets/Malaria.csv";
            BufferedReader br = null;
            String line = "";
            String csvSplitBy = ",";

            try {
                br = new BufferedReader(new FileReader(malaria));
                line = br.readLine();

                while (line != null) {
                    String[] currentLine = line.split(csvSplitBy);
                    String stateName = currentLine[0];
                    String diseaseProb = currentLine[1];

                    if (state.equals(stateName)) {
                        System.out.println("There have been " + diseaseProb + " cases\n");
                        break;
                    }
                    line = br.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Symptoms include:\n" +
            "Pain areas: in the abdomen or muscles\n" +
            "Whole body: chills, fatigue, fever, night sweats, shivering, or sweating\n" +
            "Gastrointestinal: diarrhoea, nausea, or vomiting\n" +
            "Also common: fast heart rate, headache, mental confusion, or pallor\n");


            System.out.println("Precautions include: \n" +
                    "Protect yourself against mosquito bites.\n" +
                    "Prevent mosquito breeding inside and outside your home.\n" +
                    "Avoid visiting areas prone to mosquitoes.\n");
        }
        else if(disease.equals("Chikungunya")){
            String chikungunya = "./src/Sheets/Chikungunya.csv";
            BufferedReader br = null;
            String line = "";
            String csvSplitBy = ",";

            try {
                br = new BufferedReader(new FileReader(chikungunya));
                line = br.readLine();

                while (line != null) {
                    String[] currentLine = line.split(csvSplitBy);
                    String stateName = currentLine[0];
                    String diseaseProb = currentLine[1];

                    if (state.equals(stateName)) {
                        System.out.println("There have been " + diseaseProb + " cases\n");
                        break;
                    }
                    line = br.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Pain areas: in the abdomen, back of the eyes, joints, or muscles\n" +
                    "Whole body: fever, chills, or fatigue\n"+
                    "Also common: headache, persistent joint pain, or skin rash\n");


            System.out.println("Precautions include: \n"+
                    "Protect yourself against mosquito bites.\n" +
                    "Prevent mosquito breeding inside and outside your home.\n" +
                    "Avoid visiting areas prone to mosquitoes.\n");
        }
        else {
        System.out.println("This disease or state does not exist.");

        }
    }
}