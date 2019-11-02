/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

/**
 *
 * @author Ekiw
 */
public class WindowsPhone extends Handphone{
    private String windowsStore;

    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    WindowsPhone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public String getWindowsStore() {
        return windowsStore;
    }

    public void setWindowsStore(String windowsStore) {
        this.windowsStore = windowsStore;
    }
}
