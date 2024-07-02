class Solution {
    public boolean backspaceCompare(String s, String t) {
        String first = remainInStack(s);
        String second = remainInStack(t);
        return first.equals(second);
    }

    String remainInStack(String str) {
        StringBuilder stack = new StringBuilder();
        for (char singleChar : str.toCharArray()) {
            if (singleChar != '#') {
                stack.append(singleChar); // similar to push because we add at the end
            } else if (stack.length() > 0) {
                // backspace char found and stack is not empty
                // remove the last inserted character
                stack.deleteCharAt(stack.length() - 1);
            }
        }
        return stack.toString(); // convert StringBuilder to string
    }
}
