public class BookProduct extends Product {

    public BookProduct(String name) {
        //call constructor from parent class
        //super() - constructor from parent
        //super.someMethod() - method from parent
        //super.name - call variable from parent class
        super(name);
    }

    @Override
    public String toString() {
        return "Book Product :  name = " + getName();
    }
}
