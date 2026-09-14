# OOP2026
# Homework 전체정리


### Homework 0
```java
public class Homework1{
  public static void main(String []args){
    int i, j;
    for(i=0; i<10; i++) {
      for(j=0; j<10; j++) {
        System.out.print("#");
      }
      System.out.println("");
    }
  }
}

```
![](../images/READNAME.jpg)

### Homework1

```java

public class Homework1 {
	
    public static void main(String[] args) {
        int i, j;

        System.out.println();
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        System.out.println();
        for (i = 1; i <= 10; i++) {
            for (j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        System.out.println();
        for (i = 10; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        System.out.println();
        for (i = 10; i >= 1; i--) {
            for (j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
```
### Homework1결과화면 
![](../images/hw1.png)

### Homework2
```java

package homework;

public class Homework2 {
    public static void main(String[] args) {
        int n = 20;
        long[] fib = new long[n];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }
}

```

### Homework2결과화면
![](../images/hw2.png)

### Homework3
```java
package homework;

public class Homework3 {
    public static void main(String[] args) {
        int n = 20;
        long[] fib = new long[n];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 1; i < n; i++) {
            double ratio = (double) fib[i] / fib[i - 1];
            System.out.println(fib[i] + "/" + fib[i - 1] + "=" + ratio);
        }
    }
}
```

### Homework3결과화면
![](../images/hw3.png)

### Homework4
``` java
package homework;

public class Homework4 {
    public static void main(String[] args) {
        for (int dan = 1; dan <= 9; dan++) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(i + "*" + dan + "=" + (i * dan) + " ");
            }
            System.out.println();
        }
    }
}
```

### Homework4결과화면
![](../images/hw4.png)

### Homework5
```java
package homework;

public class Homework5 {
    public static void main(String[] args) {
        // Gregory-Leibniz series: 4/1 - 4/3 + 4/5 - 4/7 + ...
        double gregory = 0;
        int terms = 100000; 
        for (int k = 0; k < terms; k++) {
            double term = 4.0 / (2 * k + 1);
            if (k % 2 == 0) {
                gregory += term;
            } else {
                gregory -= term;
            }
        }
        System.out.println("Gregory-Leibniz 근사값: " + gregory);

        // Madhava series: sqrt(12) * sum( (-1/3)^k / (2k+1) )
        double madhava = 0;
        for (int k = 0; k < 20; k++) { 
            double term = Math.pow(-1.0 / 3.0, k) / (2 * k + 1);
            madhava += term;
        }
        madhava *= Math.sqrt(12);
        System.out.println("Madhava 근사값: " + madhava);

        System.out.println("실제 파이 값: " + Math.PI);
    }
}
```

### Homework5결과화면
![](../images/hw5.png)

### Homework6
```java
package homework;

public class Homework6 {
    public static void main(String[] args) {
        int n = 6; //
        int[][] binomial = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    binomial[i][j] = 1;
                } else {
                    binomial[i][j] = binomial[i - 1][j - 1] + binomial[i - 1][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomial[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### Homework6결과화면
![](../images/hw6.png)

### Homework7
```java
package homework;

public class Homework7 {
    public static void main(String[] args) {
        int[] data = new int[20];

        // 랜덤 값 채우기
        for (int i = 0; i < 20; i++) {
            data[i] = (int) (Math.random() * 100);
        }

        System.out.println("정렬 전:");
        for (int i = 0; i < 20; i++) {
            System.out.println(data[i]);
        }

        // 선택 정렬 (오름차순)
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }

        System.out.println("정렬 후:");
        for (int i = 0; i < 20; i++) {
            System.out.println(data[i]);
        }
    }
}
```

### Homework7결과화면
![](../images/hw7.png)

### Homework8
``` java
package homework;

public class Homework8 {
    public static void main(String[] args) {
        int students = 30; // 학생 수
        int subjects = 4; // 국어, 영어, 수학, 과학
        int[][] score = new int[students][subjects + 1]; // 마지막 칸은 합계용

        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < subjects; j++) {
                score[i][j] = (int) (Math.random() * 101); // 0~100
                sum += score[i][j];
            }
            score[i][subjects] = sum;
        }

        for (int i = 0; i < students; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < subjects; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println("sum=" + score[i][subjects]);
        }
    }
}                        
```

# Homework8결과화면
![](../images/hw8.png)
