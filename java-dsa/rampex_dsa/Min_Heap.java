public class Min_Heap {

    int arr[];
    int size;
    int n;

    Min_Heap(int size) {
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

        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    int getmin() {
        return arr[0];
    }

    int delete() {
        int root = arr[0];
        arr[0] = arr[n - 1];
        n--;
        minheapify(0);
        return root;
    }

    int left(int i) {
        return (2 * i) + 1;
    }

    int right(int i) {
        return (2 * i) + 2;
    }

    void minheapify(int i) {
        int left = left(i);
        int right = right(i);
        int smallest = i;

        if (left < n && arr[left] < arr[smallest])
            smallest = left;

        if (right < n && arr[right] < arr[smallest])
            smallest = right;

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            minheapify(smallest);
        }
    }

    public static void main(String[] args) {

        Min_Heap obj = new Min_Heap(10);

        obj.insert(20);
        obj.insert(15);
        obj.insert(30);
        obj.insert(5);

        System.out.println(obj.getmin());
        System.out.println(obj.delete());
        System.out.println(obj.getmin());
    }
}