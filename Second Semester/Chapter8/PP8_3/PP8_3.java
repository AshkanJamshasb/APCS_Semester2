
public class PP8_3 {
    
    public static void main(String[] args) {
        int zip = 92688;
        int checkDigit = checkDigit(zip);
        System.out.println(zip);
        String barcode = "|";
        barcode = digitToBarCode(checkDigit) + barcode;
        for (int i = 0; i < 5; i++) {
            barcode = digitToBarCode(checkDigit) + barcode;
            zip /= 10;
        }
        barcode = "|" + barcode;
        System.out.println(barcode);
    }

    public static int checkDigit(int zip) {
        int remaining = zip;
        int sum = 0;
        while (remaining > 0) {
            sum += remaining % 10;
            remaining /= 10;
        }
        return 10 - (sum % 10);
    }

    public static String digitToBarCode(int digit) {
        if (digit == 1) {
            return ":::||";
        }
        if (digit == 2) {
            return "::|:|";
        }
        if (digit == 3) {
            return "::||:";
        }
        if (digit == 4) {
            return ":|::|";
        }
        if (digit == 5) {
            return ":|:|:";
        }
        if (digit == 6) {
            return ":||::";
        }
        if (digit == 7) {
            return "|:::|";
        }
        if (digit == 8) {
            return "|::|:";
        }
        if (digit == 9) {
            return "|:|::";
        }
        return "||:::";
    }
}
