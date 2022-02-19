/***
 * StackList.java
 * @since 17/02/2022
 * Clase stack con list
 */

public class StackList<E> extends AbstractStack<E> {

    private LinkedList<E> stack;

    public StackList(String list){ //el parametro llama la lista a ser creada
        ListFactory<E> lFactory = new ListFactory<E>();
        this.setStack(lFactory.getList(list));
    }

    public LinkedList<E> getStack() {
        return stack;
    }

    public void setStack(LinkedList<E> stack) {
        this.stack = stack;
    }

    @Override
    public void add(E item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public E remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
