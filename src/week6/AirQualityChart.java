
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import javax.swing.*;
import java.util.*;

public class AirQualityChart {

    public static void main(String[] args) {
String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
double[] pm25Values = {12.5, 15.2, 18.3, 20.1, 17.6, 14.9, 13.0}
ArrayList<String> daysList = new ArrayList<>();
daysList.add("Mon");
daysList.add("Tue");
daysList.add("Wed");
daysList.add("Thu");
daysList.add("Fri");
daysList.add("Sat");
daysList.add("Sun");

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

       
        for (int i = 0; i < days.length; i++) {
            

            String currentDay = days[i];        
            double currentValue = pm25Values[i]; 
            
    
            dataset.addValue(currentValue, "PM2.5", currentDay);
            
        
        // ============================================================
        // 🔹 CREATE THE CHART (JFreeChart magic)
        // ============================================================
        
        // Build a bar chart with title and axis labels
        JFreeChart chart = ChartFactory.createBarChart(
            "Weekly Air Quality Report",  // Main title (top of chart)
            "Day of Week",                // X-axis label (bottom)
            "PM2.5 (µg/m³)",              // Y-axis label (left side)
            dataset                       // Our data from the loop above
        );
        
        
        // ============================================================
        // 🔹 DISPLAY THE CHART IN A WINDOW
        // ============================================================
        
        // Create a window (JFrame) to show the chart
        ChartFrame frame = new ChartFrame("Air Quality Dashboard", chart);
        
        // Set window size (width=800 pixels, height=600 pixels)
        frame.setSize(800, 600);
        
        // Center the window on screen
        frame.setLocationRelativeTo(null);
        
        // Make the window visible (show it!)
        frame.setVisible(true);
    }
}