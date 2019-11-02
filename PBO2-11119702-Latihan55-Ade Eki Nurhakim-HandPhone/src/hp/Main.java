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
public class Main {
    public static void main(String[] args) {
        Android a = new Android();
        
        a.setKeyStore("234ibfd3840fo");
        
        BlackBerry b = new BlackBerry();
        b.setPinBB("BHS249");
        
        WindowsPhone w = new WindowsPhone();
        w.setWindowsStore("UUUQIJWORJ");
    }
}
