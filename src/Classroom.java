import java.util.Random;
public class Classroom {

    public static void main(String[] args){

        ArrayBag namesBag = new ArrayBag(100);
        String[] names = {"Messi", "Cristiano", "Ronaldinho","Cruyff","Maradona",
                "Iniesta", "Pele", "Puyol", "Buffon", "Alves"};


        Random random = new Random();
        for(int i =0; i<100; i++){
            int randoIndex = random.nextInt(names.length);
            namesBag.addNewEntry(names[randoIndex]);
        }
        System.out.println("100 names generated");


        int highestCount = 0;
        String mostFrequentName = "";
        for(int i = 0; i < names.length; i++){
            int count = namesBag.getFrequencyOf(names[i]);
            if(count > highestCount){
                highestCount = count;
            }
        }
        System.out.println("The following names appear " + highestCount + " times and have been removed:");
        for(int i = 0; i < names.length; i++){
            int count = namesBag.getFrequencyOf(names[i]);
            if(count == highestCount){
                System.out.println(names[i]);
                while (namesBag.contains(names[i])) {
                    namesBag.remove(names[i]);
                }

            }

        }

        System.out.println("\n" + namesBag.getCurrentSize() + " students remaining\n");


        System.out.println("Name\t\tCount");
        System.out.println("----------------------");
        for (int i = 0; i < names.length; i++) {
            int count = namesBag.getFrequencyOf(names[i]);
            if (count > 0) {

                System.out.println(names[i] + "\t \t" + count);

            }
        }




    }


}
