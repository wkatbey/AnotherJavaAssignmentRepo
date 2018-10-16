import java.security.SecureRandom;
public class Q12 {

    public static void main(String[] args) {
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"}; 
        SecureRandom randomWord = new SecureRandom();
        String sentence = "";

        for (int i = 0; i < 20; i++) {
            sentence = "";
            for (int j = 0; j < 6; j++) {
                if (j != 0) 
                    sentence = sentence.concat(" ");

                int randomIndex = randomWord.nextInt(5);
                if (j == 0 || j == 4) //First Article
                    sentence = sentence.concat(articles[randomIndex]);
                else if (j == 1 || j == 5) //Nouns
                    sentence = sentence.concat(nouns[randomIndex]);
                else if (j == 2) //Verb 
                    sentence = sentence.concat(verbs[randomIndex]);
                else //j == 3 Preposition
                    sentence = sentence.concat(prepositions[randomIndex]);
            }

            char firstLetter = sentence.charAt(0);
            char upperCaseFirstLetter = Character.toUpperCase(firstLetter);
            sentence = sentence.replaceFirst(String.valueOf(firstLetter), String.valueOf(upperCaseFirstLetter));
            sentence = sentence.concat(".");

            System.out.println(sentence);
        }
    }
   
}