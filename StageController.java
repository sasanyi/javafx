package javafxsanyi;

import java.util.HashMap;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author SchaferAkos
 */
public class StageController {

    private static Stage root_stage;
    private static HashMap<String, Scene> scene_map = new HashMap<>();
    private static HashMap<String, Parent> view_map = new HashMap<>();

    public static Stage getRoot_stage() {
        return root_stage;
    }

    public static void setRoot_stage(Stage root) {
        root_stage = root;
    }
    
    public static void addView(String name, Parent fxml){
        view_map.put(name, fxml);
    }

    public static void addScene(String name, Scene scene){
        scene_map.put(name, scene);
    }
    
    public static Parent getView(String key){
        return view_map.get(key);
    }
    
    public static void CreateView(String str) {
        System.out.print("Create VIEW");
        root_stage.setScene(scene_map.get(str));
        root_stage.show();
    }
    
    public static void CloseView(){
        System.out.print("Close VIEW");
        root_stage.hide();
    }

}
