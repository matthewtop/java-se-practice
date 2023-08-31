//package pl.globallogic.exercises.intermediate;
//Create an abstract class to define items that can be stored in a tree.
//        Implement the following:
//        1. ListItem (abstract class)
//        - It has three protected fields. Two ListItems called rightLink and leftLink,
//        and an Object called value.
//        - A constructor that takes an Object and initialises the field value with the
//        parameter that was passed in.
//        - And seven methods:
//        - next(), setNext(), previous(), setPrevious() and compareTo() which are
//        package-private and abstract (see child class for declaration).
//        - getValue(), takes no parameters and returns its value.
//        - setValue(), takes an Object and assigns it to value.
//        2. Node (concrete class)
//        - It extends ListItem.
//        - It has a constructor that takes an Object, then calls its parent constructor with the
//        parameter that was passed in.
//        - And five methods which are package-private:
//        - next(), takes no parameters and returns the ListItem to its right.
//        - setNext(), takes a ListItem and sets it as its rightLink, then it returns
//        rightLink.
//        - previous(), takes no parameters and returns the ListItem to its left.
//        - setPrevious(), takes a ListItem and sets it as its leftLink, then it returns
//        leftLink.
//        - compareTo(), takes a ListItem and compares it to the ListItem that called
//        this method. Use value from ListItem for comparison. If this value is greater than
//        the value that was passed in, then it should return a number greater than zero. If vice
//        versa, then it should return a number less than zero, and zero if equal.
//        3. MyLinkedList (concrete class)
//        - It implements NodeList.
//        - It has one field of type ListItem called root.
//        - A constructor that takes a ListItem and initialises the field root with the newly
//        passed in parameter.
//        - And four methods:
//        - getRoot(), getter for root.
//        - addItem(), takes a ListItem and returns true if it was added successfully or
//        false otherwise. If the item is already present, it doesn't get added. Use compareTo()
//        to place the item in its proper order.
//        - removeItem(), takes a ListItem and returns true if it was removed
//        successfully or false otherwise.
//        - traverse(), takes the root as an argument and does not return anything. If the
//        root is null it prints out: The list is empty, otherwise print each value on a
//        separate line.
//        4. NodeList (interface)
//        - It has four methods:
//        - getRoot(), addItem(), removeItem() and traverse() which are
//        package-private and abstract (see child class for declaration).
//        5. SearchTree (concrete class)
//        - It implements NodeList.
//        - It has one field of type ListItem called root.
//        - A constructor that takes a ListItem and initialises the field root with the newly
//        passed in parameter.
//        - And five methods:
//        - getRoot(), getter for root.
//        - addItem(), same as MyLinkedList.
//        - removeItem(), same as MyLinkedList.
//        - performRemoval(), takes two ListItems, the item to be removed and its
//        parent. It doesn't return anything and is declared as private. Call this method from
//        removeItem() when the item is found.
//        - traverse(), takes the root as an argument and does not return anything. It uses
//        recursion to visit all the branches in the tree (Inorder). Print each value on a seperate
//        line.
//        TIP: The rules for adding an item to the linked tree are:
//        If the head of the tree is null, make the head refer to the item to be added.
//        If the item to be added is less than the current item in the tree, add the item before
//        the current item (i.e., make the previous item's "next" refer to the new item, and the new
//        item's "next" refer to the current item).
//        If the item to be added is greater than the current item, move onto the next item
//        and compare again (if there is no next item, then that is where the new item belongs).
//        TIP: When adding items to a Binary Search Tree, if the item to be added is less than the
//        current item - then move to the left.
//        If it is greater than the current item - then move to the right.
//        The new item is added when an attempt to move in the required direction would
//        involve following a null reference.
//        Once again, duplicates are not allowed.
//
//public class ex47AbstractClass {
//}
//
//
//abstract class ListItem{
//    protected ListItem rightLink;
//    protected ListItem leftLink;
//    protected Object value;
//
//    public ListItem(Object value){
//        this.value=value;
//    }
//
//    abstract ListItem next();
//    abstract ListItem setNext(ListItem item);
//    abstract ListItem previous();
//    abstract ListItem setPrevious(ListItem item);
//    abstract int compareTo(ListItem item);
//
//    public Object getValue(){
//        return value;
//    }
//
//    public void setValue(Object value){
//        this.value=value;
//    }
//
//}
//
//class Node extends ListItem{
//    Node(Object value){
//        super(value);
//    }
//
//    @Override
//    ListItem next(){
//        return this.rightLink;
//    }
//    @Override
//    ListItem setNext(ListItem item){
//        this.rightLink=item;
//        return this.rightLink;
//    }
//    @Override
//    ListItem previous(){
//        return this.leftLink;
//    }
//    @Override
//    ListItem setPrevious(ListItem item){
//        this.leftLink=item;
//        return this.leftLink;
//    }
//    @Override
//    int compareTo(ListItem item) {
//        if (item != null) {
//            return ((String) super.getValue()).compareTo((String) item.getValue());
//        } else {
//            return -1;
//        }
//    }
//}
//
//interface NodeList{
//    void getRoot();
//    boolean addItem(ListItem item);
//    boolean removeItem(ListItem item);
//    void traverse(ListItem root);
//}
//
//
//class MyLinkedList implements NodeList{
//    private ListItem root;
//
//    public MyLinkedList(ListItem root){
//        this.root=root;
//    }
//
//    @Override
//    public void getRoot(){
//        return root;
//    }
//
//    @Override
//    public boolean addItem(ListItem item) {
//        if(this.root == null){
//            this.root = item;
//            return true;
//        }
//
//        ListItem currentItem = this.root;
//        while(currentItem != null){
//            int comparison = (currentItem.compareTo(item));
//            if (comparison < 0){
//                if(currentItem.next() != null){
//                    currentItem = currentItem.next();
//                } else {
//                    currentItem.setNext(item);
//                    item.setPrevious(currentItem);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public boolean removeItem(ListItem item){
//        if (item != null) {
//            ListItem currentItem = this.root;
//            ListItem parentItem = currentItem;
//
//            while (currentItem != null) {
//                int comparison = currentItem.compareTo(item);
//                if (comparison == 0) {
//                    performRemoval(currentItem, parentItem);
//                    return true;
//                } else if (comparison < 0) {
//                    parentItem = currentItem;
//                    currentItem = currentItem.next();
//                } else {
//                    parentItem = currentItem;
//                    currentItem = currentItem.previous();
//                }
//            }
//        }
//        return false;
//    }
//
//
//    private void performRemoval(ListItem item, ListItem parent) {
//        if (item.next() == null) {
//            if (parent.next() == item) {
//                parent.setNext(item.previous());
//            } else if (parent.previous() == item) {
//                parent.setPrevious(item.previous());
//            } else {
//                root = item.previous();
//            }
//        } else if (item.previous() == null) {
//            if (parent.next() == item) {
//                parent.setNext(item.next());
//            } else if (parent.previous() == item) {
//                parent.setPrevious(item.next());
//            } else {
//                root = item.next();
//            }
//        } else {
//            ListItem current = item.next();
//            ListItem leftmostParent = item;
//            while (current.previous() != null) {
//                leftmostParent = current;
//                current = current.previous();
//            }
//            item.setValue(current.getValue());
//            if (leftmostParent == item) {
//                item.setNext(current.next());
//            } else {
//                leftmostParent.setPrevious(current.next());
//            }
//        }
//    }
//
//    @Override
//    public void traverse(ListItem root){
//        if (root==null){
//            System.out.println("The list is empty");
//            return;
//        }
//        if (root.previous() !=null){
//            traverse(root.previous());
//        }
//        System.out.println(root.getValue());
//        if (root.next() != null){
//            traverse(root.next());
//        }
//    }
//
//}
//class SearchTree implements NodeList{
//    private ListItem root;
//    public  SearchTree(ListItem root){
//        this.root=root;
//    }
//
//    @Override
//    public ListItem getRoot(){
//        return root;
//    }
//
//    @Override
//    public boolean addItem(ListItem newItem){
//        if (root==null){
//            root=newItem;
//            return true;
//        }
//
//        ListItem currentItem = root;
//        while (currentItem !=null){
//            int comparison = currentItem.compareTo(newItem);
//            if (comparison ==0){
//                return false;
//            } else if (comparison<0) {
//                if (currentItem.next() != null){
//                    currentItem = currentItem.next();
//                }
//                else {
//                    currentItem.setNext(newItem);
//                    return true;
//                }
//            }
//            else {
//                if (currentItem.previous() !=null){
//                    currentItem = currentItem.previous();
//                }
//                else {
//                    currentItem.setPrevious(newItem);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    private void performRemoval(ListItem item, ListItem parent) {
//        if (item.next() == null) {
//            if (parent.next() == item) {
//                parent.setNext(item.previous());
//            } else if (parent.previous() == item) {
//                parent.setPrevious(item.previous());
//            } else {
//                root = item.previous();
//            }
//        } else if (item.previous() == null) {
//            if (parent.next() == item) {
//                parent.setNext(item.next());
//            } else if (parent.previous() == item) {
//                parent.setPrevious(item.next());
//            } else {
//                root = item.next();
//            }
//        } else {
//            ListItem current = item.next();
//            ListItem leftmostParent = item;
//            while (current.previous() != null) {
//                leftmostParent = current;
//                current = current.previous();
//            }
//            item.setValue(current.getValue());
//            if (leftmostParent == item) {
//                item.setNext(current.next());
//            } else {
//                leftmostParent.setPrevious(current.next());
//            }
//        }
//    }
//
//
//}
