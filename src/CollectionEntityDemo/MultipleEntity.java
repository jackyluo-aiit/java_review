package CollectionEntityDemo;

public class MultipleEntity <T, E>{
    private T t;

    private E e;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return t +
                ", " + e;
    }
}
