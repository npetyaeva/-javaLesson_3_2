## Урок 3. Задача №2

[Ссылка на код Main.java](https://github.com/npetyaeva/javaLesson_3_2/blob/master/src/Main.java)

```java
public class Main {

    public static void main(String[] args) {

        BmiService bmi = new BmiService();
        float resultBmi = bmi.calculate(45F, 1.70F);
        System.out.printf("Ваш Индекс массы тела: %.2f", resultBmi);
    }
}
```

[Ссылка на код BmiService.java](https://github.com/npetyaeva/javaLesson_3_2/blob/master/src/BonusMilesService.java)

```java
public class BmiService {

    public float calculate(float mass, float height) {
        return mass / (height*height);
    }
}
```
