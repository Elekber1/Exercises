package videoExercise;


public class loop {

    public static void main(String[] args) {
        //leftStar();
        //rightStar();
        centralStar(7);
    }

    public static void leftStar(){
        for(int i=1; i<=7; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void rightStar(){
        for(int i=7; i>0; i--){
            for(int j=0; j<i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<8-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void centralStar(int a){
        for(int i=1; i<=a; i++){//5
            for(int j=1; j<=a-i; j++){ //4
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print(" *");
            }
            System.out.println();

        }
    }

}










