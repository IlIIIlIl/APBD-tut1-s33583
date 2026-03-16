public class MathFunctions {

    public int CalculateMax(int[] values) {
       int maximilian = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maximillian) {
                maximillian = values[i];
            }
        }
        return maximillian;
    }


    public int CalculateMin(int[] values) {
       int min = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

}