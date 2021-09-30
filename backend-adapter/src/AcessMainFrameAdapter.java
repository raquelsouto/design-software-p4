import mainframe.AcessToMainFrame;

public class AcessMainFrameAdapter implements DataPersistence {

    private AcessToMainFrame mainframe = new AcessToMainFrame();
    
    @Override
    public void enviarComandos(String sql) {
        mainframe.prepareMainFrame();
        mainframe.doCommand(sql);
        
    }

}
