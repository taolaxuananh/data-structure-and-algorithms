public class Main {
    public static void main(String[] args) {
        var removeElement = new _27_Remove_Element();
        int[] array = {0,1,2,2,3,0,4,2,2};
        int size = removeElement.removeElement(array, 2);
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
