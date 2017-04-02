public class PE13_6 {
    public static void main(String[] args) {
        String text = "Mississippi";
        String str = "sip";
        
        System.out.println("Looking for \"sip\"...\n");
        
        
        if (find(text, str)) {
            System.out.println("\nMatch found");
        } else {
            System.out.println("\nNo matches found");
        }
    }
    
    public static boolean find(String text, String str) {
        int lengthText = text.length();
        int lengthStr = str.length();
        
        System.out.println(text.substring(1));
        
        if(text.substring(0, lengthStr).equals(str)) {
            return true;
        } else {
            return find(text.substring(1), str);
        }
    }   
}
