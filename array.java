public class ObjectArrayExample {
    public static void main(String[] args) {
      
        Object[] mixedData = {
            "Id123",                  
            42,                     
            new double[]{3.14, 2.71}    
        };

        System.out.println("--- Iterating through the Object Array ---");

        for (int i = 0; i < mixedData.length; i++) {
            Object element = mixedData[i];

           
            if (element instanceof String) {
                System.out.println("Index " + i + " [String]: " + element);
            } 
            else if (element instanceof Integer) {
                System.out.println("Index " + i + " [Integer]: " + element);
            } 
            else if (element instanceof double[]) {
                double[] subArray = (double[]) element;
                System.out.print("Index " + i + " [double[]]: ");
                for (double d : subArray) {
                    System.out.print(d + " ");
                }
                System.out.println();
            }
        }
    }
}
