package javafxsanyi;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;

/**
 *
 * @author SchaferAkos
 */
public class FXMLRootController implements Initializable {

    @FXML
    private void loginButton(ActionEvent event) {
        System.out.println("Megnyomtam");
    }

    @FXML
    private void jmenuAdat(ActionEvent event) {
        System.out.println("Page1 megjelenik");
        StageController.CreateView("page1");
    }

    @FXML
    private void jmenuKilep(ActionEvent event) {
        System.out.println("Kilép");
       StageController.CloseView();

        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }
        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("ruti.png"));

        final PopupMenu popup = new PopupMenu();
        final TrayIcon trayIcon = new TrayIcon(image, "RouterProgram", popup);
        final SystemTray tray = SystemTray.getSystemTray();

        MenuItem exitItem = new MenuItem("Kilépés");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.exit(1);
            }

        });
        popup.add(exitItem);

        MenuItem openItem = new MenuItem("Megnyitás");
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                       StageController.CreateView("Root");
                    }
                });
            }
        }
        );
        popup.add(openItem);

        trayIcon.setPopupMenu(popup);

        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
        }
    }

    @FXML
    private void jmenuHiba(ActionEvent event) {
        System.out.println("Megnyomtam");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
