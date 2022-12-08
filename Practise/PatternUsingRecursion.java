package Practise;
public class PatternUsingRecursion{
public static void main(String[] args) {
    traingle1(5, 0);
    traingle2(5, 0);
}
static void traingle1(int row,int column){
    if(row==0){
        return;
    }
    if(column<row){
        System.out.print("*");
        traingle1(row, column+1);
    }
    else{
        System.out.println();
        traingle1(row-1, 0);
    }
}
static void traingle2(int row,int column){
    if(row==0){
        return;
    }
    if(column<row){
        traingle2(row, column+1);
        System.out.print("*");
    }
    else{
        traingle2(row-1, 0);
        System.out.println();
    }
}
}