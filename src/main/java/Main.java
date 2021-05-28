import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Container<Shoe> pair = new Container<>(new Shoe(), new Shoe());

        pair.getLeft().setSize(10);
        pair.getLeft().setColour("Black");
        pair.getRight().setSize(10);
        pair.getRight().setColour("Black");

        List<Container> pairsOfShoes = new ArrayList<>();
        pairsOfShoes.add(pair);

        for (Container pairOfShoes : pairsOfShoes) {
            System.out.println(pairOfShoes.getLeft().toString() + " " + pairOfShoes.getRight().toString());
        }

        if (isShoe(pair.getLeft()) && isShoe(pair.getRight())) {
            System.out.println("We've got a pair of shoes!");
        }
    }

    public static <T> boolean isShoe(T object) {
        if (object.getClass() == Shoe.class) {
            return true;
        } else {
            return false;
        }
    }

}
