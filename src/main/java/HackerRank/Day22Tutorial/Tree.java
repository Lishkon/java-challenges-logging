package HackerRank.Day22Tutorial;

public interface Tree<D extends Comparable> {
    boolean isEmpty();
    int cardinality();
    boolean member(D elt);
    NonEmptyBST<D> add(D elt);

}
