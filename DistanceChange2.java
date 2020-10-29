class Main {

    public static final String[] names = {"Cm", "M","Inch","Feet","Yard"};
    public static double[] distance = {1.0000,0.010,0.3937,0.0328,0.0109};
    
  public static double[][] convert(){
    //2차원 동적배열(5*5)
    double[][] mm = new double[distance.length][distance.length];
    for (int i = 0; i < distance.length; i++){
      for (int j = 0; j < distance.length; j++){
        mm[i][j] = distance[j]/distance[i];
      }
    }
    return mm;
  }

  public static void main(String[] args) {
    double[][] conv = convert();  
  
    System.out.printf("\t\t\t");
    for (int i = 0; i < names.length; i++){
      System.out.printf("%s\t\t\t",names[i]);
    }

    for(int i = 0; i < conv.length; i++){
      System.out.printf("%s\t",names[i]);
      for (int j = 0; j < conv[i].length; j++){
        System.out.printf("%f\t",conv[i][j]);
      }
      System.out.println();
    }
    
  }
}
