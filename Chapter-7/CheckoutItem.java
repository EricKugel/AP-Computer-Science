public class CheckoutItem extends ReadingMaterial {
    private int dueIn = -1;
    private int holder = 0;
    private boolean checkedOut;

    public CheckoutItem(String author, String title, String publisher, int numPages, String condition) {
        super(author, title, publisher, numPages, condition);
    }

    @Override
    public void checkOut(int holder) {
        checkedOut = true;
        this.holder = holder;
    }

    public void isCheckedOut() {
        System.out.println(checkedOut ? "This book is checked out" : "This book is available");
    }

    public void returnItem() {
        checkedOut = false;
        holder = 0;
    }

    public void setDueIn(int dueIn) {
        this.dueIn = dueIn;
    }

    public int getDueIn() {
        return dueIn;
    }


    @Override
    public String toString() {
        String output = super.toString();
        output += checkedOut ? ". Checked out." : ". Available for check out";
        return output;
    }
}
