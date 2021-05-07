public class FinalExam {
    public int rows;
    public int cols;


    public FinalExam(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public int[][] createArray() {
        int[][] data = new int[rows][cols];
        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < cols; b++) {
                data[a][b] = (int) (Math.random() * 9 + 2);
            }
        }
        return data;

    }


    public int calculateArray(int[][] data) {
        int sum = 0;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                sum += data[a][b];
            }
        }
        return sum;
    }

}
