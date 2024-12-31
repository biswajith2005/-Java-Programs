public class Patterns {
    public Patterns() {
    }
 
    public static void hollowRectangle(int var0, int var1) {
       for(int var2 = 1; var2 <= var0; ++var2) {
          for(int var3 = 1; var3 <= var1; ++var3) {
             if (var2 != 1 && var3 != 1 && var2 != var0 && var3 != var1) {
                   System.out.print(" ");
             } else {
                   System.out.print("*");
             }
          }
 
          System.out.println();
       }
 
       }
 
       public static void inverted_rotated_halfPyramid(int var0) {
       for(int var1 = 1; var1 <= var0; ++var1) {
          int var2;
          for(var2 = 1; var2 <= var0 - var1; ++var2) {
             System.out.print(" ");
          }
 
          for(var2 = 1; var2 <= var1; ++var2) {
             System.out.print("*");
          }
 
       System.out.println();
    }
 
    }
 
    public static void inverted_halfPyramid_withNumbers(int var0) {
    for(int var1 = 1; var1 <= var0; ++var1) {
    for(int var2 = 1; var2 <= var0 - var1 + 1; ++var2) {
             System.out.print(var2);
    }
 
       System.out.println();
    }
 
    }
 
    public static void floyds_triangle(int var0) {
       int var1 = 1;
 
       for(int var2 = 1; var2 <= var0; ++var2) {
          for(int var3 = 1; var3 <= var2; ++var3) {
             System.out.print("" + var1 + " ");
             ++var1;
          }
          System.out.println();
       }
 
    }
    public static void zero_one_triangle(int var0) {
       for(int var1 = 1; var1 <= var0; ++var1) {
          for(int var2 = 1; var2 <= var1; ++var2) {
             if ((var1 + var2) % 2 == 0) {
                System.out.print("1");
             } else {
                System.out.print("0");
             }
          }
          System.out.println();
       }
 
    }
 
    public static void butterfly(int var0) {
       int var1;
       int var2;
       for(var1 = 1; var1 <= var0; ++var1) {
          for(var2 = 1; var2 <= var1; ++var2) {
             System.out.print("*");
          }
 
           for(var2 = 1; var2 <= 2 * (var0 - var1); ++var2) {
             System.out.print(" ");
          }
 
          for(var2 = 1; var2 <= var1; ++var2) {
             System.out.print("*");
          }
 
          System.out.println();
       }
 
       for(var1 = var0; var1 >= 1; --var1) {
          for(var2 = 1; var2 <= var1; ++var2) {
             System.out.print("*");
          }
 
           for(var2 = 1; var2 <= 2 * (var0 - var1); ++var2) {
             System.out.print(" ");
          }
 
          for(var2 = 1; var2 <= var1; ++var2) {
             System.out.print("*");
          }
 
          System.out.println();
          }
 
    }
 
       public static void solid_rhombus(int var0) {
       for(int var1 = 1; var1 <= var0; ++var1) {
          int var2;
             for(var2 = 1; var2 <= var0 - var1; ++var2) {
                System.out.print(" ");
             }
             
             for(var2 = 1; var2 <= var0; ++var2) {
                System.out.print("*");
             }
             
             System.out.println();
          }
 
       }
 
       public static void hollow_rhombus(int var0) {
          for(int var1 = 1; var1 <= var0; ++var1) {
             int var2;
             for(var2 = 1; var2 <= var0 - var1; ++var2) {
                System.out.print(" ");
             }
 
          for(var2 = 1; var2 <= var0; ++var2) {
             if (var1 != 1 && var2 != 1 && var1 != var0 && var2 != var0) {
                System.out.print(" ");
             } else {
                System.out.print("*");
             }
          }
          System.out.println();
       }
 
    }
 
    public static void diamond(int var0) {
       int var1;
       int var2;
       for(var1 = 1; var1 <= var0; ++var1) {
          for(var2 = 1; var2 <= var0 - var1; ++var2) {
             System.out.print(" ");
          }
 
           for(var2 = 1; var2 <= 2 * var1 - 1; ++var2) {
                System.out.print("*");
             }
 
             System.out.println();
          }
 
          for(var1 = var0; var1 >= 0; --var1) {
             for(var2 = 1; var2 <= var0 - var1; ++var2) {
                System.out.print(" ");
             }
 
           for(var2 = 1; var2 <= 2 * var1 - 1; ++var2) {
             System.out.print("*");
          }
 
          System.out.println();
       }
 
    }
 
    public static void number_pyramid(int var0) {
       for(int var1 = 1; var1 <= var0; ++var1) {
          int var2;
          for(var2 = 1; var2 <= var0 - var1; ++var2) {
             System.out.print(" ");
          }
 
          for(var2 = 1; var2 <= var1; ++var2) {
             System.out.print("" + var1 + " ");
          }
 
          System.out.println();
       }
 
    }
 
    public static void palindromic_pattern_withNumbers(int var0) {
       for(int var1 = 1; var1 <= var0; ++var1) {
          int var2;
          for(var2 = 1; var2 <= var0 - var1; ++var2) {
             System.out.print(" ");
          }
 
          for(var2 = var1; var2 >= 1; --var2) {
             System.out.print(var2);
          }
 
          for(var2 = 2; var2 <= var1; ++var2) {
             System.out.print(var2);
          }
 
          System.out.println();
       }
 
    }
 
    public static void main(String[] var0) {
       hollowRectangle(4, 5);
       inverted_rotated_halfPyramid(4);
       inverted_halfPyramid_withNumbers(5);
       floyds_triangle(5);
       zero_one_triangle(5);
       butterfly(4);
       solid_rhombus(5);
       hollow_rhombus(5);
       diamond(4);
       number_pyramid(5);
       palindromic_pattern_withNumbers(5);
    }
 }