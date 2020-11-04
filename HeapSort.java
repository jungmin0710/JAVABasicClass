/*
힙정렬(HeapSort) : 힙(Heap)을 사용해 정렬하는 알고리즘. 
힙은 부모의 값이 자식의 값보다 항상 크다는 조건을 만족하는 완전이진트리(부모 하나에 자식 둘의 트리구조)이다.
원래 힙은 '쌓아두다' 혹은 '쌓아둔 더미'라는 단어다. 
부모는 a[(i-1)/2]..?하다말았음

힙정렬은 가장 큰 값이 루트(꼭대기)에 위치한다는 특성을 이용한 정렬 알고리즘이다. 
힙에서 가장 큰 값 루트를 꺼내는 작업을 반복하여 그 값을 늘어놓으면 배열은 정렬을 마치게 된다.

단계1) 루트를 꺼낸다
단계2) 마지막 요소를 루트로 이동한다
단계3) 자기보다 큰 값을 가지는 자식요소와 자리를 바꾸어 아래로 내려보내는 작업을 반복한다. 이 때 자식의 값이 작거나 앞에 다다르면 작업이 종료
*/

import java.util.Scanner;
// 힙 정렬

class Main {
   // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다. 
   static void swap(int[] a, int idx1, int idx2) {
      int t = a[idx1];  
      a[idx1] = a[idx2];  
      a[idx2] = t;
   }

   // a[left] ~ a[right]를 힙으로 만듭니다. 
   static void downHeap(int[] a, int left, int right) {
      int temp = a[left];            // 루트
      int child;                  // 큰 값을 가진 노드
      int parent;                  // 부모

      for (parent = left; parent < (right + 1) / 2; parent = child) {
         int cl = parent * 2 + 1;                     // 왼쪽 자식
         int cr = cl + 1;                           // 오른쪽 자식
         child = (cr <= right && a[cr] > a[cl]) ? cr : cl;   // 큰 값을 가진 노드를 자식에 대입 
         if (temp >= a[child])
            break;
         a[parent] = a[child];
      }
      a[parent] = temp;
   }

   // 힙 정렬
   static void heapSort(int[] a, int n) {
      for (int i = (n - 1) / 2; i >= 0; i--)   // a[i] ~ a[n-1]를 힙으로 만들기
         downHeap(a, i, n - 1);

      for (int i = n - 1; i > 0; i--) {
         swap(a, 0, i);            // 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
         downHeap(a, 0, i - 1);      // a[0] ~ a[i-1]을 힙으로 만듭니다.
      }
   }

   public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);

      System.out.println("힙 정렬");
      System.out.print("요솟수：");
      int nx = stdIn.nextInt();
      int[] x = new int[nx];

      for (int i = 0; i < nx; i++) {
         System.out.print("x[" + i + "]：");
         x[i] = stdIn.nextInt();
      }

      heapSort(x, nx);   // 배열 x를 힙 정렬합니다.

      System.out.println("오름차순으로 정렬했습니다.");
      for (int i = 0; i < nx; i++)
         System.out.println("x[" + i + "]＝" + x[i]);
   }
}
