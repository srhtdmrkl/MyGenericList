Java102 Generic Class Asssignment on patika.dev


# Goal of the assignment

Create a MyList class to hold a dynamic Array and get the data type dynamically.

# Details of the Class:

- The default size of the array should be 10 and the number of array elements should increase by a factor of 2 as needed.
- The class should have two types of constructor methods
- MyList() : if the empty construcros is used, the initial size of the array must be 10.
- MyList(int capacity) : the initial value of the array should be taken from the capacity parameter.
- size() : returns the number of elements in the array.
- getCapacity() : returns the capacity value of the array.
- add(T data) : should be used to add elements to the array of the class. If there is not enough space in the array, the array size should be doubled.
- get(int index) : return the value at the given index. Returns null if an invalid index is entered.
- remove(int index) : deletes the data at the given index and left shift the data following the deleted index. Returns null if an invalid index is given.
- set(int index, T data) : replaces the data at the given index with a new one. Returns null if an invalid index is given.
- String toString() : lists the elements in the array of the class.
- int indexOf(T data) : returns the index of the given object in the list. Returns -1 if the object is not in the list.
- int lastIndexOf(T data) : return the last index of the given item in the list. Returns -1 if the object is not in the list.
- boolean isEmpty() : tells if the list is empty.
- T[] toArray() : return the items in the list in the same order as an array.
- clear() : deletes all the items in the list, making it an empty list.
MyList<T> sublist(int start, int finish) : return a list of the index range given in the parameter.
- boolean contains(T data) : tells whether the value given in the parameter is in the array.
