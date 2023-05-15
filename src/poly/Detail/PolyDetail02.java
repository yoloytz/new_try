package poly.Detail;

public class PolyDetail02 {
    public static void main(String[] args) {

        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
        String str = new String();
        str = "云天泽";
        System.out.println(str);
        System.out.println(str instanceof Object);
    }


}

class AA{

}

class BB extends AA{

}