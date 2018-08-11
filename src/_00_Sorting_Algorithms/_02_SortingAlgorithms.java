package _00_Sorting_Algorithms;

import javax.swing.JOptionPane;

/*
 * INSTRUCTIONS
 * Run the demo VisualSorter.jar to see the finished product. 
 * Then complete the steps in the classes in the following order:
 * 
 * BubbleSorter
 * SelectionSorter
 * InsertionSorter
 * QuickSorter
 * MergeSorter
 * HeapSorter
 * BogoSorter
 * yo sé bien que estoy afuera
 * pero el día en que yo me muera
 * sé que tendras que llorar
 * 
 * llorar y llorar
 * llorar y llorar
 * 
 * diras que no me quisiste
 * pero vas a estar muy triste
 * y así te me vas a quedar
 * 
 * unaaa piedraaaa en el camino
 * me enseñó mi destino
 * era rodar, y rodar
 */

public class _02_SortingAlgorithms {
	public static void main(String[] args) {
		String[] options = new String[] {"Bogo", "Heap", "Merge", "Quick","Insertion","Selection", "Bubble"};
		int input = JOptionPane.showOptionDialog(null, "Choose a sorting algorithm to visualize", "Sorting Algorithms", 0, 
				-1, null, options, 0);
		
		String choice = options[input];
		
		switch(choice) {
		case "Bubble":{
			new SortingVisualizer(new BubbleSorter());
			break;
		}
		case "Selection":{
			new SortingVisualizer(new SelectionSorter());
			break;
		}
		case "Insertion":{
			new SortingVisualizer(new InsertionSorter());
			break;
		}
		case "Quick":{
			new SortingVisualizer(new QuickSorter());
			break;
		}
		case "Merge":{
			new SortingVisualizer(new MergeSorter());
			break;
		}
		case "Heap":{
			new SortingVisualizer(new HeapSorter());
			break;
		}
		case "Bogo":{
			new SortingVisualizer(new BogoSorter());
			break;
		}
		}
	}
}
