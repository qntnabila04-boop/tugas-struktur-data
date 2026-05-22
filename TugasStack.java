import java.util.LinkedList;

public class TugasStack {

    public static void main(String[] args) {
        LinkedList<integer> stack = new LinkedList<>();
        int[] dataMasuk = {15, 25, 35, 45, 55, 65, 75, 85,}; // Minimal 8 data

        System.out.println("--- PROSES PUSH ---");
        for (int data : dataMasuk) {
            stack.push(data); // Menambahkan data ke posisi teratas (awal list)
            System.out.println("Push ke stack: " + data);
        }

        System.out.println("\nIsi Stack SEBELUM proses Pop (Top -> Bottom) :");
        System.out.println(stack);

        System.out.println("\n--- PROSES POP ---");
        //Mengambil 2 data teratas
        System.out.println("Pop dari stack: " + stack.pop()); 
        System.out.println("Pop dari stack: " + stack.pop());

        System.out.println("\nIsi Stack SESUDAH proses Pop (Top -> Bottom) :");
        System.out.println(stack);
    
    }
}