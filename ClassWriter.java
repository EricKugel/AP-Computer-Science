public class ClassWriter {
  
  /** Returns the appropriate string to declare and initialize variable param name of param type */
  public static String writeInstanceVariable(String type, String name) {
    String output = "private " + type + " " + name + " = ";
    switch (type) {
      case "int":
        output += "-1;";
        break;
      case "double":
        output += "0.0;";
        break;
      case "boolean":
        output += "false;";
        break;
      default:
        output += "null;";
    }
    return output;
  }
  
  /** Returns the appropriate string to construct a param className object
    *         with one instance variable param name of param type
    */
  public static String writeConstructor(String className, String type, String name) {
    return "public " + className + "(" + type + " " + name + ") {\n  this." + name + " = " + name + ";\n}";
  }
  
  
  /** Returns the appropriate string to construct a param className object
    *         with two instance variables param name1 of param type1
    *         and param name2 of param type2
    */
  public static String writeConstructor(String className, String type1, String name1, String type2, String name2) {
    return "public " + className + "(" + type1 + " " + name1 + ", " + type2 + " " + name2 + ") {\n  this." + name1 + " = " + name1 + ";\n  this." + name2 + " = " + name2 + ";\n}";
  }
  
  
  /** Returns the appropriate string to implement an accessor method for variable param name of param type */
  public static String writeGetterMethod(String type, String name) {
    return "public " + type + " get" + name.substring(0, 1).toUpperCase() + name.substring(1) + "() {\n return " + name + ";\n}";
  }
  
  /** Returns the appropriate string to implement an mutator method for variable param name of param type */
  public static String writeSetterMethod(String type, String name)
  {return "public void set" + name.substring(0,1).toUpperCase() + name.substring(1) + "(" + type + " " + name + ") {\n  this." + name + " = " + name + ";\n}";}
  
  
}
    