package lesson_8;

public class StringArray implements Collection{
    public String[] arr;
    public int nextElem;

    public StringArray() {

        this.arr = new String[5];
        this.nextElem = 0;
    }
    public StringArray(int capacity) {

        this.arr = new String[capacity];
    }

    public boolean add(int index, String value){
        String temp = null;
        if(index<0 || index>=arr.length){
            return false;
        }
        if(nextElem >= arr.length){
            return false;
        }
        try {
            for (int i = 0; i < arr.length; i++) {
                if (i == index) {
                    temp = arr[i];
                    arr[i] = value;
                } else if (i > index) {
                    String temp2 = arr[i];
                    arr[i] = temp;
                    temp = temp2;
                }

            }
            nextElem++;
            return true;
        }
        catch (Exception e){
            System.out.println(e);
            return false;
        }


    }
    public boolean add(String value){
        if(nextElem >=arr.length){
            System.out.println("Coudn't add new element. Array is full.");
            return false;
        }
        else{
            arr[nextElem] = value;
            nextElem++;
            return true;
        }
    }
    public boolean delete(int index){

        if (index < 0 || index > nextElem) {
            return false;
        }

        for (int i = index; i < nextElem-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[nextElem-1] = null;
        nextElem--;
        return true;

    }
    public boolean delete(String value){
        boolean flag = false;
        for(int i = 0; i<= nextElem-1; i++){

            if(flag){

                if(i == nextElem-1){
                    arr[nextElem-1] = null;
                    nextElem--;
                }

                String temp = arr[i+1];
                arr[i] = temp;
            }
            else if(arr[i].equals(value)){
                String temp = arr[i+1];
                arr[i] = temp;
                flag=true;
            }
        }
        return flag ? true : false;

    }
    public String get(int index){
        if(index > nextElem-1){
            return null;
        }
        for(int i = 0; i<= nextElem-1; i++){
            if(i==index) return arr[i];
        }
        return null;

    }

    @Override
    public boolean contain(String o) {
        for(int i = 0; i<=nextElem-1;i++){
            if(o == arr[i])
                return true;
            
        }
        return false;
    }

    @Override
    public boolean equals(Collection collection) {
        if (this == collection) {
            return true;
        }


        if (collection == null || getClass() != collection.getClass()) {
            return false;
        }


        StringArray other = (StringArray) collection;

        for(int i = 0; i<nextElem-1;i++){
            if(arr[i].equals(other.arr[i]) != true){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean clear() {
        for(int i = 0; i<nextElem; i++){
            arr[i] = null;
        }
        return true;
    }

    @Override
    public int size() {
        return nextElem;
    }

    public void printArray(){
        for(var i : arr){
            System.out.println(i);
        }
    }

}
