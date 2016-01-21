public class MyArrayList{
    private String[] dataStore;
    private int back;
    public MyArrayList(){
        dataStore = new String[20];
        back = 0;
    }
    public int size(){
        return dataStore.length;
    }
    public String get(int index){
        return dataStore[index];
    }
    public void add(String value){
        checkSpace();
        dataStore[back] = value;
        back += 1;
    }
    private void doubleInSize(){
        String[] newDataStore = new String[size() * 2];
        for(int i = 0; i < size(); i++){
            newDataStore[i] = dataStore[i];
        }
        dataStore = newDataStore;
    }
    private void checkSpace(){
        if(dataStore[size() - 1] != null){
            doubleInSize();
        }
    }
    public void set(int index, String value){
        dataStore[index] = value;
    }
    public void add(int index, String value){
        if(dataStore[index] == null){
            dataStore[index] = value;
        } else {
            checkSpace();
            for(int i = size(); i > index; i--){
                dataStore[i] = dataStore[i - 1];   
            }
            dataStore[index] = value;
        }
        back += 1;
    }
    public void remove(int index){
        for(int i = index; i < size() - 1; i++){
            dataStore[i] = dataStore[i + 1];
        }
        dataStore[size() - 1] = null;
        back -= 1;
    }
    public void display(){
        for(int i = 0; i < back; i++){
            System.out.println("The value at index(" + i + ") is " + dataStore[i]);
        }
    }
}