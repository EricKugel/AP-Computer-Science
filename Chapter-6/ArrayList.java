public class ArrayList {
    private Object[] array;

    public ArrayList(int length) {
        this.array = new Object[length];
    }

    public ArrayList() {
        this(0);
    }

    public void add(int index, Object object) {
        Object[] newArray = new Object[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = object;
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        array = newArray;
    }

    public void add(Object object) {
        add(array.length, object);
    }

    

    public Object get(int index) {
        return array[index];
    }

    public void set(int index, Object object) {
        array[index] = object;
    }

    public String toString() {
        String output = "[";
        for (Object object : array) {
            output += object.toString() + ", ";
        }
        output = output.substring(0, output.length() - 2) + "]";
        return output;
    }
}
