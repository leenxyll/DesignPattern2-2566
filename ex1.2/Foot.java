import java.util.Scanner;

public class Foot{
    private FoodShape foodShape;
    public Foot(FoodShape foodShape){
        this.foodShape = foodShape;
    }
    // public static String getShapeTypeFromUser() {
    //     String shapeType = null;
    //     Scanner inp = new Scanner(System.in);
    //     System.out.print("What to draw? 1.Ellipse, 2.Rectangle ");
    //     int type = inp.nextInt();
    //     switch(type) {
    //         case 1:
    //             shapeType = "Ellipse";
    //             break;
    //         case 2:
    //             shapeType = "Rectangle";
    //             break;
    //     }
    //     return shapeType;
    // }
    public void draw(String shapeType){
        switch(shapeType) {
            case "Ellipse":
                foodShape.drawAsEllipse();
                break;
            case "Rectangle":
                foodShape.drawAsRectangle();
                break;
        }
    }
    public static void main(String[] args) {
        FoodShape footShape = new FoodShape();
        Foot foot = new Foot(footShape);
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1.Ellipse, 2.Rectangle ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                foot.draw("Ellipse");
                break;
            case 2:
                foot.draw("Rectangle");
                break;
        }
    }
}