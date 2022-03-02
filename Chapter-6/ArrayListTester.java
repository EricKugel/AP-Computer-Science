public class ArrayListTester {
    public static void main(String[] arg0) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.set(1, "Index one");
        arrayList.set(0, "The first element");
        arrayList.set(2, "Index two");
        arrayList.add("Added this to the end");
        System.out.println(arrayList.get(1));
        System.out.println(arrayList);

        arrayList.add(1, "this is the new index one");
        System.out.println(arrayList);
    }
}
