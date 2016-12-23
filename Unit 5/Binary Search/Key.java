public class Key
{
    int[] data;
    int size;

    public Key()
    {
         int [] temp = {1, 3, 6, 7, 10, 13, 16};
         data = temp;
    }

    public boolean binarySearch(int key) 
    {
        size = data.length;
        int low = 0;
        int high = size - 1;

        while(high >= low) {
            int middle = (low + high) / 2;
            if(data[middle] == key) {
                System.out.println("Found");
                return true;
            }
            if(data[middle] < key) {
                low = middle + 1;
                System.out.println("To low");
            }
            if(data[middle] > key) {
                high = middle - 1;
                Systezm.out.println("To high");
            }
        }
        return false;
    }
}

