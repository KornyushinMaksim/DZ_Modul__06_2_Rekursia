package Task12_Turtles;

public class Task12 {
    private int row;
    private int cols;
    private int[][] field;

    public Task12 (){
        this.row = 5;
        this.cols = 5;
        field = new int[this.row][this.cols];
        initField();
    }

    public Task12(int row, int cols){
        this.row = row;
        this.cols = cols;
        field = new int[row][cols];
        initField();
    }

    private void initField(){
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.cols; j++){
                this.field[i][j] = (int) (Math.random() * 20);
            }
        }
    }

    public StringBuilder toPrint() {
        StringBuilder strField = new StringBuilder();
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.cols; j++){
                if (field[i][j] < 10){
                    strField.append(" ");
                }
                strField.append(this.field[i][j]).append(" ");
            }
            strField.append("\n");
        }
        return strField;
    }
}
