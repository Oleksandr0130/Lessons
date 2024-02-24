package lessons_29;

import lessons_26.MyList;

import java.lang.reflect.Array;

public class MyLinkedList<T> implements MyList<T>,MyQueue<T>{

    private Node<T> first;
    private Node<T> last;

    private int size;

    // метод добавление элемента в конец списка
    @Override
    public void add(T value) {
        if (first == null) {
            // не существует ни одного элемента, добавляемая Node станет первой и пока единственной
            first = new Node<>(value, null, null);
        } else if (last == null) {
            // существует только один узел first
            // нужно с права от first приклеить новую Node
            last = new Node<>(value, first, null);
            // надо организовать связь "на право" от Node first
            first.next = last;
        } else {
            // когда существует и first и last объект (обе ссылки не равны null)

            Node<T> temp = last;

            last = new Node<>(value, temp, null);
            temp.next = last;

        }
        size++;
    }

    // Добавить элемент слева

    public void addFirst(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
        } else if (last == null) {
            last = first;

            first = new Node<>(value, null, last);
            last.previous = first;

        } else {
            // все остальные состояния у нас две или больше Node
            Node<T> temp = first;

            first = new Node<>(value, null, temp);
            temp.previous = first;
        }
        size++;
    }

    @Override
    public void addLast(T value) {
        add(value);
    }

    // Удаляем самый первый (левый) элемент
    public T remove() {
        if (size == 0) return null;

        // если Node < 0 , мы должны удалить Node first
        T value = first.value;
        if (size == 1) {
            first = null;

        } else if (size == 2) {
            // у нас только две Node first и last
            // мы должны сделать last -> first
            first = last;
            //first = first.next;// альтернативный способ перекинуть ссылку
            first.previous = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;
        }
        size--;
        return value;
    }

    @Override
    public T removeFirst() {
       return remove();
    }

    // Удаление справа

    public T removeLast(){
        if (size == 0) return null;

        T value;

        if (size == 1){
            // только одна Node - first
            value = first.value;
            first = null;
        }else if (size == 2) { // сценарии в которой мы удаляем Node last
        value = last.value;
        last = null;
        first.next = null;
        }else{
            value = last.value;
            last = last.previous;
            last.next = null;
        }

        size--;
        return value;
    }

    @Override
    public void addAll(T... values) {
        for (T value: values){
            add(value);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T value) {
        int index = 0;
        // Перебирать мой список, начиная с головы
        // проверить - совпадает ли value в текущем узле с тем, что мы ищем. Если совпадает - вернуть индекс
        // не забыть увеличить мой счетчик индекса
        //проверить значение в след. -элементе, если оно есть

        Node<T> cursor = first;
        while (cursor != null){
            if (cursor.value.equals(value)){
                return index;
            }
            index++;
            cursor = cursor.next;
        }

        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        int index = size -1;

        Node<T> cursor = last;
        // когда есть только Node first - цикл не выполнится ни разу
        while (cursor != null){
            if (cursor.value.equals(value)){
                return index;
            }
            index--;
            cursor = cursor.previous;
        }
        // обработка сценария, когда есть только Node first
        if (size != 0 && first.value.equals(value))return 0;

        return -1;
    }

    private void removeNode(Node<T> node){
        if (node == first){
            remove();
            return;
        }

        if ((node == last)){
            removeLast();
            return;
        }

        node.previous.next = node.next;
        node.next.previous = node.previous;

        //не обязательно
        node = null;

        size--;

    }

    @Override
    public boolean contains(T value) {
        Node<T> cursor = first;
        while (cursor != null){
            if (cursor.value.equals(value)){
                return true;
            }
            cursor = cursor.next;
        }
        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] toArray() {
        T[] result = (T[]) Array.newInstance(first.value.getClass(), size);
        Node<T> cursor = first;
        int index = 0;
        while (cursor != null){
            result [index++] = cursor.value;
            cursor = cursor.next;
        }

        return result;
    }

    @Override
    public boolean remove(T value) {
        Node<T> cursor = first;
        while (cursor != null){
            if (cursor.value.equals(value)){
                removeNode(cursor);
                return true;
            }
            cursor = cursor.next;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 && index >= size){

        return null;
        }
        Node<T> cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }
        T removeValue = cursor.value;
        removeNode(cursor);
        return removeValue;
    }



    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null; // Возвращаем null, чтобы указать на ошибку
        }

        Node<T> cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }

        return cursor.value;
    }

    @Override
    public T getFirst() {
        if (first == null) return null;

        return first.value;
    }

    @Override
    public T getLast() {
        if (last == null){
            if (first == null)return null;
        }else {
            return first.value;
        }
        return last.value;
    }

    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            return;
        }

        Node<T> cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }

        cursor.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            sb.append(first.value);
            Node<T> cursor = first.next;
            while (cursor != null) {
                sb.append(", ");
                sb.append(cursor.value);
                cursor = cursor.next;
            }
        }
        sb.append("]");
        return sb.toString();
    }


    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }

    }
}
