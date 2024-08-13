public class CountingSort {
    //Creating the function to perform the counting sort on the input string
    public static String countSort(String s) {
        int n = s.length();
        //Creating a frequency array for the 26 lowercase English letters
        int[] count = new int[26];

        //Counting the frequency of each character
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }

        //Building the sorted string from the frequency array
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                sortedString.append((char) (i + 'a'));
                count[i]--;
            }
        }

        return sortedString.toString();
    }

    //Examples from the assignment:
    public static void main(String[] args) {
        //Example 1:
        String s1 = "edsab";
        System.out.println(countSort(s1));

        //Example 2:
        String s2 = "geeksforgeeks";
        System.out.println(countSort(s2));
    }
}

