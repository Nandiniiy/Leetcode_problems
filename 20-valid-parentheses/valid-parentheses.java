class Solution {
    public boolean isValid(String s) {
        //[({})]
        //maintain opening - closing pair
        Map<Character, Character> pair = new HashMap<>();
        pair.put('{', '}');
        pair.put('(', ')');
        pair.put('[', ']');

        //maintain a stack
        Stack<Character> stack = new Stack<>();
        char brackets[] = s.toCharArray(); //string to char aray
        for(char bracket : brackets)
        {
            //if opening, push in a stack
            
            if(pair.containsKey(bracket))
            {
                stack.push(bracket);
            }
            //if closing, pop opening from the stack and then compare it
            else
            { if(stack.isEmpty())

            {
                return false;
            }
                char openingbracket = stack.pop();
                char closingbracket = pair.get(openingbracket);
                if(closingbracket != bracket)
                {
                    return false;
                }

            }
        }
        return stack.isEmpty();

        
    }
}