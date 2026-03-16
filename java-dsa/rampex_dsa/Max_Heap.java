public class Max_Heap {

    int arr[];
    int size;
    int n;

    Max_Heap(int size) {
        arr = new int[size];
        this.size = size;
        n = 0;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    void insert(int value) {
        arr[n] = value;
        int i = n;
        n++;

        while (i != 0 && arr[parent(i)] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    int getmax() {
        return arr[0];
    }

    int delete() {
        int root = arr[0];
        arr[0] = arr[n - 1];
        n--;
        maxheapify(0);
        return root;
    }

    int left(int i) {
        return (2 * i) + 1;
    }

    int right(int i) {
        return (2 * i) + 2;
    }

    void maxheapify(int i) {
        int left = left(i);
        int right = right(i);
        int largest = i;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            maxheapify(largest);
        }
    }

    public static void main(String[] args) {

        Max_Heap obj = new Max_Heap(10);

        obj.insert(20);
        obj.insert(15);
        obj.insert(30);
        obj.insert(5);

        System.out.println(obj.getmax());
        System.out.println(obj.delete());
        System.out.println(obj.getmax());
    }
}