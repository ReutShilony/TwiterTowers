import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        System.out.println("Choose from the following options:\nFor a rectangular tower press 1\nFor a triangular tower press 2\nTo exit the program press 3");
        Scanner scan = new Scanner(System.in);
        int choose,width,height;
        final int RECTANGLE=1, TRIANGLE=2, EXIT=3;
        choose=scan.nextInt();
        while (choose != EXIT) {
            if (choose!=RECTANGLE && choose!= TRIANGLE){
                System.out.println("Invalid choose");
                return;
            }
            System.out.println("Please enter the width of the tower");
            width = scan.nextInt();
            System.out.println("Please enter the height of the tower");
            height = scan.nextInt();
            if (choose == RECTANGLE) {
                new RectangularTower(width, height);
            }
            else{
                new TriangleTower(width, height);
            }
            System.out.println("Choose from the following options:\nFor a rectangular tower press 1\nFor a triangular tower press 2\nTo exit the program press 3");
            choose=scan.nextInt();
        }
    }
}
