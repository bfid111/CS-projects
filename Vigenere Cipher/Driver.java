/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youngmin
 */
public class Driver {
    String encrypt(String text, String key) {
        String res = "";
        text = text.toUpperCase(); // to uppercase
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') // scan letters between a to z
            {
                continue;
            }
            res += (char)((c + key.charAt(j) - 2 * 'A') % 26 + 'A'); // switch position by 2 
            j = ++j % key.length();
        }
        return res;
    }
    String decrypt(String text, String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') 
            {
                continue;
            }
            res += (char)((c - key.charAt(j) + 26) % 26 + 'A'); // reverse position from encryption 
            j = ++j % key.length();
        }
        return res;
    }
}
