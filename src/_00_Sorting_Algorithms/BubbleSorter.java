package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean swappedLastRound = true;
		while(swappedLastRound) {
			// It hasn't been swapped yet this round
			swappedLastRound = false;
			// Sort through all
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i] > array[i+1]) {
					// If the lower value is larger, they are swapped, and because there has been a swap in the round the boolean is changed
					swappedLastRound = true;
					int first = array[i];
					array[i] = array[i+1];
					array[i+1] = first;
				}
				display.updateDisplay();
			}
		}
	}
	
}
