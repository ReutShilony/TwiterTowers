import java.util.Scanner;
public class TriangleTower extends Tower{
    public TriangleTower(int width, int height) {
        super(width, height);
        final int PERIMETER=1, PRINT=2;
        Scanner scan = new Scanner(System.in);
        int choose;
        System.out.println("Choose from the following options:\nIf you want the perimeter of the triangle press 1\n" +
                "If you want to print the triangle press 2");
        choose = scan.nextInt();
        if (choose == PERIMETER){
            double per= perimeter();
            System.out.println("Ths is the perimeter of the triangle: "+per+"\n");
        }
        else if (choose == PRINT)
            print();
        else {
            System.out.println("Invalid choose\n\n");
        }
    }

    @Override
    protected double perimeter() {
        double side;
        side=Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
        return width+2*side;
    }
    private void print(){
        final int SECOND_LINE_SIZE=3;
        if(width%2==0 || width>(height*2) || width<SECOND_LINE_SIZE || (width==SECOND_LINE_SIZE && height>2)){
            System.out.println("It is impossible to print the triangular tower\n\n");
            return;
        }
        if (width==SECOND_LINE_SIZE && height==2){
            printLine(1,1);
            printLine(SECOND_LINE_SIZE,0);
            return;
        }
        final int NUM_OF_GROUPS = (width/2)-1;
        int NUM_OF_LINES_IN_GROUP = (height-2)/NUM_OF_GROUPS;
        int LINES_REST = (height-2)%NUM_OF_GROUPS;
        int spaces = (width-1)/2;
        printLine(1,spaces);
        for (int i = SECOND_LINE_SIZE; i < width; i += 2) {
            spaces = (width-i)/2;
            int j =NUM_OF_LINES_IN_GROUP;
            if (i==SECOND_LINE_SIZE)
                 j+=LINES_REST;
            for (;j>0;j--){
                printLine(i,spaces);
            }
        }
        printLine(width,0);
    }
    private void printLine(int stars, int spaces){
        printChar(' ',spaces);
        printChar('*',stars);
        printChar(' ',spaces);
        System.out.println('\n');
    }
    private void printChar(char c,int count){
        for (int i =0; i<count; i++){
            System.out.print(c);
        }
    }
}
