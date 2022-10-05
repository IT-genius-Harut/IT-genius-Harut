package intro_java.class_4_statics_and_strings;

public class StringsExample {
    public static void main(String[] args) {
        String str = "Hello world!";
        // printing the original string
        System.out.println(str);
        // replacing all the 'l' characters with 'p'
        String replaced = str.replace('l', 'p');
        System.out.println(replaced);
        // we can chain string replace operations
        String chainedReplaced = str
                .replace('l', 'p') // replacing all 'l' characters with 'p'
                .replace('o', 'u'); // replacing all 'o' characters with 'u'
        System.out.println(chainedReplaced);

        /* subStringing a string to get a part of it */
        String singleArgumentSubstring = str.substring(5); // getting the string from index 5 to the end
        System.out.println(singleArgumentSubstring);
        String twoArgumentSubstring = str.substring(5, 10); // getting the string from index 5 to index 10, tenth not included
        System.out.println(twoArgumentSubstring);

        // splitting a string into an array of strings
        String[] spaceSplit = str.split(" ");
        // the split method returns an array of strings which are the elements of the original string split by the provided delimiter
        // in this case, the delimiter is a space
        // the splitting will go like this
        // "Hello world!" -> ["Hello", "world!"]
        System.out.println("Split string: ");
        Utils.printArray(spaceSplit);

        String[] charSplit = str.split("l");
        // in this case the split will go like this
        // [He] [] [o wor] [d!]
        Utils.printArray(charSplit);
        // there is an empty string element in the array, though we don't see it in the output
        // we can see that with the following code
        System.out.println(charSplit.length);
        // should return 4 (the length of the array), since there are 4 elements in the array including the empty string

        // we can convert a string to an array of characters
        char[] chars = str.toCharArray();
        // the toCharArray method returns an array of chars which are the elements of the original string
        // in this case, the string is "Hello world!"
        // the array will look like this
        // [H] [e] [l] [l] [o] [ ] [w] [o] [r] [l] [d] [!]
        System.out.println("Converted string to array of chars: ");
        Utils.printArray(chars);

        // we can convert an array of chars to a string using the String.valueOf(char[]) method
        char[] helloChars = {'h', 'e', 'p', 'l', 'o'};
        String charsToString = String.valueOf(helloChars);
        // the valueOf method takes an array of chars and returns a string
        // in this case, the array is [h, e, p, l, o]
        // the string will look like this
        // "heplo"
        System.out.println("Converted array of chars to string: ");
        System.out.println(charsToString);

        // we can access individual characters in a string using the charAt(int) method
        char firstChar = str.charAt(0);
        // the charAt method takes an index and returns the character at that index
        // in this case, the index is 0
        // the character will look like this
        // 'H'
        System.out.println("First char in string: ");
        System.out.println(firstChar);

        // we can convert a string to lowercase using the toLowerCase() method
        String lowerCase = str.toLowerCase();
        // the toLowerCase method returns a string which is the original string converted to lowercase
        // in this case, the string is "Hello world!"
        // the lowercase string will look like this
        // "hello world!"
        System.out.println("Lowercase string: ");
        System.out.println(lowerCase);

        // we can convert a string to uppercase using the toUpperCase() method
        String uppercase = str.toUpperCase();
        // the toUpperCase method returns a string which is the original string converted to uppercase
        // in this case, the string is "Hello world!"
        // the uppercase string will look like this
        // "HELLO WORLD!"
        System.out.println("Uppercase string: ");
        System.out.println(uppercase);
    }
}
