package src;

import patern.Test;

class Box{
    double width;
    double height;
    double depth;

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
    Box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
}

public class InfoObject {
    public static void main(String[] args) {
        for ( int i=0; i<args . length; i++)
            System . out . println ( " a rgs [" + i + " ] : " +args [ i ]);
            Test test=new Test();
                test.sum1();

    }
}
