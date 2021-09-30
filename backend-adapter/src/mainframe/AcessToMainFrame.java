package mainframe;

public class AcessToMainFrame {
    
    private static boolean active = false;
    
    public static boolean doCommand(String command) {
        
       System.out.println("Executei o comando " + command);
       active = false;
       return true;
    }
    
    public static void prepareMainFrame() {
        active = true;
    }

}
