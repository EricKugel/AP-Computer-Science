public class MultPractice implements StudyPractice {
    private int first = 0;
    private int currentSecond = 0;

    public MultPractice(int first, int initialSecond) {
        this.first = first;
        this.currentSecond = initialSecond;
    }

    public void nextProblem() {
        this.currentSecond += 1;
    }

    public String getProblem() {
        return first + " TIMES " + currentSecond;
    }
}
