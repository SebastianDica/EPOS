package general;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JFrame;
import scenes.MainScene;
/**
 * This class sets up the frame and the main scene.
 * @author Sebastian
 *
 */
public class FrameBuilder extends Application 
{
	public static JFrame frame = null;

	/**
	 * A few general settings of the frame such as size,name and decoration.
	 * @param args The initial arguments.
	 */
	public static void buildFrame(String[] args) {
		frame = new JFrame("ExpressEPOS FastFood v.1.0");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setUndecorated(false);
		launch(args);
	}
	/**
	 * Settings the main scene.
	 * @param fxPanel the panel on which the scene will be placed.
	 */
	private static void initLoadScreen(JFXPanel fxPanel) {
		fxPanel.removeAll();
		MainScene load = new MainScene();
		Scene scene = load.returnScene();
		fxPanel.setScene(scene);
	}
	/**
	 * Starting up the application.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		JFXPanel fxPanel = new JFXPanel();
		fxPanel.setSize(frame.getWidth(),frame.getHeight());
		frame.add(fxPanel);
		initLoadScreen(fxPanel);
		frame.setVisible(true);
	}

}
