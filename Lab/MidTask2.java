public class MidTask2 {
    public static void main(String[] args) {


        // combine the first and the last name into a single formatted form.
        
        String firstName = "Ahmed";
        String lastName = "Hossain";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
        System.out.println("--------------------");


        // generate a product code by joining the product name and ID.
        
        String productName = "Phone Charger Type-C";
        int productID = 123456;
        String productCode = productName + "-" + productID;
        System.out.println("Product Code: " + productCode);
        System.out.println("--------------------");

        
        // extract the username from an email address.

        String email = "ahmed.hossain@gmail.com";
        int atIndex = email.indexOf('@');
        String username = email.substring(0, atIndex);
        System.out.println("Username: " + username);
        System.out.println("--------------------");

        // show the total number of charecters in user's message.

        String message = "My name is Ahmed Hossain";
        int charCount = message.length();
        System.out.println("Message: " + message);
        System.out.println("Character Count: " + charCount);
        System.out.println("--------------------");

        // convert a user-entered sentence to both uppercase and lowercase.

        String sentence = "Ahmed Hossain is a senior citizen.";
        String upperCase = sentence.toUpperCase();
        String lowerCase = sentence.toLowerCase();
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("--------------------");


        // replace a specific word in a sentence.

        String mainSentence = "Ahmed Hossain is a male person";
        String previousWord = "male";
        String newWord = "old";
        String newSentence = mainSentence.replace(previousWord, newWord);
        System.out.println("Main Sentence: " + mainSentence);
        System.out.println("Replaced Sentence: " + newSentence);

    }
    
}
