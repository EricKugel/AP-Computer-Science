public class ClassWriterTester {
  public static void main(String[] args) {
    // Tests instance variable method written in part (a).
    String OneVarClassOutput = ClassWriter.writeInstanceVariable("String", "word") + "\n\n";
    
    // Tests constructor written in part (c).
    OneVarClassOutput += ClassWriter.writeConstructor("OneVarClass", "String", "word") + "\n\n";
  
    // Tests methods written in part (b).
    OneVarClassOutput += ClassWriter.writeGetterMethod("String", "word") + "\n\n";
    OneVarClassOutput += ClassWriter.writeSetterMethod("String", "word");
    System.out.println(OneVarClassOutput  + "\n\n--------------------\n");
    
    // Tests instance variable method written in part (a).
    String TwoVarClassOutput = ClassWriter.writeInstanceVariable("boolean", "isInPlay") + "\n";
    TwoVarClassOutput += ClassWriter.writeInstanceVariable("double", "num") + "\n\n";
    
    // Tests constructor written in part (c).
    TwoVarClassOutput += ClassWriter.writeConstructor("TwoVarClass", "boolean", "isInPlay", "double", "num") + "\n\n";
  
    // Tests methods written in part (b).
    TwoVarClassOutput += ClassWriter.writeGetterMethod("boolean", "isInPlay") + "\n\n";
    TwoVarClassOutput += ClassWriter.writeSetterMethod("boolean", "isInPlay") + "\n\n";
    TwoVarClassOutput += ClassWriter.writeGetterMethod("double", "num") + "\n\n";
    TwoVarClassOutput += ClassWriter.writeSetterMethod("double", "num");
    System.out.println(TwoVarClassOutput);
  }
}