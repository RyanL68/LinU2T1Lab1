public class CatRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat("adam",8,6);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("soysauce", 3, 19);
        cat2.introduce();
        cat2.printCatInfo();
    }
}