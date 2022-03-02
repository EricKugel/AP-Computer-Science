public class CodeWordChecker implements StringChecker {
    private int minLength;
    private int maxLength;
    private String invalid;
    
    public CodeWordChecker(int minLength, int maxLength, String invalid) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.invalid = invalid;
    }
    public CodeWordChecker(String invalid) {
        this(6, 20, invalid);
    }
    public boolean isValid(String str) {
        return str.length() >= minLength && str.length() <= maxLength && str.indexOf(invalid) == -1;
    }
}
