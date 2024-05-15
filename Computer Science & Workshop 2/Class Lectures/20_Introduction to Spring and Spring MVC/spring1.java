class spring1{
    public static void main(String[] args) {
        Box b = new Box(5, 3, 2);
        System.out.println("volume = " + b.volume );
    }
}

// Spring1, Box very interdependent on each other

class Box{
    public int volume;
    Box(int length, int breadth, int height){
        this.volume = length*breadth*height;
    }
}

// volume = 30