package interfaces;

public class Cube {

    int length;
    int height;
    int width;


    public Cube( ){ // default constructor
        this.width = 2;
        this.height = 3;
        this.length = 4;

    }



    public Cube( int length, int height, int width){ // constructor over loading
            this.width = width;
            this.height = height;
            this.length = length;

    }

   public  int getVolume (){
        return (this.length * this.height * this.width);
    }
}

