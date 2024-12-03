import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    // Method to generate Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(); // Initialize the triangle

        // Base case: Add the first row (only one element, 1)
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1); // First row is [1]
        triangle.add(firstRow);

        // Build each subsequent row
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1); // Get the previous row
            List<Integer> currRow = new ArrayList<>();  // Create a new row

            // First element of the row is always 1
            currRow.add(1);

            // Compute the middle elements
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j)); // Sum of two elements above
            }

            // Last element of the row is always 1
            currRow.add(1);

            // Add the current row to the triangle
            triangle.add(currRow);
        }

        return triangle;
    }

    // Main method to test the code
    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle(); // Create an instance of PascalTriangle
        int numRows = 5; // Number of rows to generate

        // Call the generate method and print the result
        List<List<Integer>> result = pt.generate(numRows);

        // Print Pascal's Triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
