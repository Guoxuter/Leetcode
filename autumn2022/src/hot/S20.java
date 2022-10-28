// 2022.10.28
package hot;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class S20 {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put('{', '}');
            put('[', ']');
            put('(', ')');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        if (s.length() > 0 && !map.containsKey(s.charAt(0))) return false;
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                if (map.get(stack.pop()) != c) return false;
            }
        }
        return stack.isEmpty();
    }
}
