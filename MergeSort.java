/*
정렬이란 데이터의 집합을 일정한 순서로 줄지어 늘어서도록 바꾸는 작업
작은 값이 앞으로 => 오름차순(ascending)
큰 값이 앞으로 => 내림차순(descending)
+재귀 써서 하는 방법도 있음(여기선 소개하지 않는다)
*/

//병합정렬 : 앞부분과 뒷부분을 나누어 각각 정렬후 병합 =>반복
class Main {
  //정렬을 마친 배열 a, b를 병합해서 배열 c에 저장
  static void Merge(int[] a, int na, int[] b, int nb, int[] c ){
    int pa = 0; //배열 a,b,c 스캔할 때 선택한 요소의 인덱스
    int pb = 0;
    int pc = 0;
    //배열 a에서 선택한 요소 a[pa] 와 배열 b에서 선택한 요소 b[pb]를 비교해서 작은 값을 c[pc]에 저장한다. 그런 다음 pb, pc를 한칸 옮기고 pa는 그대로 둔다.
    //pa와 pb가 가리키는 값을 비교해서 작은 값을 c[pc]에 대입하는 작업을 반복수행한다(pa가 배열 a의 끝에 다다르거나 pb가 배열 b의 끝에 다다를 때 까지)

    while (pa < na && pb < nb)
      c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];//*********
  
    //만약 남는애들이 있으면 넣어준다
    while (pa < na) {
      c[pc++] = a[pa++];
    }
    while (pb < nb) {
      c[pc++] = b[pb++];
    }
  }

  //미리 정렬이 되어 있어야 함.
  public static void main(String[] args) {
    int[] a = {2,4,6,8,11,13};
    int[] b = {1,2,3,4,9,16,21};
    int[] c = new int [13];

    System.out.println("두 배열의 병합정렬");
      
    Merge(a,a.length,b,b.length,c);

    for (int i = 0; i < c.length; i++){
      System.out.printf("c[%d] = %d\n",i,c[i]);
    }
  
  }
}
