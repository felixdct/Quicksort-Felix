/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author toledo
 */
public class Quicksort {

    static int[] Sort;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int numb= Integer.parseInt(JOptionPane.showInputDialog(null, "how many numbers would you like to sort?"));
        //int [] numbers = new int [15];
        /*for(int i=0;i<numb;i++){
        
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of the position: "+(i+1)+":"));
        }*/
        Quicksort a = new Quicksort();
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3};
        if (numbers.length == 1) {
            a.printSort(numbers);
        } else {
            a.quicksortOperation(numbers, 0, (numbers.length - 1));
            a.printSort(Sort);
        }
    }

    void quicksortOperation(int arr[], int left, int right) {
        Sort = arr;
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];
        /* partition */
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
            //JOptionPane.showMessageDialog(null, Arrays.toString(arr));
        }
        /* recursion */
        if (left < j) {
            quicksortOperation(arr, left, j);
        }
        if (i < right) {
            quicksortOperation(arr, i, right);
        }
    }

    void printSort(int[] numbers) {
        JOptionPane.showMessageDialog(null, Arrays.toString(numbers));
    }
}
