import java.util.Stack;

public class _844_Backspace_String_Compare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();//Tạo 2 stack của s và t
        Stack<Character> stackT = new Stack<>();
        //Lần lượt cho từng char của s và t vào stack tương ứng thứ tự từ đầu đến cuối string
        //Nếu stack khác rỗng và ký tự đang xét là # thì lấy phần tử trên đỉnh stack ra
        // Nếu ký tự đang xét khác # thì cho vào stack
        // So sánh 2 stack với nhau nếu cả 2 giống nhau thì return true;
        // Độ phức tạp của thuật toán :O(2n)
        for (Character c: s.toCharArray()) {
            if (!stackS.isEmpty() && c == '#'){
                stackS.pop();
            }
            else if (c != '#'){
                stackS.push(c);
            }

        }
        for (Character c: t.toCharArray()) {
            if (!stackT.isEmpty() && c == '#'){
                stackT.pop();
            }
            else if (c != '#'){
                stackT.push(c);
            }
        }
        return stackT.equals(stackS);
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }
}
