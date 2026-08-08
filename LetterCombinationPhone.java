import java.util.*;

public class LetterCombinationPhone {

    public static List<String> letterCombinations(String digits) {

        Map<Character, String> map = getMap();

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        solve(0, digits, "", ans, map);

        return ans;
    }

    private static void solve(int i, String digits, String s,
                              List<String> ans,
                              Map<Character, String> map) {

        // All digits are processed
        if (i == digits.length()) {
            ans.add(s);
            return;
        }

        // Get letters for current digit
        String letters = map.get(digits.charAt(i));

        // Try every possible letter
        for (char c : letters.toCharArray()) {

            String temp = s + c;

            solve(i + 1, digits, temp, ans, map);
        }
    }

    private static Map<Character, String> getMap() {

        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        return map;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        String digits = sc.nextLine();

        List<String> result = letterCombinations(digits);

        System.out.println("Combinations: " + result);

        sc.close();
    }
}