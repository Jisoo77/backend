package a1128.sort;

import java.util.Arrays;

public class SeclectionSort {
    public static void main(String[] args) {
        int[] array = {64,34,25,17,22,11,90};
        SeclectionSort(array);
        System.out.println();
        System.out.println("선택정렬로 정렬된 배열 : " + Arrays.toString(array));
        // 배열을 문자열로 변환후 출력
    }

    private static void SeclectionSort(int[] array) {
        int n = array.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex]; // 제일 작은값이 들어있는 배열번호 내용
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
