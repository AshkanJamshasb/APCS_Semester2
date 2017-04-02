public class PE13_7 {
    public static void main(String[] args) {
        String text = "Mississippi";
        String str = "sip";
        
        System.out.println("Looking for \"sip\" in \"Mississippi\"...\n");
        
        
        System.out.println("It is found at index: " + find(text, str));
    }
    
    public static int find(String text, String str) {
        int lengthText = text.length();
        int lengthStr = str.length();
        
        if(text.substring(0, lengthStr).equals(str)) {
            return 0;
        } else {
            return find(text.substring(1), str, 1);
        }
    }   
    
    private static int find(String text, String str, int startCount) {
        int lengthText = text.length();
        int lengthStr = str.length();
        
        if(text.substring(0, lengthStr).equals(str)) {
            return startCount;
        } else {
            return find(text.substring(1), str, startCount + 1);
        }
    }   
}
