package scenes;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
/**
 * The main scene of the application. User interaction start-up begins here.
 * @author Sebastian
 *
 */
public class MainScene {
	public Scene returnScene() {
		Group root = new Group();
		Scene scene = new Scene(root, Color.BLACK);
		return (scene);
	}
}
