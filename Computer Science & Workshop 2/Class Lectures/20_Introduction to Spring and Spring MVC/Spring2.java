public class spring2 {
    public static void main(String[] args) {
        CallVolume cv = new Box();
        int volume = cv.volResult(5, 3, 2);
        System.out.println(volume);
    }
}

interface CallVolume{ int volResult(int l, int b, int h); }

class Box implements CallVolume{
    public int volResult(int l, int b, int h){
        return l*b*h;
    }
}
    
// 30