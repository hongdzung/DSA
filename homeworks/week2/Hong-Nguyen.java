package com.Hiento.session2;

import java.util.HashSet;
import java.util.Set;

// Time complexity is O(n) because you need to go through each and every letter.
// Space complexity is O(1) because the number of letters is fixed

public class RemoveDuplicate {
    private static void test(char[] s) {
        if (s == null) return;
        removeDuplicateCharacters(s);
        // s = {'h', 'e', 'l', 'o', ' ', 'w', 'r', 'l', 'd'};
        for (int i = 0; i < s.length; i++) {
          System.out.print(s[i]);
        }
        System.out.println("");
    }

  public static void main(String[] args) {
    char[] s = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
    test(s);
    test("boonee".toCharArray());
    test(null);
    test("xx13566xxysfs".toCharArray());
  }

    public static void removeDuplicateCharacters(char[] s) {
        if (s == null) return;
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            if (seen.contains(s[i])) {
                s[i] = 0;
            } else {
                seen.add(s[i]);
            }
        }
    }
 }
