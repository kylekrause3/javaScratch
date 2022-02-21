public class Main {
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort(new int[]{0,4,2,3, 1000, 0});
		
		System.out.println(sort);
		sort.sort_s2L();
		System.out.println(sort);
    }
}
