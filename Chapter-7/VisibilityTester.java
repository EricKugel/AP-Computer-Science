public class VisibilityTester {
    private int var1;
    private String var2;

    public VisibilityTester(int v1, String v2) {
        var1 = v1;
        var2 = v2;
    }

    public void c() {
        System.out.println("ABC");
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        VisibilityTester s = (VisibilityTester) other;
        return (var1 == s.var1
            && var1 == var2.length()
            && var2.length() == s.var2.length());
    }
    
    public static void main(String[] arg0) {
        VisibilityTester t1 = new VisibilityTester(3, "abdd");
        System.out.println(/*t1.c*/t1.var1);
    }
}
    

