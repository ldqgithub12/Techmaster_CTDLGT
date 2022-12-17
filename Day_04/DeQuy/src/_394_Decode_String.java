public class _394_Decode_String {
        public static String decodeString(String s) {
            StringBuilder str = new StringBuilder();
            int i =0;
            while (i<s.length()){
                if (Character.isLetter(s.charAt(i))){
                    str.append(s.charAt(i));
                }
                if (Character.isDigit(s.charAt(i))){
                    //phat hien cac chu so
                    StringBuilder number = new StringBuilder();
                    while (i<s.length() && s.charAt(i) !='['){
                        number.append(s.charAt(i));
                        i++;
                    }
                    int num = Integer.parseInt(number.toString());
                    //Tim chuoi con trong ngoac
                    StringBuilder insideString = new StringBuilder();
                    int braketNumber = 1;
                    i++;
                    while (braketNumber != 0){
                        if (s.charAt(i) == '['){
                            braketNumber++;
                        }
                        else if (s.charAt(i) ==']') {
                            braketNumber--;
                        }
                        if (braketNumber != 0){
                            insideString.append(s.charAt(i));
                            i++;
                        }
                    }
                    String inside = insideString.toString();
                    inside = decodeString(inside);
                    for (int j = 0;j<num;j++){
                        str.append(inside);
                    }
                }
                i++;
            }
            return str.toString();
        }
    public static void main(String[] args) {
        String result = decodeString("3[a]2[bc]");
        System.out.println(result);
    }
}
