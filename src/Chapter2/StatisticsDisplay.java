package Chapter2;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {
    private ArrayList<Float> history;
    private float average;
    private float minimum;
    private float maximum;
    private Subject weatherStation;

    public StatisticsDisplay(Subject weatherStation) {
        this.history = new ArrayList<Float>();
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + average + "/" + maximum + "/" + minimum);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        maximum = temp;
        minimum = temp;
        if (!history.isEmpty()) {
            for (float temperature : history) {
                if (maximum < temperature) {
                    maximum = temperature;
                }

                if (minimum > temperature) {
                    minimum = temperature;
                }
            }
        }
        history.add(temp);
        average = (minimum + maximum) / 2;

        display();
    }
}
